package com.bs.bsgl.pojo.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserAddDto {

    private String roleId;

    private List<String> userIds;

    private String departmentId;
}
