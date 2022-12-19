package com.bs.bsgl.pojo;

import com.bs.bsgl.core.domain.poi.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BDataIsolationCard {
    private static final long serialVersionUID = 1L;
    //@Excel(name = "id")
    private String gid;
    @Excel(name = "隔离类型",width = 20,height = 20)
    private String isolationType;
    @Excel(name = "机组号",width = 10,height = 20)
    private String unitNo;
    @Excel(name = "类型",width = 10,height = 20)
    private String cType;
    @Excel(name = "KKS码",width = 20,height = 20)
    private String kksno;
    @Excel(name = "位置",width = 20,height = 20)
    private String postion;
    @Excel(name = "状态",width = 10,height = 20)
    private String iState;
    @Excel(name = "设备名称",width = 20,height = 20)
    private String deviceName;
    @Excel(name = "所属责任区",width = 10,height = 20)
    private String dutyArea;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    //@Excel(name = "最后修改时间",dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lupTime;
    //@Excel(name = "最后修改人")
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
