package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.UserDepartment;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.vo.UserDepartmentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDepartmentMapper {

    List<UserDepartment> getDepartmentList(UserDepartment department);

    UserDepartmentVo getDepartmentById(String departmentId);
}
