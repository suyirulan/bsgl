package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.UUID;
import com.bs.bsgl.mapper.FConduitMapper;
import com.bs.bsgl.pojo.FConduit;
import com.bs.bsgl.pojo.FKks;
import com.bs.bsgl.service.FConduitService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FConduitServiceImpl implements FConduitService {

    @Autowired
    FConduitMapper FConduitMapper;


    @Override
    public List<FConduit> getFConduitList(FConduit data) {
        return FConduitMapper.getFConduitList(data);
    }

    @Override
    public AjaxResult addFConduit(FConduit data) {
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
        return AjaxResult.success(FConduitMapper.addFConduit(data));
    }

    @Override
    public AjaxResult updateFConduitById(FConduit data) {
        if (StringUtils.isEmpty(data.getGid())) {
            return AjaxResult.error("请选择GID");
        }
        FConduit dataById = FConduitMapper.getFConduitById(data.getGid());
        if (dataById == null) {
            return AjaxResult.error("GID不存在");
        }
        return AjaxResult.success(FConduitMapper.updateFConduitById(data));
    }

    @Override
    public AjaxResult selectById(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择查询GID");
        }
        return AjaxResult.success(FConduitMapper.getFConduitById(gid));
    }

    @Override
    public AjaxResult delete(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择删除GID");
        }
        return AjaxResult.success(FConduitMapper.deleteById(gid));
    }
}
