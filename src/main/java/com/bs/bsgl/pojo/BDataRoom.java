package com.bs.bsgl.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BDataRoom {

    private static final long serialVersionUID = 1L;

    private String roomno;

    private String roomdis;

    private String roomname;

    private String dutyArea;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lupTime;

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
