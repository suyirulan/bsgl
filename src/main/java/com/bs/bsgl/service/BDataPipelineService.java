package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.BDataPipeline;

import java.util.List;

public interface BDataPipelineService {

    List<BDataPipeline> getBDataPipelineList(BDataPipeline data);

    AjaxResult addDataPipeline(BDataPipeline data);

    AjaxResult updateDataPipeline(BDataPipeline data);

    AjaxResult selectById(String pipNo);

    AjaxResult delete(String pipNo);
}
