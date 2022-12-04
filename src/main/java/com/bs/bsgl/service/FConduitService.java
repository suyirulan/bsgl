package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FConduit;

import java.util.List;

public interface FConduitService {

    List<FConduit> getFConduitList(FConduit data);

    AjaxResult addFConduit(FConduit data);

    AjaxResult updateFConduitById(FConduit data);

    AjaxResult selectById(String gid);

    AjaxResult delete(String gid);
}
