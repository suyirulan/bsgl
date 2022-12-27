package com.bs.bsgl.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author yutongyu
 * @date 2022-12-07 13:09
 * @description:
 */
@Data
public class UserDepartmentVo {
    private static final long serialVersionUID = 1L;

    private String departmentId;

    /**
     * 机构ID
     */
    private Integer organizationId;

    /**
     * 部门名称
     */
    private String departmentName;
}
