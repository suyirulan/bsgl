package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.FRoom;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.vo.UserRoleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleMapper {

    List<UserRole> getRoleList(UserRole role);

    UserRoleVo getRoleById(String id);

    int addRole(UserRoleVo role);

    int updateRoleById(UserRoleVo role);

    int deleteById(String id);
}
