package com.bs.bsgl.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BDataPipeline {

    private static final long serialVersionUID = 1L;

    private String pipNo;

    private String pipName;

    private String medium;

    private Integer flowTo;

    private Integer pipeDiameter;

    private String eatPreservation;

    private Integer hangLength;

    private String workShop;

    private String azimuthSymbolic;

    private String azimuthLately;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lupTime;

    private String editUser;


    public String getPipNo() {
        return pipNo;
    }

    public void setPipNo(String pipNo) {
        this.pipNo = pipNo;
    }

    public String getPipName() {
        return pipName;
    }

    public void setPipName(String pipName) {
        this.pipName = pipName;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Integer getFlowTo() {
        return flowTo;
    }

    public void setFlowTo(Integer flowTo) {
        this.flowTo = flowTo;
    }

    public Integer getPipeDiameter() {
        return pipeDiameter;
    }

    public void setPipeDiameter(Integer pipeDiameter) {
        this.pipeDiameter = pipeDiameter;
    }

    public String getEatPreservation() {
        return eatPreservation;
    }

    public void setEatPreservation(String eatPreservation) {
        this.eatPreservation = eatPreservation;
    }

    public Integer getHangLength() {
        return hangLength;
    }

    public void setHangLength(Integer hangLength) {
        this.hangLength = hangLength;
    }

    public String getWorkShop() {
        return workShop;
    }

    public void setWorkShop(String workShop) {
        this.workShop = workShop;
    }

    public String getAzimuthSymbolic() {
        return azimuthSymbolic;
    }

    public void setAzimuthSymbolic(String azimuthSymbolic) {
        this.azimuthSymbolic = azimuthSymbolic;
    }

    public String getAzimuthLately() {
        return azimuthLately;
    }

    public void setAzimuthLately(String azimuthLately) {
        this.azimuthLately = azimuthLately;
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
        return "BDataPipeline[" +
                "pipNo='" + pipNo + '\'' +
                ", pipName='" + pipName + '\'' +
                ", medium='" + medium + '\'' +
                ", flowTo=" + flowTo +
                ", pipeDiameter=" + pipeDiameter +
                ", eatPreservation='" + eatPreservation + '\'' +
                ", hangLength=" + hangLength +
                ", workShop='" + workShop + '\'' +
                ", azimuthSymbolic='" + azimuthSymbolic + '\'' +
                ", azimuthLately='" + azimuthLately + '\'' +
                ", lupTime=" + lupTime +
                ", editUser='" + editUser + '\'' +
                ']';
    }
}
