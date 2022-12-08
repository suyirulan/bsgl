package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.FKks;
import com.bs.bsgl.pojo.FKksReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FKksMapper {

    List<FKks> getFKksList(FKks fKks);

    FKks getFKksById(String gid);

    int addFKks(FKksReq fKks);

    int updateFKksById(FKksReq fKks);

    int deleteById(String gid);
}
