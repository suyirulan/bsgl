package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.BDataRoom;
import com.bs.bsgl.service.BDataRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("room")
public class BDataRoomController {

    @Autowired
    BDataRoomService roomService;


    @GetMapping("list")
    public AjaxResult getBDataRoomList(BDataRoom dataRoom){
        return AjaxResult.success(roomService.getBDataRoomList(dataRoom));
    }

    @GetMapping("selectById/{id}")
    public AjaxResult selectById(@PathVariable String id){
        return roomService.selectById(id);
    }

    @PostMapping("save")
    public AjaxResult addDataRoom(@RequestBody BDataRoom dataRoom){
        return roomService.addDataRoom(dataRoom);
    }

    @PutMapping("update")
    public AjaxResult updateDataRoom(@RequestBody BDataRoom dataRoom){
        return roomService.updateDataRoom(dataRoom);
    }

    @DeleteMapping("delete/{id}")
    public AjaxResult delete(@PathVariable String id){
        return roomService.delete(id);
    }

}
