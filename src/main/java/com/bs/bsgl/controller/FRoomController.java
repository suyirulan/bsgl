package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FRoom;
import com.bs.bsgl.service.FRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

}
