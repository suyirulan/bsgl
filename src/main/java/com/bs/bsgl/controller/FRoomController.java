package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.poi.ExcelUtil;
import com.bs.bsgl.pojo.FKks;
import com.bs.bsgl.pojo.FRoom;
import com.bs.bsgl.service.FRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/signmanage/sign/FRoom")
public class FRoomController {

    @Autowired
    FRoomService FRoomService;

    @RequestMapping("index")
    public String backup() {
        return "/signmanage/sign/Room_Sign_index";
    }

    @GetMapping("list")
    @ResponseBody
    public AjaxResult getFRoomList(FRoom FRoom) {
        return AjaxResult.success(FRoomService.getFRoomList(FRoom));
    }

    @PostMapping("selectById/{id}")
    @ResponseBody
    public AjaxResult selectById(@PathVariable String id) {
        return FRoomService.selectById(id);
    }

    @PostMapping("Add")
    @ResponseBody
    public AjaxResult addFRoom(FRoom FRoom) {
        return FRoomService.addFRoom(FRoom);
    }

    @PutMapping("Update")
    @ResponseBody
    public AjaxResult updateFRoom(FRoom FRoom) {
        return FRoomService.updateFRoomById(FRoom);
    }

    @PostMapping("delete/{id}")
    @ResponseBody
    public AjaxResult delete(@PathVariable String id) {
        return FRoomService.delete(id);
    }

    @GetMapping("/export")
    public void downloadUser(HttpServletResponse response, FRoom fRoom){
        //获取导出数据
        List<FRoom> list = FRoomService.getFRoomList(fRoom);
        ExcelUtil<FRoom> util = new ExcelUtil<FRoom>(FRoom.class);
        util.exportExcel(response, list, "门牌标识数据管理");
    }

}
