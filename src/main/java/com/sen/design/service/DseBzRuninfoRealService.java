package com.sen.design.service;

import com.sen.design.dao.DseBz.DseBzRuninfoRealMapper;
import com.sen.design.entity.DseBz.DseBzRuninfoReal;
import com.sen.design.entity.DseBz.DseBzRuninfoRealKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DseBzRuninfoRealService {
    @Autowired
    DseBzRuninfoRealMapper dseBzRuninfoRealService;

    public DseBzRuninfoReal select(DseBzRuninfoRealKey key){
        return dseBzRuninfoRealService.selectByPrimaryKey(key);
    }

}
