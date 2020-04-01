package com.sen.design.dao;

import com.sen.design.entity.DseBzRuninfoReal;
import com.sen.design.entity.DseBzRuninfoRealKey;

public interface DseBzRuninfoRealMapper {
    int deleteByPrimaryKey(DseBzRuninfoRealKey key);

    int insert(DseBzRuninfoReal record);

    int insertSelective(DseBzRuninfoReal record);

    DseBzRuninfoReal selectByPrimaryKey(DseBzRuninfoRealKey key);

    int updateByPrimaryKeySelective(DseBzRuninfoReal record);

    int updateByPrimaryKey(DseBzRuninfoReal record);
}