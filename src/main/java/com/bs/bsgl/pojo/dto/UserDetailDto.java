package com.bs.bsgl.pojo.dto;

import lombok.Data;

/**
 * @author yutongyu
 * @date 2022-12-07 13:18
 * @description:yty
 */
@Data
public class UserDetailDto {
    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 部门编号
     */
    private String departmentId;

    /**
     * 角色 ID
     */
    private String roleId;

}

