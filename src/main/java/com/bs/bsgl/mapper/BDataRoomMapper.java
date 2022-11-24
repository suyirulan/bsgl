package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.BDataRoom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BDataRoomMapper {

    List<BDataRoom> getDataRoomAll(BDataRoom dataRoom);

    BDataRoom getDataRoomById(String roomNo);

    int addBDataRoom(BDataRoom room);

    int updateBDataRoomById(BDataRoom room);

    int deleteById(String roomNo);
}
