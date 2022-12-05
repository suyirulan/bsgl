package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FConduit;
import com.bs.bsgl.service.FConduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/signmanage/sign/FConduit")
public class FConduitController {

    @Autowired
    FConduitService FConduitService;

    @RequestMapping("index")
    public String index() {
        return "/signmanage/sign/Pipeline_Sign_index";
    }

    @GetMapping("list")
    @ResponseBody
    public AjaxResult getFConduitList(FConduit FConduit) {
        return AjaxResult.success(FConduitService.getFConduitList(FConduit));
    }

    @PostMapping("selectById/{id}")
    @ResponseBody
    public AjaxResult selectById(@PathVariable String id) {
        return FConduitService.selectById(id);
    }

    @PostMapping("Add")
    @ResponseBody
    public AjaxResult addFConduit(FConduit FConduit) {
        return FConduitService.addFConduit(FConduit);
    }

    @PutMapping("Update")
    @ResponseBody
    public AjaxResult updateFConduit(FConduit FConduit) {
        return FConduitService.updateFConduitById(FConduit);
    }

    @PostMapping("delete/{id}")
    @ResponseBody
    public AjaxResult delete(@PathVariable String id) {
        return FConduitService.delete(id);
    }

}
