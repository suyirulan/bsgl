package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.IdUtils;
import com.bs.bsgl.mapper.UserDepartmentMapper;
import com.bs.bsgl.mapper.UserRoleMapper;
import com.bs.bsgl.pojo.UserDepartment;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.vo.UserDepartmentVo;
import com.bs.bsgl.service.UserDeaprtmentService;
import com.bs.bsgl.service.UserRoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDepartmentServiceImpl implements UserDeaprtmentService {

    @Autowired
    UserDepartmentMapper userDepartmentMapper;

    @Override
    public List<UserDepartment> getDepartmentList(UserDepartment department) {
        return userDepartmentMapper.getDepartmentList(department);
    }

    @Override
    public UserDepartmentVo getDepartmentById(String departmentId) {
        return userDepartmentMapper.getDepartmentById(departmentId);
    }


}
