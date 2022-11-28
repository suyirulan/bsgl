package com.bs.bsgl.controller;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.poi.ExcelUtil;
import com.bs.bsgl.pojo.BDataCba;
import com.bs.bsgl.pojo.BDataRoom;
import com.bs.bsgl.service.BDataCbaService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


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

    @GetMapping("/list")
    public PageInfo getBDataCbaList(BDataCba dataCba){

        return bDataCbaService.getBDataCbaList(dataCba);
    }


    @PostMapping("/save")
    public AjaxResult addDataCba(@RequestBody BDataCba dataCba){
        return bDataCbaService.addDataCba(dataCba);
    }

    @PutMapping("/update")
    public AjaxResult updateDataCba(@RequestBody BDataCba dataCba){
        return bDataCbaService.updateDataCba(dataCba);
    }

    @GetMapping("/getById/{gid}")
    public AjaxResult getBDataCbaById(@PathVariable String gid){

        return bDataCbaService.getBDataCbaById(gid);
    }

    @DeleteMapping("/delete/{gids}")
    public AjaxResult remove(@PathVariable String[] gids)
    {
        int i = bDataCbaService.deleteUserByIds(gids);
        if (i>0){
            return AjaxResult.success("删除成功");
        }else {
            return AjaxResult.error("删除失败");
        }
    }

    @PostMapping("/export")
    public void downloadUser(HttpServletResponse response, BDataCba dataCba){
        //获取导出数据
        List<BDataCba> list = bDataCbaService.getList(dataCba);
        ExcelUtil<BDataCba> util = new ExcelUtil<BDataCba>(BDataCba.class);
        util.exportExcel(response, list, "用户数据");
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
