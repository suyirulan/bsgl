package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FRoom;
import com.bs.bsgl.pojo.FRoomReq;

import java.util.List;

public interface FRoomService {

    List<FRoom> getFRoomList(FRoom data);

    AjaxResult addFRoom(FRoomReq data);

    AjaxResult updateFRoomById(FRoomReq data);

    AjaxResult selectById(String gid);

    AjaxResult delete(String gid);
}
