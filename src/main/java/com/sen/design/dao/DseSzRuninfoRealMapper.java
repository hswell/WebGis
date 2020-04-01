package com.sen.design.dao;

import com.sen.design.entity.DseSzRuninfoReal;

public interface DseSzRuninfoRealMapper {
    int deleteByPrimaryKey(String STCD);

    int insert(DseSzRuninfoReal record);

    int insertSelective(DseSzRuninfoReal record);

    DseSzRuninfoReal selectByPrimaryKey(String STCD);

    int updateByPrimaryKeySelective(DseSzRuninfoReal record);

    int updateByPrimaryKey(DseSzRuninfoReal record);
}