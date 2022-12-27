package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.poi.ExcelUtil;
import com.bs.bsgl.pojo.BDataCba;
import com.bs.bsgl.pojo.BDataPipeline;
import com.bs.bsgl.service.BDataPipelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/sys/pipeline")
public class BDataPipelineController {

    @Autowired
    BDataPipelineService pipelineService;

    @RequestMapping("index")
    public String index() {
        return "/sys/pipeline/index";
    }

    @GetMapping("list")
    @ResponseBody
    public AjaxResult getBDataRoomList(BDataPipeline dataRoom) {
        return AjaxResult.success(pipelineService.getBDataPipelineList(dataRoom));
    }

    @PostMapping("selectById/{id}")
    @ResponseBody
    public AjaxResult selectById(@PathVariable String id) {
        return pipelineService.selectById(id);
    }

    @PostMapping("Add")
    @ResponseBody
    public AjaxResult addDataPipeline(BDataPipeline dataRoom) {
        return pipelineService.addDataPipeline(dataRoom);
    }

    @PutMapping("Update")
    @ResponseBody
    public AjaxResult updateDataPipeline(BDataPipeline dataRoom) {
        return pipelineService.updateDataPipeline(dataRoom);
    }

    @PostMapping("delete/{id}")
    @ResponseBody
    public AjaxResult delete(@PathVariable String id) {
        return pipelineService.delete(id);
    }

    @GetMapping("/export")
    public void downloadUser(HttpServletResponse response, BDataPipeline bDataPipeline){
        //获取导出数据
        List<BDataPipeline> list = pipelineService.getBDataPipelineList(bDataPipeline);
        ExcelUtil<BDataPipeline> util = new ExcelUtil<BDataPipeline>(BDataPipeline.class);
        util.exportExcel(response, list, "管道标识基础数据");
    }

}
