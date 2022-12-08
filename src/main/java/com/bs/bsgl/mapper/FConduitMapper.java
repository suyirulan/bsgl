package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.FConduit;
import com.bs.bsgl.pojo.FConduitReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FConduitMapper {

    List<FConduit> getFConduitList(FConduit FConduit);

    FConduit getFConduitById(String gid);

    int addFConduit(FConduitReq FConduit);

    int updateFConduitById(FConduitReq FConduit);

    int deleteById(String gid);
}
