package com.bs.bsgl.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class FConduitReq {

    private static final long serialVersionUID = 1L;

    private String gid;

    private Integer sequence;

    private String signid;

    private String conduitid;

    private String conduitname;

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
    private Date luptime;

    private String edituser;

    /**
     * 标识状态，审批流程状态，以及处理流程状态
     */
    private String signstate;
    /**
     * 是否需要搭脚手架	1,需要；0,不需要
     */
    private String isscaffolding;
    /**
     * 缺陷类型 01-标牌缺失,02-标牌损坏,03-支架损坏,04-旧标牌需要换新标牌,05-标牌信息错误,06—其他
     */
    private String defecttype;
    /**
     * 材质 01-不锈钢,02-双色板
     */
    private String material;
    /**
     * 提出值
     */
    private String createZ;
    /**
     * 提出人
     */
    private String createR;

    /**
     * 提交人姓名
     */
//    private String createRName;
    /**
     * 提出时间
     */
    private String createTime;
    /**
     * 所属责任值
     */
    private String liabilityZ;
    /**
     * 所属责任区
     */
    private String liabilityQ;
    /**
     * 标牌分发
     */
    private String distribute;
    /**
     * 标牌接收人
     */
    private String sendee;
    /**
     * 二次分发
     */
    private String ssendee;
    /**
     * 确认处理人
     */
    private String processing;
    /**
     * 处理时间
     */
    private String processingtime;
    /**
     * 未处理原因
     */
    private String nohandle;
    /**
     * 流程ID
     */
    private String flowno;

    public String getSignstate() {
        return signstate;
    }

    public void setSignstate(String signstate) {
        this.signstate = signstate;
    }

    public String getIsscaffolding() {
        return isscaffolding;
    }

    public void setIsscaffolding(String isscaffolding) {
        this.isscaffolding = isscaffolding;
    }

    public String getDefecttype() {
        return defecttype;
    }

    public void setDefecttype(String defecttype) {
        this.defecttype = defecttype;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCreateZ() {
        return createZ;
    }

    public void setCreateZ(String createZ) {
        this.createZ = createZ;
    }

    public String getCreateR() {
        return createR;
    }

    public void setCreateR(String createR) {
        this.createR = createR;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLiabilityZ() {
        return liabilityZ;
    }

    public void setLiabilityZ(String liabilityZ) {
        this.liabilityZ = liabilityZ;
    }

    public String getLiabilityQ() {
        return liabilityQ;
    }

    public void setLiabilityQ(String liabilityQ) {
        this.liabilityQ = liabilityQ;
    }

    public String getDistribute() {
        return distribute;
    }

    public void setDistribute(String distribute) {
        this.distribute = distribute;
    }

    public String getSendee() {
        return sendee;
    }

    public void setSendee(String sendee) {
        this.sendee = sendee;
    }

    public String getSsendee() {
        return ssendee;
    }

    public void setSsendee(String ssendee) {
        this.ssendee = ssendee;
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing;
    }

    public String getProcessingtime() {
        return processingtime;
    }

    public void setProcessingtime(String processingtime) {
        this.processingtime = processingtime;
    }

    public String getNohandle() {
        return nohandle;
    }

    public void setNohandle(String nohandle) {
        this.nohandle = nohandle;
    }

    public String getFlowno() {
        return flowno;
    }

    public void setFlowno(String flowno) {
        this.flowno = flowno;
    }

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
