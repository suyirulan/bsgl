package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FRoom;
import com.bs.bsgl.pojo.User;
import com.bs.bsgl.pojo.UserDepartment;
import com.bs.bsgl.pojo.UserRole;
import com.bs.bsgl.pojo.dto.UserAddDto;
import com.bs.bsgl.pojo.dto.UserDetailDto;
import com.bs.bsgl.pojo.vo.UserDepartmentVo;
import com.bs.bsgl.pojo.vo.UserListVo;
import com.bs.bsgl.pojo.vo.UserRoleVo;
import com.bs.bsgl.pojo.vo.UserVo;
import com.bs.bsgl.service.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yutongyu
 * @date 2022-12-07 13:21
 * @description:
 */
@Controller
@RequestMapping("/signmanage/sign/UserRole")
public class UserRoleController {

    @Autowired
    UserRoleService userRoleService;

    @Autowired
    UserDeaprtmentService userDeaprtmentService;

    @Autowired
    UserService userService;

    @Autowired
    UserDetailService userDetailService;

    @RequestMapping("index")
    public String index() {
        return "/signmanage/sign/Role_index";
    }

    @GetMapping("list")
    @ResponseBody
    public AjaxResult getRoleList(UserRole role){
        return AjaxResult.success(userRoleService.getRoleList(role));
    }

    @GetMapping("getById/{id}")
    @ResponseBody
    public AjaxResult getRoleById(@PathVariable String id){
        return userRoleService.getRoleById(id);
    }

    @PostMapping("Add")
    @ResponseBody
    public AjaxResult addRole(UserRoleVo role) {
        return userRoleService.addRole(role);
    }

    @PostMapping("Update")
    @ResponseBody
    public AjaxResult updateRole(UserRoleVo role) {
        return userRoleService.updateRoleById(role);
    }

    @PostMapping("delete/{id}")
    @ResponseBody
    public AjaxResult delete(@PathVariable String id) {
        return userRoleService.delete(id);
    }

    //获取部门列表
    @GetMapping("DepartmentList")
    @ResponseBody
    public AjaxResult getDepartmentList(UserDepartment department){
        return AjaxResult.success(userDeaprtmentService.getDepartmentList(department));
    }

    //获取人员列表
    @GetMapping("UserList")
    @ResponseBody
    public AjaxResult getUserList(User user){
        return AjaxResult.success(userService.getUserList(user));
    }

    //关联用户
    @PostMapping("BindingUser")
    @ResponseBody
    public AjaxResult BindingUser(@RequestBody UserAddDto userAddDto){
        if (StringUtils.isEmpty(userAddDto.getRoleId())) {
            return AjaxResult.error("请选择角色");
        }
        List<UserDetailDto> detailDto =  new ArrayList<>();
        userAddDto.getUserIds().forEach(item->{
            UserDetailDto userDetailDto = new UserDetailDto();
            userDetailDto.setRoleId(userAddDto.getRoleId());
            userDetailDto.setUserId(item);
            userDetailDto.setDepartmentId(userAddDto.getDepartmentId());
            detailDto.add(userDetailDto);
        });
        userDetailService.saveUser(detailDto);
        return AjaxResult.success() ;
    }

    //获取关联用户
    @GetMapping("Associated_Users")
    @ResponseBody
    public AjaxResult AssociatedUsers(String roleId){
        List<UserDetailDto> userList = userDetailService.getUserList(roleId);
        ArrayList<UserListVo> list = new ArrayList<>();
        for (UserDetailDto detailDto: userList){
            UserListVo userListVo = new UserListVo();
            UserVo userById = userService.getUserById(detailDto.getUserId());
            UserDepartmentVo departmentById = userDeaprtmentService.getDepartmentById(detailDto.getDepartmentId());
            userListVo.setId(detailDto.getId());
            userListVo.setUserCode(userById.getUserCode());
            userListVo.setUserName(userById.getUserName());
            userListVo.setDepartmentName(departmentById.getDepartmentName());
            list.add(userListVo);
        }

        return AjaxResult.success(list);
    }

    //删除关联用户
    @PostMapping("DeleteUser/{id}")
    @ResponseBody
    public AjaxResult DeleteUser(@PathVariable  String id){
        return userDetailService.deleteById(id);
    }
}

