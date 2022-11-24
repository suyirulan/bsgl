package com.bs.bsgl.service;

import com.bs.bsgl.pojo.BDataCba;
import com.bs.bsgl.pojo.BDataRoom;

import java.util.List;

public interface BDataCbaService {

    List<BDataRoom> getBDataRoomList(BDataRoom dataCba);

    Boolean addDataRoom(BDataRoom dataRoom);

    Boolean updateDataRoom(BDataRoom dataRoom);

    Boolean delete(BDataRoom dataRoom);
}
