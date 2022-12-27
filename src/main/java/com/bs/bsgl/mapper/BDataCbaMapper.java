package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.BDataCba;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BDataCbaMapper {
    List<BDataCba> selectBDataCbaList(BDataCba dataCba);

    int addDataCba(BDataCba dataCba);

    BDataCba selectByKjsno(String kksno);

    BDataCba selectAllByGidAfter(String gid);

    BDataCba getBDataCbaById(String gid);

    int updateDataCba(BDataCba dataCba);

    int deleteByGids(String gid);
}
