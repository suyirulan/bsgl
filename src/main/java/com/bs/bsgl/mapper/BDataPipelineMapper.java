package com.bs.bsgl.mapper;

import com.bs.bsgl.pojo.BDataPipeline;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BDataPipelineMapper {

    List<BDataPipeline> getDataPipelineAll(BDataPipeline pipeline);

    BDataPipeline getDataPipelineById(String pipNo);

    int addBDataPipeline(BDataPipeline room);

    int updateBDataPipelineById(BDataPipeline room);

    int deleteById(String pipNo);
}
