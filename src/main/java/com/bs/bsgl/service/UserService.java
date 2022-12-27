package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.User;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.vo.UserVo;

import java.util.List;

public interface UserService {

    List<User> getUserList(User user);

    UserVo getUserById(String userId);
}
