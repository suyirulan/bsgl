package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.IdUtils;
import com.bs.bsgl.mapper.FRoomMapper;
import com.bs.bsgl.mapper.UserDetailMapper;
import com.bs.bsgl.mapper.UserMapper;
import com.bs.bsgl.pojo.User;
import org.apache.commons.lang3.StringUtils;
import com.bs.bsgl.pojo.dto.UserDetailDto;
import com.bs.bsgl.service.UserDetailService;
import com.bs.bsgl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    UserDetailMapper userDetailMapper;

    @Autowired
    UserMapper userMapper;

    /*@Override
    @Transactional
    public AjaxResult saveUser(UserDetailDto detailDto) {
        if (detailDto.getRoleId()==null){
            AjaxResult.error("角色id不能为空");
        }
        if (detailDto.getUserId()==null){
            AjaxResult.error("用户id不能为空");
        }
        if (detailDto.getDepartmentId()==null){
            AjaxResult.error("部门id不能为空");
        }
        userMapper.updateBinding(detailDto);
        String uuid = IdUtils.simpleUUID();
        detailDto.setId(uuid);

        return AjaxResult.success(userDetailMapper.saveUser(detailDto));
    }*/

    @Override
    public AjaxResult saveUser(List<UserDetailDto> detailDto) {
        for (UserDetailDto userDetailDto : detailDto){
            if (userDetailDto.getRoleId()==null){
                AjaxResult.error("角色id不能为空");
            }
            if (userDetailDto.getUserId()==null){
                AjaxResult.error("用户id不能为空");
            }
            if (userDetailDto.getDepartmentId()==null){
                AjaxResult.error("部门id不能为空");
            }
            userMapper.updateBinding(userDetailDto);
            String uuid = IdUtils.simpleUUID();
            userDetailDto.setId(uuid);
            userDetailMapper.saveUser(userDetailDto);
        }
        return AjaxResult.success("添加成功");
    }

    @Override
    public List<UserDetailDto> getUserList(String roleId) {

        return userDetailMapper.getUserList(roleId);
    }

    @Override
    public AjaxResult deleteById(String id) {
        if (StringUtils.isEmpty(id)) {
            return AjaxResult.error("请选择删除ID");
        }
        UserDetailDto userDetailDto = userDetailMapper.selUserId(id);
        userMapper.deleteBinding(userDetailDto);
        return AjaxResult.success(userDetailMapper.deleteById(id));

    }

}
