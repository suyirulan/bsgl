package com.bs.bsgl.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BDataPipeline {

    private static final long serialVersionUID = 1L;

    private String pipno;

    private String pipname;

    private String medium;

    private Integer flowTo;

    private Integer pipeDiameter;

    private String heatPreservation;

    private Integer hangLength;

    private String workshop;

    private String azimuthSymbolic;

    private String azimuthLately;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lupTime;

    private String editUser;


    public String getPipno() {
        return pipno;
    }

    public void setPipno(String pipno) {
        this.pipno = pipno;
    }

    public String getPipname() {
        return pipname;
    }

    public void setPipname(String pipname) {
        this.pipname = pipname;
    }

    public String getHeatPreservation() {
        return heatPreservation;
    }

    public void setHeatPreservation(String heatPreservation) {
        this.heatPreservation = heatPreservation;
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

    public Integer getHangLength() {
        return hangLength;
    }

    public void setHangLength(Integer hangLength) {
        this.hangLength = hangLength;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
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
                "pipNo='" + pipno + '\'' +
                ", pipName='" + pipname + '\'' +
                ", medium='" + medium + '\'' +
                ", flowTo=" + flowTo +
                ", pipeDiameter=" + pipeDiameter +
                ", eatPreservation='" + heatPreservation + '\'' +
                ", hangLength=" + hangLength +
                ", workShop='" + workshop + '\'' +
                ", azimuthSymbolic='" + azimuthSymbolic + '\'' +
                ", azimuthLately='" + azimuthLately + '\'' +
                ", lupTime=" + lupTime +
                ", editUser='" + editUser + '\'' +
                ']';
    }
}
