package com.bs.bsgl.pojo;

import com.bs.bsgl.core.domain.poi.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class FConduit {

    private static final long serialVersionUID = 1L;

    private String gid;
    private Integer sequence;
    private String signid;
    @Excel(name = "管道编号",width = 10,height = 20)
    private String conduitid;
    @Excel(name = "管道名称",width = 15,height = 20)
    private String conduitname;
    @Excel(name = "介质",width = 10,height = 20)
    private String medium;
    @Excel(name = "流向",width = 10,height = 20,readConverterExp ="1=左,2=右,3=上,4=下")
    private Integer flowTo;
    @Excel(name = "管径（mm）",width = 10,height = 20)
    private Integer pipeDiameter;
    @Excel(name = "有无保温",width = 10,height = 20,readConverterExp = "1=有保温,0=无保温")
    private String heatPreservation;
    @Excel(name = "可挂长度",width = 10,height = 20)
    private Integer hangLength;
    private String workshop;
    private String azimuthSymbolic;
    private String azimuthLately;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date luptime;
    private String edituser;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getSignid() {
        return signid;
    }

    public void setSignid(String signid) {
        this.signid = signid;
    }

    public String getConduitid() {
        return conduitid;
    }

    public void setConduitid(String conduitid) {
        this.conduitid = conduitid;
    }

    public String getConduitname() {
        return conduitname;
    }

    public void setConduitname(String conduitname) {
        this.conduitname = conduitname;
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

    public String getHeatPreservation() {
        return heatPreservation;
    }

    public void setHeatPreservation(String heatPreservation) {
        this.heatPreservation = heatPreservation;
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

    public Date getLuptime() {
        return luptime;
    }

    public void setLuptime(Date luptime) {
        this.luptime = luptime;
    }

    public String getEdituser() {
        return edituser;
    }

    public void setEdituser(String edituser) {
        this.edituser = edituser;
    }
}
