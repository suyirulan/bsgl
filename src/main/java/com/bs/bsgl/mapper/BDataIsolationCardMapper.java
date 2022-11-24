package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.BDataIsolationCard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BDataIsolationCardMapper {

    List<BDataIsolationCard> getDataIsolationCardAll(BDataIsolationCard isolationCard);

    BDataIsolationCard getIsolationCardById(String pipNo);

    int addBDataIsolationCard(BDataIsolationCard isolationCard);

    int updateBDataIsolationCardById(BDataIsolationCard isolationCard);

    int deleteById(String pipNo);
}
