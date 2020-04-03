package com.sen.design.service;

import com.sen.design.dao.DseSz.DseSzRuninfoRMapper;
import com.sen.design.dao.DseSz.DseSzRuninfoRealMapper;
import com.sen.design.dao.DseSz.DseSzRunstateRMapper;
import com.sen.design.entity.DseSz.*;
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
