package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.FKks;

import java.util.List;

public interface FKksService {

    List<FKks> getFKksList(FKks data);

    AjaxResult addFKks(FKks data);

    AjaxResult updateFKksById(FKks data);

    AjaxResult selectById(String gid);

    AjaxResult delete(String gid);
}
