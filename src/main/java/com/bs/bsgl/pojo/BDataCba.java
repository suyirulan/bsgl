package com.bs.bsgl.pojo;




import java.io.Serializable;
import java.sql.Timestamp;





/**
 * cba数据库实体类
 * @author yunqingtan
 *
 */
public class BDataCba {

    private static final long serialVersionUID = 1L;
    
  
    private String gid;
    /**
     * KKS码
     */
    private String kksno;
    /**
     * 中文名称
     */
    private String dtname;
    /**
     * 房间位置
     */
    private String postion;
    /**
     * 备注
     */
    private String remark;
    /**
     * 最后修改时间
     */
    private Timestamp luptime;
    /**
     * 最后修改人
     */
    private String edituser;
        


	public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getKksno() {
        return kksno;
    }

    public void setKksno(String kksno) {
        this.kksno = kksno;
    }
    
    
    public String getDtname() {
        return dtname;
    }

    public void setDtname(String dtname) {
        this.dtname = dtname;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
 
    public Timestamp getLuptime() {
        return luptime;
    }

    public void setLuptime(Timestamp luptime) {
        this.luptime = luptime;
    }

    public String getEdituser() {
        return edituser;
    }

    public void setEdituser(String edituser) {
        this.edituser = edituser;
    }

    protected Serializable pkVal() {
        return this.gid;
    }

	@Override
	public String toString() {
		return "BDataCba [gid=" + gid + ", kksno=" + kksno + ", dtname=" + dtname + ", postion=" + postion + ", remark="
				+ remark + ", luptime=" + luptime + ", edituser=" + edituser +  "]";
	}
}
