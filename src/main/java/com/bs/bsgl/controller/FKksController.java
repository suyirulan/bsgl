package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.poi.ExcelUtil;
import com.bs.bsgl.pojo.BDataCba;
import com.bs.bsgl.pojo.FKks;
import com.bs.bsgl.service.FKksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/signmanage/sign/FKks")
public class FKksController {

    @Autowired
    FKksService fKksService;

    @RequestMapping("index")
    public String index() {
        return "/signmanage/sign/CBA_Sign_index";
    }

    @RequestMapping("backup")
    public String backup() {
        return "/signmanage/sign/Room_Sign_index";
    }

    @GetMapping("list")
    @ResponseBody
    public AjaxResult getFKksList(FKks fKks) {
        return AjaxResult.success(fKksService.getFKksList(fKks));
    }

    @PostMapping("selectById/{id}")
    @ResponseBody
    public AjaxResult selectById(@PathVariable String id) {
        return fKksService.selectById(id);
    }

    @PostMapping("Add")
    @ResponseBody
    public AjaxResult addFKks(FKks fKks) {
        return fKksService.addFKks(fKks);
    }

    @PutMapping("Update")
    @ResponseBody
    public AjaxResult updateFKks(FKks fKks) {
        return fKksService.updateFKksById(fKks);
    }

    @PostMapping("delete/{id}")
    @ResponseBody
    public AjaxResult delete(@PathVariable String id) {
        return fKksService.delete(id);
    }

    @GetMapping("/export")
    public void downloadUser(HttpServletResponse response, FKks fKks){
        //获取导出数据
        List<FKks> list = fKksService.getFKksList(fKks);
        ExcelUtil<FKks> util = new ExcelUtil<FKks>(FKks.class);
        util.exportExcel(response, list, "设备标识数据管理");
    }


}