package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.User;
import com.bs.bsgl.pojo.UserRes;
import com.bs.bsgl.pojo.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserResMapper {
    List<Integer> getlist(String userId);
}
