package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.poi.ExcelUtil;
import com.bs.bsgl.pojo.FKks;
import com.bs.bsgl.pojo.FKksReq;
import com.bs.bsgl.pojo.FSignange;
import com.bs.bsgl.service.FKksService;
import com.bs.bsgl.service.FSignangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/signflow")
public class FSignangeController {

    @Autowired
    FSignangeService fSignangeService;

    @RequestMapping("index")
    public String index() {
        return "/signmanage/sign/index";
    }

    @GetMapping("list")
    @ResponseBody
    public AjaxResult getSignList(FSignange fSignange) {
        return AjaxResult.success(fSignangeService.getList(fSignange));
    }

//    @PostMapping("selectById/{id}")
//    @ResponseBody
//    public AjaxResult selectById(@PathVariable String id) {
//        return fSignangeService.selectById(id);
//    }
//

    /**
     * 更新流程信息均采用此接口，状态值更新，id必传
     * @param fSignange
     * @return
     */
    @PutMapping("Update")
    @ResponseBody
    public AjaxResult updateFSignangeById(FSignange fSignange) {
        return fSignangeService.updateFSignangeById(fSignange);
    }
//
//    @PostMapping("delete/{id}")
//    @ResponseBody
//    public AjaxResult delete(@PathVariable String id) {
//        return fSignangeService.delete(id);
//    }

}
