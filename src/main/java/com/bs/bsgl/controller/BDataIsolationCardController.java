package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.BDataIsolationCard;
import com.bs.bsgl.service.BDataIsolationCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sys/isolationCard")
public class BDataIsolationCardController {

    @Autowired
    BDataIsolationCardService cardService;

    @RequestMapping("index")
    public String index() {
        return "/sys/isolationCard/index";
    }

    @GetMapping("list")
    @ResponseBody
    public AjaxResult getList(BDataIsolationCard card){
        return AjaxResult.success(cardService.getList(card));
    }

    @PostMapping("selectById/{id}")
    @ResponseBody
    public AjaxResult selectById(@PathVariable String id){
        return cardService.getById(id);
    }

    @PostMapping("Add")
    @ResponseBody
    public AjaxResult addData(BDataIsolationCard card){
        return cardService.addCard(card);
    }

    @PostMapping("Update")
    @ResponseBody
    public AjaxResult updateData(BDataIsolationCard card){
        return cardService.updateCard(card);
    }

    @PostMapping("Delete/{id}")
    @ResponseBody
    public AjaxResult delete(@PathVariable String id){
        return cardService.delete(id);
    }

}
