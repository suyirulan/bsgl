package com.bs.bsgl.pojo.vo;

import lombok.Data;

/**
 * @author yutongyu
 * @date 2022-12-07 10:55
 * @description:yty
 */
@Data
public class UserRoleVo {
    private static final long serialVersionUID = 1L;

    private String roleId;

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 名称
     */
    private String roleName;

    private String remark;

}
