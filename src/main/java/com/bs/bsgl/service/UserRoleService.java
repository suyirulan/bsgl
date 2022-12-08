package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FRoom;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.vo.UserRoleVo;

import java.util.List;

public interface UserRoleService {

    List<UserRole> getRoleList(UserRole role);

    AjaxResult getRoleById(String id);

    AjaxResult addRole(UserRoleVo role);

    AjaxResult updateRoleById(UserRoleVo role);

    AjaxResult delete(String id);
}
