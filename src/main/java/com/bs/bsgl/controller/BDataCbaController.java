package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.BDataRoom;
import com.bs.bsgl.service.BDataCbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/sys/cba")
public class BDataCbaController {

    @Autowired
    BDataCbaService bDataCbaService;

    /**
     * 跳转到标准化巡检分区管理界面
     *
     * @return room.jsp
     */

    @GetMapping("list")
    public AjaxResult getBDataRoomList(BDataRoom dataRoom){
        return AjaxResult.success(bDataCbaService.getBDataRoomList(dataRoom));
    }


    @GetMapping("save")
    public AjaxResult addDataRoom(BDataRoom dataRoom){
        return AjaxResult.success(bDataCbaService.addDataRoom(dataRoom));
    }


//    @RequestMapping("/index")
//    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
//
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName(PREFIX+"index.jsp");
//        try{
//            BDataCbaService bDataCbaService=new BDataCbaService();
//            List<BDataCba> rs=new ArrayList<BDataCba>(); //bdRoomService.GetALL(request, response);
//            rs= bDataCbaService.GetALL(request, response);
//            //String url= bdRoomService.GetALL(request, response);
//
//            String rss= bDataCbaService.GetModel(request, response);
//
//
//            //mv.addObject("list", rs);
//            mv.addObject("TootleCount", rs.size());
//            mv.addObject("ServiceUrl",rss);
//        }
//        catch (Exception e) {
//            mv.addObject("ExMessge", e.getMessage());
//        }
//        mv.addObject("RName", "管理员");
//        mv.addObject("USERNAME", "管理员");
//        mv.addObject("basePath", getBaseUrl(request));
//
//        //SystemLogger.error(this, "request.getServletPath:" + request.getRequestURI());
//        return mv;
//    }
}
