package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.dto.UserDetailDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDetailMapper {

    int saveUser(UserDetailDto detailDto);

    List<UserDetailDto> getUserList(String roleId);

    int deleteById(String id);

    UserDetailDto selUserId(String id);

    int deleteByRoleId(String id);

    List<UserDetailDto> selDetail(String id);
}
