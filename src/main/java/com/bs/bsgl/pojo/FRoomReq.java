package com.bs.bsgl.pojo;

public class FRoomReq {

    private static final long serialVersionUID = 1L;

    private String gid;

    private Integer sequence;

    private String signid;

    private Integer length;

    private Integer width;

    private String color;

    private String oColor;

    private String signangeContent;

    private String position;

    private Integer sCount;

    private String remark;

    private Integer iscc1;

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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getoColor() {
        return oColor;
    }

    public void setoColor(String oColor) {
        this.oColor = oColor;
    }

    public String getSignangeContent() {
        return signangeContent;
    }

    public void setSignangeContent(String signangeContent) {
        this.signangeContent = signangeContent;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getsCount() {
        return sCount;
    }

    public void setsCount(Integer sCount) {
        this.sCount = sCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIscc1() {
        return iscc1;
    }

    public void setIscc1(Integer iscc1) {
        this.iscc1 = iscc1;
    }
}
