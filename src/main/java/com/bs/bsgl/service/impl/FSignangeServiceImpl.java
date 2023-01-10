package com.bs.bsgl.service.impl;

import com.bs.bsgl.core.domain.AjaxResult;
import com.bs.bsgl.core.domain.UUID;
import com.bs.bsgl.mapper.FSignangeMapper;
import com.bs.bsgl.pojo.FSignange;
import com.bs.bsgl.service.FSignangeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FSignangeServiceImpl implements FSignangeService {

    @Autowired
    FSignangeMapper fSignangeMapper;


    @Override
    public List<FSignange> getList(FSignange data) {
        return fSignangeMapper.getList(data);
    }

    @Override
    public AjaxResult updateFSignangeById(FSignange FSignange){
        return AjaxResult.success(fSignangeMapper.updateFSignangeBySignid(FSignange));
    }

//    @Override
//    public AjaxResult delete(String gid) {
//        if (StringUtils.isEmpty(gid)) {
//            return AjaxResult.error("请选择删除GID");
//        }
//        return AjaxResult.success(FSignangeMapper.deleteById(gid));
//    }
}
