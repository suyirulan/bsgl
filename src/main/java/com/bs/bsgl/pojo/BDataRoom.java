package com.bs.bsgl.pojo;

import com.bs.bsgl.core.domain.poi.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BDataRoom {

    private static final long serialVersionUID = 1L;
    @Excel(name = "房间编号",width = 20,height = 20)
    private String roomno;
    @Excel(name = "房间说明",width = 40,height = 20)
    private String roomdis;
    @Excel(name = "房间名称",width = 20,height = 20)
    private String roomname;
    @Excel(name = "职责区",width = 10,height = 20)
    private String dutyArea;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //@Excel(name = "最后修改时间",dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lupTime;
    //@Excel(name = "最后修改人")
    private String editUser;

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getRoomdis() {
        return roomdis;
    }

    public void setRoomdis(String roomdis) {
        this.roomdis = roomdis;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getDutyArea() {
        return dutyArea;
    }

    public void setDutyArea(String dutyArea) {
        this.dutyArea = dutyArea;
    }

    public Date getLupTime() {
        return lupTime;
    }

    public void setLupTime(Date lupTime) {
        this.lupTime = lupTime;
    }

    public String getEditUser() {
        return editUser;
    }

    public void setEditUser(String editUser) {
        this.editUser = editUser;
    }

    @Override
    public String toString() {
        return "BDataRoom [roomno=" + roomno + ", roomdis=" + roomdis + ", roomname=" + roomname + ", dutyArea=" + dutyArea + ", lupTime=" + lupTime + ", editUser=" + editUser +  "]";
    }
}
