package com.bs.bsgl.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author yutongyu
 * @date 2022-12-07 10:55
 * @description:yty
 */
@Data
public class UserRole {
    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 名称
     */
    private String roleName;

    private String remark;

    private Integer status;

    /**
     * 铁路角色类型
     */
    private Integer roleType;

    private Integer cityRoleType;
}
