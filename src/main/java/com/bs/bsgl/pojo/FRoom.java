package com.bs.bsgl.pojo;

import com.bs.bsgl.core.domain.poi.Excel;

public class FRoom {

    private static final long serialVersionUID = 1L;

    private String gid;
    @Excel(name = "序号",width = 10,height = 20)
    private Integer sequence;
    @Excel(name = "序号",width = 10,height = 20)
    private String signid;
    @Excel(name = "长（mm）",width = 10,height = 20)
    private Integer length;
    @Excel(name = "宽（mm）",width = 10,height = 20)
    private Integer width;
    @Excel(name = "颜色",width = 10,height = 20)
    private String color;
    @Excel(name = "其他颜色",width = 10,height = 20)
    private String oColor;
    @Excel(name = "标识内容",width = 20,height = 20)
    private String signangeContent;
    @Excel(name = "位置",width = 15,height = 20)
    private String position;
    @Excel(name = "数量",width = 10,height = 20)
    private Integer sCount;
    @Excel(name = "备注",width = 40,height = 20)
    private String remark;

    private Integer iscc1;

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
