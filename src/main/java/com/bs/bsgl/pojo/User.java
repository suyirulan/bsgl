package com.bs.bsgl.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author yutongyu
 * @date 2022-12-07 13:14
 * @description:yty
 */
@Data
public class User {
    private static final long serialVersionUID = 1L;

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
     * 登录账号
     */
    private String account;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 性别: -1-未知/未设置；0-女；1-男；
     */
    private Integer sex;

    /**
     * 头像
     */
    private String picture;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date updateTime;

    /**
     * 创建者
     */
    private Integer createBy;

    /**
     * 更新者
     */
    private Integer updateBy;

    /**
     * 人脸同步标志（1: 图片为空或解析失败 2: 未发现人脸特征 4: IC卡已存在）5:正常
     */
    private Integer faceless;

    /**
     * 签字图片
     */
    private String signpicture;

    /**
     * 铁路系统唯一标识
     */
    private String userSingleCode;

    /**
     * 是否排班管理员：0-否；1-是；
     */
    private Integer isDutyAdmin;

    private String departmentId;

    private Integer isBinding;

}
