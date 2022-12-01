package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.BDataRoom;
import com.bs.bsgl.service.BDataRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sys/room")
public class BDataRoomController {

    @Autowired
    BDataRoomService roomService;

    @RequestMapping("index")
    public String index() {
        return "/sys/room/index";
    }

    @GetMapping("list")
    @ResponseBody
    public AjaxResult getBDataRoomList(BDataRoom dataRoom){
        return AjaxResult.success(roomService.getBDataRoomList(dataRoom));
    }

    @GetMapping("selectById/{id}")
    @ResponseBody
    public AjaxResult selectById(@PathVariable String id){
        return roomService.selectById(id);
    }

    @PostMapping("Add")
    @ResponseBody
    public AjaxResult addDataRoom(BDataRoom dataRoom){
        return roomService.addDataRoom(dataRoom);
    }

    @PutMapping("update")
    public AjaxResult updateDataRoom(@RequestBody BDataRoom dataRoom){
        return roomService.updateDataRoom(dataRoom);
    }

    @PostMapping("delete/{id}")
    @ResponseBody
    public AjaxResult delete(@PathVariable(name = "id") String id){
        return roomService.delete(id);
    }

}
