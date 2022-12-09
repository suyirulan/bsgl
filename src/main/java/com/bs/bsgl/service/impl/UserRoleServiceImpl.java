package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.IdUtils;
import com.bs.bsgl.core.domain.UUID;
import com.bs.bsgl.mapper.FRoomMapper;
import com.bs.bsgl.mapper.UserDetailMapper;
import com.bs.bsgl.mapper.UserMapper;
import com.bs.bsgl.mapper.UserRoleMapper;
import com.bs.bsgl.pojo.FRoom;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.dto.UserDetailDto;
import com.bs.bsgl.pojo.vo.UserRoleVo;
import com.bs.bsgl.service.FRoomService;
import com.bs.bsgl.service.UserRoleService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleMapper userRoleMapper;

    @Autowired
    UserDetailMapper userDetailMapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserRole> getRoleList(UserRole role) {
        return userRoleMapper.getRoleList(role);
    }

    @Override
    public AjaxResult getRoleById(String id) {
        if (StringUtils.isEmpty(id)) {
            return AjaxResult.error("请选择查询ID");
        }
        return AjaxResult.success(userRoleMapper.getRoleById(id));
    }

    @Override
    public AjaxResult addRole(UserRoleVo role) {
        if (StringUtils.isEmpty(role.getRoleCode())){
            return  AjaxResult.error("请输入角色编号");
        }
        if (StringUtils.isEmpty(role.getRoleName())){
            return  AjaxResult.error("请输入角色名称");
        }
        String uuid = IdUtils.simpleUUID();
        role.setRoleId(uuid);
        return AjaxResult.success(userRoleMapper.addRole(role));
    }

    @Override
    public AjaxResult updateRoleById(UserRoleVo role) {
        if (StringUtils.isEmpty(role.getRoleId())) {
            return AjaxResult.error("请选择ID");
        }
        UserRoleVo roleById = userRoleMapper.getRoleById(role.getRoleId());
        if (roleById == null) {
            return AjaxResult.error("ID不存在");
        }
        return AjaxResult.success(userRoleMapper.updateRoleById(role));
    }

    @Override
    @Transactional
    public AjaxResult delete(String id) {
        if (StringUtils.isEmpty(id)) {
            return AjaxResult.error("请选择删除ID");
        }

        List<UserDetailDto> userDetailDtos = userDetailMapper.selDetail(id);
        for (UserDetailDto userDetailDto:userDetailDtos){
            userMapper.deleteBinding(userDetailDto);
        }

        userDetailMapper.deleteByRoleId(id);

        return AjaxResult.success(userRoleMapper.deleteById(id));
    }
}
