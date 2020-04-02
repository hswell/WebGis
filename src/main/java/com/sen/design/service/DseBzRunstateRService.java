package com.sen.design.service;

import com.sen.design.dao.DseBzRunstateRMapper;
import com.sen.design.entity.DseBzRuninfoReal;
import com.sen.design.entity.DseBzRuninfoRealKey;
import com.sen.design.entity.DseBzRunstateR;
import com.sen.design.entity.DseBzRunstateRKey;
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
