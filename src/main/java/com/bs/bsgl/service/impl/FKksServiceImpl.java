package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.UUID;
import com.bs.bsgl.mapper.FKksMapper;
import com.bs.bsgl.mapper.FSignangeMapper;
import com.bs.bsgl.pojo.FKks;
import com.bs.bsgl.pojo.FKksReq;
import com.bs.bsgl.pojo.FSignange;
import com.bs.bsgl.service.FKksService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FKksServiceImpl implements FKksService {

    @Autowired
    FKksMapper FKksMapper;

    @Autowired
    FSignangeMapper fSignangeMapper;


    @Override
    public List<FKks> getFKksList(FKks data) {
        return FKksMapper.getFKksList(data);
    }

    @Override
    public AjaxResult addFKks(FKksReq data) {
        if (data == null) {
            return AjaxResult.error("请添加数据");
        }
        if (StringUtils.isEmpty(data.getGid())) {
            data.setGid(UUID.randomUUID().toString().replace("-",""));
        }
        FKks dataById = FKksMapper.getFKksById(data.getGid());
        if (dataById != null) {
            return updateFKksById(data);
        }
        //插入主表sign
        FSignange fSignange = new FSignange();
        fSignange.setGid(UUID.randomUUID().toString().replace("-",""));
        fSignange.setSignid(data.getGid());
        fSignange.setSigntype("A");
        fSignange.setIsscaffolding(data.getIsscaffolding());
        fSignange.setDefecttype(data.getDefecttype());
        fSignange.setMaterial(data.getMaterial());
        fSignange.setCreateZ("");
        fSignange.setCreateR("");
        fSignange.setCreateTime(new Date().toString());
        fSignange.setLiabilityZ(data.getLiabilityZ());
        fSignange.setLiabilityQ(data.getLiabilityQ());
        fSignangeMapper.addFSignange(fSignange);


        return AjaxResult.success(FKksMapper.addFKks(data));
    }

    @Override
    public AjaxResult updateFKksById(FKksReq data) {
        if (StringUtils.isEmpty(data.getGid())) {
            return AjaxResult.error("请选择GID");
        }
        FKks dataById = FKksMapper.getFKksById(data.getGid());
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

        return AjaxResult.success(FKksMapper.updateFKksById(data));
    }

    @Override
    public AjaxResult selectById(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择查询GID");
        }
        //查询FSign信息
        FSignange fSignange = fSignangeMapper.getBySignid(gid);

        //查询FKks信息
        FKks fKks = FKksMapper.getFKksById(gid);

        FKksReq req = new FKksReq();

        req.setDefecttype(fSignange.getDefecttype());
        req.setMaterial(fSignange.getMaterial());
        req.setLiabilityZ(fSignange.getLiabilityZ());
        req.setLiabilityQ(fSignange.getLiabilityQ());
        req.setGid(fKks.getGid());
        req.setLength(fKks.getLength());
        req.setWidth(fKks.getWidth());
        req.setColor(fKks.getColor());
        req.setoColor(fKks.getoColor());
        req.setSignangeContent(fKks.getSignangeContent());
        req.setPosition(fKks.getPosition());
        req.setsCount(fKks.getsCount());
        req.setRemark(fKks.getRemark());
        req.setIscc1(fKks.getIscc1());

        return AjaxResult.success(req);
    }

    @Override
    public AjaxResult delete(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择删除GID");
        }
        return AjaxResult.success(FKksMapper.deleteById(gid));
    }
}
