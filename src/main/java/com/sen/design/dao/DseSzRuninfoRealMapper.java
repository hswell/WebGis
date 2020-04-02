package com.sen.design.dao;

import com.sen.design.entity.DseSzRuninfoReal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DseSzRuninfoRealMapper {
    int deleteByPrimaryKey(String STCD);

    int insert(DseSzRuninfoReal record);

    int insertSelective(DseSzRuninfoReal record);

    DseSzRuninfoReal selectByPrimaryKey(String STCD);

    int updateByPrimaryKeySelective(DseSzRuninfoReal record);

    int updateByPrimaryKey(DseSzRuninfoReal record);
}