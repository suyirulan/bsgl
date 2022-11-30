package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.mapper.BDataRoomMapper;
import com.bs.bsgl.pojo.BDataRoom;
import com.bs.bsgl.service.BDataCbaService;
import com.bs.bsgl.service.BDataRoomService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BDataRoomServiceImpl implements BDataRoomService {

    @Autowired
    BDataRoomMapper roomMapper;


    @Override
    public List<BDataRoom> getBDataRoomList(BDataRoom dataCba) {
        return roomMapper.getDataRoomAll(dataCba);
    }

    @Override
    public AjaxResult addDataRoom(BDataRoom dataRoom) {
        if (StringUtils.isEmpty(dataRoom.getRoomno())) {
            return AjaxResult.error("请添加房间编号");
        }
        BDataRoom dataDataRoomById = roomMapper.getDataRoomById(dataRoom.getRoomno());
        if (dataDataRoomById != null) {
            return updateDataRoom(dataRoom);
        }
        dataRoom.setLupTime(new Date());
        return AjaxResult.success(roomMapper.addBDataRoom(dataRoom));
    }

    @Override
    public AjaxResult updateDataRoom(BDataRoom dataRoom) {
        if (dataRoom == null || StringUtils.isEmpty(dataRoom.getRoomno())) {
            return AjaxResult.error("请选择房间编号");
        }
        BDataRoom dataDataRoomById = roomMapper.getDataRoomById(dataRoom.getRoomno());
        if (dataDataRoomById == null) {
            return AjaxResult.error("房间编号不存在");
        }
        dataRoom.setLupTime(new Date());
        return AjaxResult.success(roomMapper.updateBDataRoomById(dataRoom));
    }

    @Override
    public AjaxResult selectById(String roomNo) {
        if (StringUtils.isEmpty(roomNo)) {
            return AjaxResult.error("请选择查询目标");
        }
        return AjaxResult.success(roomMapper.getDataRoomById(roomNo));
    }

    @Override
    public AjaxResult delete(String roomNo) {
        if (StringUtils.isEmpty(roomNo)) {
            return AjaxResult.error("请选择删除目标");
        }
        return AjaxResult.success(roomMapper.deleteById(roomNo));
    }
}
