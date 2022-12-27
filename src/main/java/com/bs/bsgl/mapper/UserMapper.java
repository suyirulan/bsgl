package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.User;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.dto.UserDetailDto;
import com.bs.bsgl.pojo.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getUserList(User user);

    int updateBinding(UserDetailDto userDetailDto);

    UserVo getUserById(String userId);

    int deleteBinding(UserDetailDto userDetailDto);
}
