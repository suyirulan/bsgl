package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.IdUtils;
import com.bs.bsgl.core.domain.poi.StringUtils;
import com.bs.bsgl.mapper.BDataCbaMapper;
import com.bs.bsgl.pojo.BDataCba;
import com.bs.bsgl.pojo.BDataRoom;
import com.bs.bsgl.service.BDataCbaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class BDataCbaServiceImpl implements BDataCbaService {
    @Autowired
    private BDataCbaMapper bDataCbaMapper;

    @Override
    public List<BDataCba> getBDataCbaList(BDataCba dataCba) {
           return bDataCbaMapper.selectBDataCbaList(dataCba);

    }


    @Override
    public Boolean delete(BDataRoom dataRoom) {
        return null;
    }

    @Override
    public AjaxResult addDataCba(BDataCba dataCba) {
        if (StringUtils.isEmpty(dataCba.getKksno())){
            return  AjaxResult.error("请输入KKS码");
        }
        BDataCba bDataCba = bDataCbaMapper.selectByKjsno(dataCba.getKksno());
        /*if (bDataCba!= null){
            return  AjaxResult.error("KKS码已存在");
        }*/
        String uuid = IdUtils.simpleUUID();
        dataCba.setGid(uuid);
        dataCba.setLuptime(new Date());
        return AjaxResult.success(bDataCbaMapper.addDataCba(dataCba));
    }

    @Override
    public AjaxResult updateDataCba(BDataCba dataCba) {
        if (StringUtils.isEmpty(dataCba.getGid())){
            return  AjaxResult.error("请选择修改的kks数据");
        }

        BDataCba bDataCba1 = bDataCbaMapper.selectAllByGidAfter(dataCba.getGid());
//        BDataCba bDataCba = bDataCbaMapper.selectByKjsno(dataCba.getKksno());
        if (bDataCba1 == null ){
            return  AjaxResult.error("KKS码不存在");
        }
        dataCba.setLuptime(new Date());
        return AjaxResult.success(bDataCbaMapper.updateDataCba(dataCba));
    }

    @Override
    public int deleteUserByIds(String gid) {
        return bDataCbaMapper.deleteByGids(gid);
    }

    @Override
    public List<BDataCba> getList(BDataCba dataCba) {
        return bDataCbaMapper.selectBDataCbaList(dataCba);
    }


    @Override
    public AjaxResult getBDataCbaById(String gid) {
        if (StringUtils.isEmpty(gid)) {
            return AjaxResult.error("未选择要查询的基础数据");
        }
        return AjaxResult.success(bDataCbaMapper.getBDataCbaById(gid));
    }


}
