package com.bs.bsgl.pojo.vo;

import lombok.Data;

import java.util.List;

/**
 * @author yutongyu
 * @date 2022-12-08 15:34
 * @description:
 */
@Data
public class UserListVo {

    private String id;
    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 部门名称
     */
    private String departmentName;

    private List<Integer> responsibilityValues;
}
