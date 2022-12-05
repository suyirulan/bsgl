package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.FKks;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FKksMapper {

    List<FKks> getFKksList(FKks fKks);

    FKks getFKksById(String gid);

    int addFKks(FKks fKks);

    int updateFKksById(FKks fKks);

    int deleteById(String gid);
}
