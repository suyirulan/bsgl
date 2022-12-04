package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.UUID;
import com.bs.bsgl.mapper.FIsolationMapper;
import com.bs.bsgl.pojo.FIsolation;
import com.bs.bsgl.pojo.FKks;
import com.bs.bsgl.service.FIsolationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FIsolationServiceImpl implements FIsolationService {

    @Autowired
    FIsolationMapper FIsolationMapper;


    @Override
    public List<FIsolation> getFIsolationList(FIsolation data) {
        return FIsolationMapper.getFIsolationList(data);
    }

    @Override
    public AjaxResult addFIsolation(FIsolation data) {
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
        return AjaxResult.success(FIsolationMapper.addFIsolation(data));
    }

    @Override
    public AjaxResult updateFIsolationById(FIsolation data) {
        if (StringUtils.isEmpty(data.getGid())) {
            return AjaxResult.error("请选择GID");
        }
        FIsolation dataById = FIsolationMapper.getFIsolationById(data.getGid());
        if (dataById == null) {
            return AjaxResult.error("GID不存在");
        }
        return AjaxResult.success(FIsolationMapper.updateFIsolationById(data));
    }

    @Override
    public AjaxResult selectById(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择查询GID");
        }
        return AjaxResult.success(FIsolationMapper.getFIsolationById(gid));
    }

    @Override
    public AjaxResult delete(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择删除GID");
        }
        return AjaxResult.success(FIsolationMapper.deleteById(gid));
    }
}
