package com.bs.bsgl.service;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.pojo.BDataIsolationCard;

import java.util.List;

public interface BDataIsolationCardService {

    List<BDataIsolationCard> getList(BDataIsolationCard card);

    AjaxResult getById(String cardId);

    AjaxResult addCard(BDataIsolationCard card);

    AjaxResult updateCard(BDataIsolationCard card);

    AjaxResult delete(String cardId);
}
