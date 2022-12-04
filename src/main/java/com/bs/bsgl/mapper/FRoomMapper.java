package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.FRoom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FRoomMapper {

    List<FRoom> getFRoomList(FRoom FRoom);

    FRoom getFRoomById(String gid);

    int addFRoom(FRoom FRoom);

    int updateFRoomById(FRoom FRoom);

    int deleteById(String gid);
}
