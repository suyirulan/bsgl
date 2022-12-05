package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.poi.ExcelUtil;
import com.bs.bsgl.pojo.FIsolation;
import com.bs.bsgl.pojo.FKks;
import com.bs.bsgl.service.FIsolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/signmanage/sign/FIsolation")
public class FIsolationController {

    @Autowired
    FIsolationService FIsolationService;

    @RequestMapping("index")
    public String index() {
        return "/signmanage/sign/IsolatioCard_Sign_index";
    }

    @GetMapping("list")
    @ResponseBody
    public AjaxResult getFIsolationList(FIsolation FIsolation) {
        return AjaxResult.success(FIsolationService.getFIsolationList(FIsolation));
    }

    @PostMapping("selectById/{id}")
    @ResponseBody
    public AjaxResult selectById(@PathVariable String id) {
        return FIsolationService.selectById(id);
    }

    @PostMapping("Add")
    @ResponseBody
    public AjaxResult addFIsolation(FIsolation FIsolation) {
        return FIsolationService.addFIsolation(FIsolation);
    }

    @PutMapping("Update")
    @ResponseBody
    public AjaxResult updateFIsolation(FIsolation FIsolation) {
        return FIsolationService.updateFIsolationById(FIsolation);
    }

    @PostMapping("delete/{id}")
    @ResponseBody
    public AjaxResult delete(@PathVariable String id) {
        return FIsolationService.delete(id);
    }

    @GetMapping("/export")
    public void downloadUser(HttpServletResponse response, FIsolation fIsolation){
        //获取导出数据
        List<FIsolation> list = FIsolationService.getFIsolationList(fIsolation);
        ExcelUtil<FIsolation> util = new ExcelUtil<FIsolation>(FIsolation.class);
        util.exportExcel(response, list, "隔离标识数据管理");
    }

}
