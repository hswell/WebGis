package com.sen.design.dao;

import com.sen.design.entity.DseSzRuninfoR;
import com.sen.design.entity.DseSzRuninfoRKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DseSzRuninfoRMapper {
    int deleteByPrimaryKey(DseSzRuninfoRKey key);

    int insert(DseSzRuninfoR record);

    int insertSelective(DseSzRuninfoR record);

    DseSzRuninfoR selectByPrimaryKey(DseSzRuninfoRKey key);

    int updateByPrimaryKeySelective(DseSzRuninfoR record);

    int updateByPrimaryKey(DseSzRuninfoR record);
}