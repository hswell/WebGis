package com.sen.design.dao;

import com.sen.design.entity.DseBzRunstateR;
import com.sen.design.entity.DseBzRunstateRKey;

public interface DseBzRunstateRMapper {
    int deleteByPrimaryKey(DseBzRunstateRKey key);

    int insert(DseBzRunstateR record);

    int insertSelective(DseBzRunstateR record);

    DseBzRunstateR selectByPrimaryKey(DseBzRunstateRKey key);

    int updateByPrimaryKeySelective(DseBzRunstateR record);

    int updateByPrimaryKey(DseBzRunstateR record);
}