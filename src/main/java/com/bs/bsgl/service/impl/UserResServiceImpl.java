package com.bs.bsgl.service.impl;

import com.bs.bsgl.mapper.UserResMapper;
import com.bs.bsgl.pojo.User;
import com.bs.bsgl.pojo.UserRes;
import com.bs.bsgl.pojo.vo.UserVo;
import com.bs.bsgl.service.UserResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yutongyu
 * @date 2023-01-04 13:54
 * @description:
 */
@Service
public class UserResServiceImpl implements UserResService {

    @Autowired
    UserResMapper userResMapper;

    @Override
    public List<Integer> getlist(String userId) {
        return userResMapper.getlist(userId);
    }
}
