package com.sen.design.service;

import com.sen.design.dao.DseBz.DseBzszRemarkMapper;
import com.sen.design.entity.DseBz.DseBzszRemark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DseBzszRemarkService {
    @Autowired
    DseBzszRemarkMapper dseBzszRemarkMapper;
    public DseBzszRemark select(String BZSTCD){
        return dseBzszRemarkMapper.selectByPrimaryKey(BZSTCD);
    }
}
