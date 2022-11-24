package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.BDataRoom;

import java.util.List;

public interface BDataRoomService {

    List<BDataRoom> getBDataRoomList(BDataRoom dataCba);

    AjaxResult addDataRoom(BDataRoom dataRoom);

    AjaxResult updateDataRoom(BDataRoom dataRoom);

    AjaxResult selectById(String roomNo);

    AjaxResult delete(String roomNo);
}
