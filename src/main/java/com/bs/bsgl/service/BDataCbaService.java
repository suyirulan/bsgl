package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.BDataCba;
import com.bs.bsgl.pojo.BDataRoom;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BDataCbaService {

    List<BDataCba> getBDataCbaList(BDataCba dataCba);

    Boolean delete(BDataRoom dataRoom);

    AjaxResult addDataCba(BDataCba dataCba);

    AjaxResult getBDataCbaById(String gid);

    AjaxResult updateDataCba(BDataCba dataCba);

    int deleteUserByIds(String gid);

    List<BDataCba> getList(BDataCba dataCba);
}
