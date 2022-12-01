package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.mapper.BDataPipelineMapper;
import com.bs.bsgl.pojo.BDataPipeline;
import com.bs.bsgl.service.BDataPipelineService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BDataPipelineServiceImpl implements BDataPipelineService {

    @Autowired
    BDataPipelineMapper pipelineMapper;


    @Override
    public List<BDataPipeline> getBDataPipelineList(BDataPipeline data) {
        return pipelineMapper.getDataPipelineAll(data);
    }

    @Override
    public AjaxResult addDataPipeline(BDataPipeline data) {
        if (data == null || StringUtils.isEmpty(data.getPipno())) {
            return AjaxResult.error("请添加管道编号");
        }
        BDataPipeline dataDataRoomById = pipelineMapper.getDataPipelineById(data.getPipno());
        if (dataDataRoomById != null) {
            return updateDataPipeline(data);
        }
        data.setLupTime(new Date());
        return AjaxResult.success(pipelineMapper.addBDataPipeline(data));
    }

    @Override
    public AjaxResult updateDataPipeline(BDataPipeline data) {
        if (StringUtils.isEmpty(data.getPipno())) {
            return AjaxResult.error("请选择管道编号");
        }
        BDataPipeline dataDataPipelineById = pipelineMapper.getDataPipelineById(data.getPipno());
        if (dataDataPipelineById == null) {
            return AjaxResult.error("管道编号不存在");
        }
        data.setLupTime(new Date());
        return AjaxResult.success(pipelineMapper.updateBDataPipelineById(data));
    }

    @Override
    public AjaxResult selectById(String pipNo) {
        if (StringUtils.isEmpty(pipNo)) {
            return AjaxResult.error("请选择查询管道");
        }
        return AjaxResult.success(pipelineMapper.getDataPipelineById(pipNo));
    }

    @Override
    public AjaxResult delete(String pipNo) {
        if (StringUtils.isEmpty(pipNo)) {
            return AjaxResult.error("请选择删除管道");
        }
        return AjaxResult.success(pipelineMapper.deleteById(pipNo));
    }
}
