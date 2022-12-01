package com.bs.bsgl.pojo;




import com.bs.bsgl.core.domain.poi.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


/**
 * cba数据库实体类
 * @author yunqingtan
 *
 */
@Data
public class BDataCba {

    private static final long serialVersionUID = 1L;

    @Excel(name = "id")
    private String gid;
    /**
     * KKS码
     */
    @Excel(name = "KKS码")
    private String kksno;
    /**
     * 中文名称
     */
    @Excel(name = "中文名称")
    private String dtname;
    /**
     * 房间位置
     */
    @Excel(name = "房间位置")
    private String postion;
    /**
     * 备注
     */
    @Excel(name = "备注")
    private String remark;
    /**
     * 最后修改时间
     */
    @Excel(name = "最后修改时间",dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date luptime;
    /**
     * 最后修改人
     */
    @Excel(name = "最后修改人")
    private String edituser;

//    private Integer pageSize;
//
//    private Integer pageNum;

}
