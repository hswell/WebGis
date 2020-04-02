package com.sen.design.service;

import com.sen.design.dao.DseBzRunstateRMapper;
import com.sen.design.dao.DseBzszRemarkMapper;
import com.sen.design.entity.DseBzRunstateR;
import com.sen.design.entity.DseBzRunstateRKey;
import com.sen.design.entity.DseBzszRemark;
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
