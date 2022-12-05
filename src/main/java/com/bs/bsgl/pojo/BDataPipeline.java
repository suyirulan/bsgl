package com.bs.bsgl.pojo;

import com.bs.bsgl.core.domain.poi.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BDataPipeline {

    private static final long serialVersionUID = 1L;
    @Excel(name = "管道编号",width = 15,height = 20)
    private String pipno;
    @Excel(name = "管道名称",width = 15,height = 20)
    private String pipname;
    @Excel(name = "介质",width = 10,height = 20)
    private String medium;
    @Excel(name = "流向",width = 10,height = 20,readConverterExp ="1=左,2=右,3=上,4=下")
    private Integer flowTo;
    @Excel(name = "管径（mm）",width = 10,height = 20)
    private Integer pipeDiameter;
    @Excel(name = "有无保温",width = 12,height = 20,readConverterExp = "1=有保温,0=无保温")
    private String heatPreservation;
    @Excel(name = "可挂长度",width = 12,height = 20)
    private Integer hangLength;
    @Excel(name = "厂房",width = 15,height = 20)
    private String workshop;
    @Excel(name = "标志性设备方位",width = 20,height = 20)
    private String azimuthSymbolic;
    @Excel(name = "最近设备方位",width = 20,height = 20)
    private String azimuthLately;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //@Excel(name = "最后修改时间",dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lupTime;
    //@Excel(name = "最后修改人")
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
