package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.UUID;
import com.bs.bsgl.mapper.FKksMapper;
import com.bs.bsgl.pojo.FKks;
import com.bs.bsgl.service.FKksService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FKksServiceImpl implements FKksService {

    @Autowired
    FKksMapper FKksMapper;


    @Override
    public List<FKks> getFKksList(FKks data) {
        return FKksMapper.getFKksList(data);
    }

    @Override
    public AjaxResult addFKks(FKks data) {
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
        return AjaxResult.success(FKksMapper.addFKks(data));
    }

    @Override
    public AjaxResult updateFKksById(FKks data) {
        if (StringUtils.isEmpty(data.getGid())) {
            return AjaxResult.error("请选择GID");
        }
        FKks dataById = FKksMapper.getFKksById(data.getGid());
        if (dataById == null) {
            return AjaxResult.error("GID不存在");
        }
        return AjaxResult.success(FKksMapper.updateFKksById(data));
    }

    @Override
    public AjaxResult selectById(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择查询GID");
        }
        return AjaxResult.success(FKksMapper.getFKksById(gid));
    }

    @Override
    public AjaxResult delete(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择删除GID");
        }
        return AjaxResult.success(FKksMapper.deleteById(gid));
    }
}
