package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.FSignange;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FSignangeMapper {

    List<FSignange> getList(FSignange fSignange);

    FSignange getById(String gid);

    FSignange getBySignid(String signid);

    int addFSignange(FSignange FSignange);

    int updateFSignangeBySignid(FSignange FSignange);

    int deleteById(String gid);
}
