package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.User;
import com.bs.bsgl.pojo.dto.UserDetailDto;

import java.util.List;

public interface UserDetailService {


    AjaxResult saveUser(List<UserDetailDto> detailDto);

    List<UserDetailDto> getUserList(String roleId);

    AjaxResult deleteById(String id);
}
