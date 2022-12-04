package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.UUID;
import com.bs.bsgl.mapper.FRoomMapper;
import com.bs.bsgl.pojo.FRoom;
import com.bs.bsgl.service.FRoomService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FRoomServiceImpl implements FRoomService {

    @Autowired
    FRoomMapper FRoomMapper;


    @Override
    public List<FRoom> getFRoomList(FRoom data) {
        return FRoomMapper.getFRoomList(data);
    }

    @Override
    public AjaxResult addFRoom(FRoom data) {
        if (data == null) {
            return AjaxResult.error("请添加数据");
        }
        if (StringUtils.isEmpty(data.getGid())) {
            data.setGid(UUID.randomUUID().toString().replace("-",""));
        }
        FRoom dataById = FRoomMapper.getFRoomById(data.getGid());
        if (dataById != null) {
            return updateFRoomById(data);
        }
        return AjaxResult.success(FRoomMapper.addFRoom(data));
    }

    @Override
    public AjaxResult updateFRoomById(FRoom data) {
        if (StringUtils.isEmpty(data.getGid())) {
            return AjaxResult.error("请选择GID");
        }
        FRoom dataById = FRoomMapper.getFRoomById(data.getGid());
        if (dataById == null) {
            return AjaxResult.error("GID不存在");
        }
        return AjaxResult.success(FRoomMapper.updateFRoomById(data));
    }

    @Override
    public AjaxResult selectById(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择查询GID");
        }
        return AjaxResult.success(FRoomMapper.getFRoomById(gid));
    }

    @Override
    public AjaxResult delete(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("请选择删除GID");
        }
        return AjaxResult.success(FRoomMapper.deleteById(gid));
    }
}
