package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.mapper.BDataIsolationCardMapper;
import com.bs.bsgl.pojo.BDataIsolationCard;
import com.bs.bsgl.service.BDataIsolationCardService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BDataIsolationCardServiceImpl implements BDataIsolationCardService {

    @Autowired
    BDataIsolationCardMapper cardMapper;

    @Override
    public List<BDataIsolationCard> getList(BDataIsolationCard card) {
        return cardMapper.getDataIsolationCardAll(card);
    }

    @Override
    public AjaxResult getById(String cardId) {
        if (StringUtils.isEmpty(cardId)) {
            return AjaxResult.error("请选择查询信息");
        }
        return AjaxResult.success(cardMapper.getIsolationCardById(cardId));
    }

    @Override
    public AjaxResult addCard(BDataIsolationCard card) {
        if (card==null || StringUtils.isEmpty(card.getgId())) {
            return AjaxResult.error("请添加隔离牌编号");
        }
        BDataIsolationCard isolationCardById = cardMapper.getIsolationCardById(card.getgId());
        if (isolationCardById != null) {
            return AjaxResult.error("隔离牌编号已存在");
        }
        card.setLupTime(new Date());
        return AjaxResult.success(cardMapper.addBDataIsolationCard(card));
    }

    @Override
    public AjaxResult updateCard(BDataIsolationCard card) {
        if (card==null || StringUtils.isEmpty(card.getgId())) {
            return AjaxResult.error("请选择隔离牌编号");
        }
        BDataIsolationCard isolationCardById = cardMapper.getIsolationCardById(card.getgId());
        if (isolationCardById == null) {
            return AjaxResult.error("隔离牌编号不存在");
        }
        card.setLupTime(new Date());
        return AjaxResult.success(cardMapper.updateBDataIsolationCardById(card));
    }

    @Override
    public AjaxResult delete(String cardId) {
        if (StringUtils.isEmpty(cardId)) {
            return AjaxResult.error("请选择删除信息");
        }
        return AjaxResult.success(cardMapper.deleteById(cardId));
    }
}
