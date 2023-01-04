package com.bs.bsgl.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author yutongyu
 * @date 2022-12-07 13:14
 * @description:yty
 */
@Data
public class UserVo {
    private static final long serialVersionUID = 1L;

    private String userId;

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 用户名
     */
    private String userName;

    private String departmentId;

    private List<Integer> responsibilityValues;
}
