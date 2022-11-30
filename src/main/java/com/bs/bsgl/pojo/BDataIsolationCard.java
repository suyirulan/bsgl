package com.bs.bsgl.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BDataIsolationCard {
    private static final long serialVersionUID = 1L;

    private String gid;

    private String isolationType;

    private String unitNo;

    private String cType;

    private String kksno;

    private String postion;

    private String iState;

    private String deviceName;

    private String dutyArea;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lupTime;

    private String editUser;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getIsolationType() {
        return isolationType;
    }

    public void setIsolationType(String isolationType) {
        this.isolationType = isolationType;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public String getKksno() {
        return kksno;
    }

    public void setKksno(String kksno) {
        this.kksno = kksno;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getiState() {
        return iState;
    }

    public void setiState(String iState) {
        this.iState = iState;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
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
        return "BDataIsolationCard[" +
                "gId='" + gid + '\'' +
                ", isolationType='" + isolationType + '\'' +
                ", unitNo='" + unitNo + '\'' +
                ", cType='" + cType + '\'' +
                ", kksNo='" + kksno + '\'' +
                ", postion='" + postion + '\'' +
                ", iState='" + iState + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", dutyArea='" + dutyArea + '\'' +
                ", lupTime=" + lupTime +
                ", editUser='" + editUser + '\'' +
                ']';
    }
}
