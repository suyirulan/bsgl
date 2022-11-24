package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.BDataPipeline;
import com.bs.bsgl.service.BDataPipelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pipeline")
public class BDataPipelineController {

    @Autowired
    BDataPipelineService pipelineService;


    @GetMapping("list")
    public AjaxResult getBDataRoomList(BDataPipeline dataRoom) {
        return AjaxResult.success(pipelineService.getBDataPipelineList(dataRoom));
    }

    @GetMapping("selectById/{id}")
    public AjaxResult selectById(@PathVariable String id) {
        return pipelineService.selectById(id);
    }

    @PostMapping("save")
    public AjaxResult addDataPipeline(@RequestBody BDataPipeline dataRoom) {
        return pipelineService.addDataPipeline(dataRoom);
    }

    @PutMapping("update")
    public AjaxResult updateDataPipeline(@RequestBody BDataPipeline dataRoom) {
        return pipelineService.updateDataPipeline(dataRoom);
    }

    @DeleteMapping("delete/{id}")
    public AjaxResult delete(@PathVariable String id) {
        return pipelineService.delete(id);
    }

}
