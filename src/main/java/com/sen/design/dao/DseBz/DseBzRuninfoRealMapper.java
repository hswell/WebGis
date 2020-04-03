package com.sen.design.dao.DseBz;

import com.sen.design.entity.DseBz.DseBzRuninfoReal;
import com.sen.design.entity.DseBz.DseBzRuninfoRealKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DseBzRuninfoRealMapper {
    int deleteByPrimaryKey(DseBzRuninfoRealKey key);

    int insert(DseBzRuninfoReal record);

    int insertSelective(DseBzRuninfoReal record);

    DseBzRuninfoReal selectByPrimaryKey(DseBzRuninfoRealKey key);

    int updateByPrimaryKeySelective(DseBzRuninfoReal record);

    int updateByPrimaryKey(DseBzRuninfoReal record);
}