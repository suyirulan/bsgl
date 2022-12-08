package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.UUID;
import com.bs.bsgl.mapper.FConduitMapper;
import com.bs.bsgl.mapper.FSignangeMapper;
import com.bs.bsgl.pojo.*;
import com.bs.bsgl.service.FConduitService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FConduitServiceImpl implements FConduitService {

    @Autowired
    FConduitMapper FConduitMapper;

    @Autowired
    FSignangeMapper fSignangeMapper;


    @Override
    public List<FConduit> getFConduitList(FConduit data) {
        return FConduitMapper.getFConduitList(data);
    }

    @Override
    public AjaxResult addFConduit(FConduitReq data) {
        if (data == null) {
            return AjaxResult.error("请添加数据");
        }
        if (StringUtils.isEmpty(data.getGid())) {
            data.setGid(UUID.randomUUID().toString().replace("-",""));
        }
        FConduit dataById = FConduitMapper.getFConduitById(data.getGid());
        if (dataById != null) {
            return updateFConduitById(data);
        }

        //插入主表sign
        FSignange fSignange = new FSignange();
        fSignange.setGid(UUID.randomUUID().toString().replace("-",""));
        fSignange.setSignid(data.getGid());
        fSignange.setSigntype("C");
        fSignange.setIsscaffolding(data.getIsscaffolding());
        fSignange.setDefecttype(data.getDefecttype());
        fSignange.setMaterial(data.getMaterial());
        fSignange.setCreateZ("");
        fSignange.setCreateR("");
        fSignange.setCreateTime(new Date().toString());
        fSignange.setLiabilityZ(data.getLiabilityZ());
        fSignange.setLiabilityQ(data.getLiabilityQ());
        fSignangeMapper.addFSignange(fSignange);


        return AjaxResult.success(FConduitMapper.addFConduit(data));
    }

    @Override
    public AjaxResult updateFConduitById(FConduitReq data) {
        if (StringUtils.isEmpty(data.getGid())) {
            return AjaxResult.error("请选择GID");
        }
        FConduit dataById = FConduitMapper.getFConduitById(data.getGid());
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

        return AjaxResult.success(FConduitMapper.updateFConduitById(data));
    }

    @Override
    public AjaxResult selectById(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择查询GID");
        }
        //查询FSign信息
        FSignange fSignange = fSignangeMapper.getBySignid(gid);

        //查询FKks信息
        FConduit fConduit = FConduitMapper.getFConduitById(gid);

        FConduitReq req = new FConduitReq();

        req.setDefecttype(fSignange.getDefecttype());
        req.setMaterial(fSignange.getMaterial());
        req.setLiabilityZ(fSignange.getLiabilityZ());
        req.setLiabilityQ(fSignange.getLiabilityQ());
        req.setGid(fConduit.getGid());
        req.setConduitid(fConduit.getConduitid());
        req.setConduitname(fConduit.getConduitname());
        req.setMedium(fConduit.getMedium());
        req.setFlowTo(fConduit.getFlowTo());
        req.setPipeDiameter(fConduit.getPipeDiameter());
        req.setHeatPreservation(fConduit.getHeatPreservation());
        req.setHangLength(fConduit.getHangLength());
        req.setWorkshop(fConduit.getWorkshop());
        req.setAzimuthLately(fConduit.getAzimuthLately());
        req.setAzimuthSymbolic(fConduit.getAzimuthSymbolic());

        return AjaxResult.success(req);
    }

    @Override
    public AjaxResult delete(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择删除GID");
        }
        return AjaxResult.success(FConduitMapper.deleteById(gid));
    }
}
