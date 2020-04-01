package com.sen.design.dao;

import com.sen.design.entity.DseSzRuninfoR;
import com.sen.design.entity.DseSzRuninfoRKey;

public interface DseSzRuninfoRMapper {
    int deleteByPrimaryKey(DseSzRuninfoRKey key);

    int insert(DseSzRuninfoR record);

    int insertSelective(DseSzRuninfoR record);

    DseSzRuninfoR selectByPrimaryKey(DseSzRuninfoRKey key);

    int updateByPrimaryKeySelective(DseSzRuninfoR record);

    int updateByPrimaryKey(DseSzRuninfoR record);
}