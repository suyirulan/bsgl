package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.FConduit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FConduitMapper {

    List<FConduit> getFConduitList(FConduit FConduit);

    FConduit getFConduitById(String gid);

    int addFConduit(FConduit FConduit);

    int updateFConduitById(FConduit FConduit);

    int deleteById(String gid);
}
