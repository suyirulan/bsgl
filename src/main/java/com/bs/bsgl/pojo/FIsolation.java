package com.bs.bsgl.pojo;

import com.bs.bsgl.core.domain.poi.Excel;

public class FIsolation {

    private static final long serialVersionUID = 1L;

    private String gid;
    private Integer sequence;
    private String signid;
    @Excel(name = "隔离类型",width = 20,height = 20)
    private String quarantinetype;
    @Excel(name = "机组号",width = 10,height = 20)
    private String unitNo;
    @Excel(name = "类型",width = 20,height = 20)
    private String isolationtype;
    @Excel(name = "标志(KKS码）",width = 15,height = 20)
    private String kksno;
    @Excel(name = "位置",width = 15,height = 20)
    private String position;
    @Excel(name = "设备名称",width = 40,height = 20)
    private String deviceName;

    private String state;

    private String remark;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getQuarantinetype() {
        return quarantinetype;
    }

    public void setQuarantinetype(String quarantinetype) {
        this.quarantinetype = quarantinetype;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getIsolationtype() {
        return isolationtype;
    }

    public void setIsolationtype(String isolationtype) {
        this.isolationtype = isolationtype;
    }

    public String getKksno() {
        return kksno;
    }

    public void setKksno(String kksno) {
        this.kksno = kksno;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
