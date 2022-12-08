package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.UserDepartment;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.vo.UserDepartmentVo;

import java.util.List;

public interface UserDeaprtmentService {

    List<UserDepartment> getDepartmentList(UserDepartment department);

    UserDepartmentVo getDepartmentById(String departmentId);
}
