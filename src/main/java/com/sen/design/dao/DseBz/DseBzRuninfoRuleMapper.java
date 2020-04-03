package com.sen.design.dao.DseBz;

import com.sen.design.entity.DseBz.DseBzRuninfoRule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DseBzRuninfoRuleMapper {
    int deleteByPrimaryKey(String STCD);

    int insert(DseBzRuninfoRule record);

    int insertSelective(DseBzRuninfoRule record);

    DseBzRuninfoRule selectByPrimaryKey(String STCD);

    int updateByPrimaryKeySelective(DseBzRuninfoRule record);

    int updateByPrimaryKey(DseBzRuninfoRule record);
}