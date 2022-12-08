package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.UUID;
import com.bs.bsgl.mapper.FIsolationMapper;
import com.bs.bsgl.mapper.FSignangeMapper;
import com.bs.bsgl.pojo.*;
import com.bs.bsgl.service.FIsolationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FIsolationServiceImpl implements FIsolationService {

    @Autowired
    FIsolationMapper FIsolationMapper;

    @Autowired
    FSignangeMapper fSignangeMapper;


    @Override
    public List<FIsolation> getFIsolationList(FIsolation data) {
        return FIsolationMapper.getFIsolationList(data);
    }

    @Override
    public AjaxResult addFIsolation(FIsolationReq data) {
        if (data == null) {
            return AjaxResult.error("请添加数据");
        }
        if (StringUtils.isEmpty(data.getGid())) {
            data.setGid(UUID.randomUUID().toString().replace("-",""));
        }
        FIsolation dataById = FIsolationMapper.getFIsolationById(data.getGid());
        if (dataById != null) {
            return updateFIsolationById(data);
        }
        //插入主表sign
        FSignange fSignange = new FSignange();
        fSignange.setGid(UUID.randomUUID().toString().replace("-",""));
        fSignange.setSignid(data.getGid());
        fSignange.setSigntype("D");
        fSignange.setIsscaffolding(data.getIsscaffolding());
        fSignange.setDefecttype(data.getDefecttype());
        fSignange.setMaterial(data.getMaterial());
        fSignange.setCreateZ("");
        fSignange.setCreateR("");
        fSignange.setCreateTime(new Date().toString());
        fSignange.setLiabilityZ(data.getLiabilityZ());
        fSignange.setLiabilityQ(data.getLiabilityQ());
        fSignangeMapper.addFSignange(fSignange);

        return AjaxResult.success(FIsolationMapper.addFIsolation(data));
    }

    @Override
    public AjaxResult updateFIsolationById(FIsolationReq data) {
        if (StringUtils.isEmpty(data.getGid())) {
            return AjaxResult.error("请选择GID");
        }
        FIsolation dataById = FIsolationMapper.getFIsolationById(data.getGid());
        if (dataById == null) {
            return AjaxResult.error("GID不存在");
        }

        //更新主表sign
        FSignange fSignange = new FSignange();
        fSignange.setSignid(data.getGid());
        fSignange.setIsscaffolding(data.getIsscaffolding());
        fSignange.setDefecttype(data.getDefecttype());
        fSignange.setMaterial(data.getMaterial());
        fSignange.setLiabilityZ(data.getLiabilityZ());
        fSignange.setLiabilityQ(data.getLiabilityQ());
        fSignangeMapper.updateFSignangeBySignid(fSignange);

        return AjaxResult.success(FIsolationMapper.updateFIsolationById(data));
    }

    @Override
    public AjaxResult selectById(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择查询GID");
        }

        //查询FSign信息
        FSignange fSignange = fSignangeMapper.getBySignid(gid);

        //查询FKks信息
        FIsolation fIsolation = FIsolationMapper.getFIsolationById(gid);

        FIsolationReq req = new FIsolationReq();

        req.setDefecttype(fSignange.getDefecttype());
        req.setMaterial(fSignange.getMaterial());
        req.setLiabilityZ(fSignange.getLiabilityZ());
        req.setLiabilityQ(fSignange.getLiabilityQ());
        req.setGid(fIsolation.getGid());
        req.setQuarantinetype(fIsolation.getQuarantinetype());
        req.setUnitNo(fIsolation.getUnitNo());
        req.setIsolationtype(fIsolation.getIsolationtype());
        req.setKksno(fIsolation.getKksno());
        req.setPosition(fIsolation.getPosition());
        req.setDeviceName(fIsolation.getDeviceName());
        req.setState(fIsolation.getState());
        req.setRemark(fIsolation.getRemark());

        return AjaxResult.success(req);
    }

    @Override
    public AjaxResult delete(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择删除GID");
        }
        return AjaxResult.success(FIsolationMapper.deleteById(gid));
    }
}
