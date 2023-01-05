package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FSignange;

import java.util.List;

public interface FSignangeService {

    List<FSignange> getList(FSignange data);

//    AjaxResult addFSignange(FSignange data);
//
    AjaxResult updateFSignangeById(FSignange data);
//
//    AjaxResult selectById(String gid);
//
//    AjaxResult delete(String gid);
}
