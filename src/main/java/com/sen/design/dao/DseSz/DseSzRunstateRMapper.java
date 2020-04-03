package com.sen.design.dao.DseSz;

import com.sen.design.entity.DseSz.DseSzRunstateR;
import com.sen.design.entity.DseSz.DseSzRunstateRKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DseSzRunstateRMapper {
    int deleteByPrimaryKey(DseSzRunstateRKey key);

    int insert(DseSzRunstateR record);

    int insertSelective(DseSzRunstateR record);

    DseSzRunstateR selectByPrimaryKey(DseSzRunstateRKey key);

    int updateByPrimaryKeySelective(DseSzRunstateR record);

    int updateByPrimaryKey(DseSzRunstateR record);
}