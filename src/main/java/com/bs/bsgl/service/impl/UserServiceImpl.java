package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.IdUtils;
import com.bs.bsgl.mapper.UserDetailMapper;
import com.bs.bsgl.mapper.UserMapper;
import com.bs.bsgl.mapper.UserRoleMapper;
import com.bs.bsgl.pojo.User;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.vo.UserVo;
import com.bs.bsgl.service.UserRoleService;
import com.bs.bsgl.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserDetailMapper userDetailMapper;

    @Override
    public List<UserVo> getUserList(User user) {

        return userMapper.getUserList(user);
    }

    @Override
    public UserVo getUserById(String userId) {
         return userMapper.getUserById(userId);
    }


}
