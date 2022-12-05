package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FIsolation;

import java.util.List;

public interface FIsolationService {

    List<FIsolation> getFIsolationList(FIsolation data);

    AjaxResult addFIsolation(FIsolation data);

    AjaxResult updateFIsolationById(FIsolation data);

    AjaxResult selectById(String gid);

    AjaxResult delete(String gid);
}
