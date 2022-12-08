package com.bs.bsgl.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author yutongyu
 * @date 2022-12-07 13:09
 * @description:
 */
@Data
public class UserDepartment {
    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 机构ID
     */
    private Integer organizationId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 上级菜单ID
     */
    private Integer pid;

    /**
     * 上级菜单名称
     */
    private String pname;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 负责人
     */
    private String principal;

    /**
     * 负责人电话
     */
    private String principaltell;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date updateTime;

    /**
     * 类型
     */
    private Integer type;
}
