package com.sen.design.dao.DseBz;

import com.sen.design.entity.DseBz.DseBzRunstateR;
import com.sen.design.entity.DseBz.DseBzRunstateRKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DseBzRunstateRMapper {
    int deleteByPrimaryKey(DseBzRunstateRKey key);

    int insert(DseBzRunstateR record);

    int insertSelective(DseBzRunstateR record);

    DseBzRunstateR selectByPrimaryKey(DseBzRunstateRKey key);

    int updateByPrimaryKeySelective(DseBzRunstateR record);

    int updateByPrimaryKey(DseBzRunstateR record);
}