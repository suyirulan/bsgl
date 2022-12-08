package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FIsolation;
import com.bs.bsgl.pojo.FIsolationReq;

import java.util.List;

public interface FIsolationService {

    List<FIsolation> getFIsolationList(FIsolation data);

    AjaxResult addFIsolation(FIsolationReq data);

    AjaxResult updateFIsolationById(FIsolationReq data);

    AjaxResult selectById(String gid);

    AjaxResult delete(String gid);
}
