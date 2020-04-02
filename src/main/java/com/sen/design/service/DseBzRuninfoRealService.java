package com.sen.design.service;

import com.sen.design.dao.DseBzRuninfoRealMapper;
import com.sen.design.entity.DseBzPumb;
import com.sen.design.entity.DseBzPumbKey;
import com.sen.design.entity.DseBzRuninfoReal;
import com.sen.design.entity.DseBzRuninfoRealKey;
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
