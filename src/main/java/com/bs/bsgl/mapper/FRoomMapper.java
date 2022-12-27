package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.FRoom;
import com.bs.bsgl.pojo.FRoomReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FRoomMapper {

    List<FRoom> getFRoomList(FRoom FRoom);

    FRoom getFRoomById(String gid);

    int addFRoom(FRoomReq FRoom);

    int updateFRoomById(FRoomReq FRoom);

    int deleteById(String gid);
}
