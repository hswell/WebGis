package com.sen.design.dao;

import com.sen.design.entity.AdCdB;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdCdBMapper {
    int deleteByPrimaryKey(String ADCD);

    int insert(AdCdB record);

    int insertSelective(AdCdB record);

    AdCdB selectByPrimaryKey(String ADCD);

    int updateByPrimaryKeySelective(AdCdB record);

    int updateByPrimaryKey(AdCdB record);
}