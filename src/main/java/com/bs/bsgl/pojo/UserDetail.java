package com.bs.bsgl.pojo;

import lombok.Data;

/**
 * @author yutongyu
 * @date 2022-12-07 13:18
 * @description:yty
 */
@Data
public class UserDetail {
    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 传真
     */
    private String fax;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 机构ID
     */
    private Integer organizationId;

    /**
     * 部门编号
     */
    private String departmentId;

    /**
     * 职务编号
     */
    private Integer dutyId;

    /**
     * 住址
     */
    private String address;

    /**
     * 学历
     */
    private String education;

    /**
     * 国籍
     */
    private String nation;

    /**
     * 入职时间
     */
    private String hireDate;

    /**
     * 用户头衔（市委书记、副书记等）
     */
    private String title;

    /**
     * 角色 ID
     */
    private String roleId;

    /**
     * 职务名称
     */
    private String dutyName;

    /**
     * 籍贯
     */
    private String hometown;

    /**
     * 民族
     */
    private String ethnic;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 政治面貌
     */
    private String politicalStatus;

    /**
     * 入党时间
     */
    private String partyTime;

    /**
     * 办公电话
     */
    private String officePhone;

    /**
     * 备注
     */
    private String remark;

    /**
     * 移动电话2
     */
    private String phoneTwo;

    /**
     * 家/宿舍电话
     */
    private String homePhone;

    /**
     * 聊天分组（及时信息）
     */
    private String groupName;

    /**
     * 应急岗位ID(不是必填)
     */
    private Integer groupId;
}
