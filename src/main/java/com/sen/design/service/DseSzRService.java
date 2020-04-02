package com.sen.design.service;

import com.sen.design.dao.DseSzRuninfoRMapper;
import com.sen.design.dao.DseSzRuninfoRealMapper;
import com.sen.design.dao.DseSzRunstateRMapper;
import com.sen.design.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DseSzRService {
    @Autowired
    DseSzRuninfoRealMapper dseSzRuninfoRealMapper;
    DseSzRuninfoRMapper dseSzRuninfoRMapper;
    DseSzRunstateRMapper dseSzRunstateRMapper;

    public DseSzRuninfoReal RuninfoRealselect(String BZSTCD){
        return dseSzRuninfoRealMapper.selectByPrimaryKey(BZSTCD);
    }

    public DseSzRuninfoR RuninfoRselect(DseSzRuninfoRKey key){
        return dseSzRuninfoRMapper.selectByPrimaryKey(key);
    }

    public DseSzRunstateR RunstateRselect(DseSzRunstateRKey key){
        return dseSzRunstateRMapper.selectByPrimaryKey(key);
    }


}
