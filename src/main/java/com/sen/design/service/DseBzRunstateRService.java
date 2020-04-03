package com.sen.design.service;

import com.sen.design.dao.DseBz.DseBzRunstateRMapper;
import com.sen.design.entity.DseBz.DseBzRunstateR;
import com.sen.design.entity.DseBz.DseBzRunstateRKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DseBzRunstateRService {
    @Autowired
    DseBzRunstateRMapper dseBzRunstateRMapper;
    public DseBzRunstateR select(DseBzRunstateRKey key){
        return dseBzRunstateRMapper.selectByPrimaryKey(key);
    }

}
