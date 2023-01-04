package com.bs.bsgl.service;

import com.bs.bsgl.pojo.User;
import com.bs.bsgl.pojo.UserRes;
import com.bs.bsgl.pojo.vo.UserVo;

import java.util.List;

public interface UserResService {

    List<Integer> getlist(String userId);
}
