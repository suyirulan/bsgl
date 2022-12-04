package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.FIsolation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FIsolationMapper {

    List<FIsolation> getFIsolationList(FIsolation FIsolation);

    FIsolation getFIsolationById(String gid);

    int addFIsolation(FIsolation FIsolation);

    int updateFIsolationById(FIsolation FIsolation);

    int deleteById(String gid);
}
