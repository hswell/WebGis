package com.sen.design.dao.DseBz;

import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseBz.DseBzRuninfoRKey;

public interface DseBzRuninfoRMapper {
    int deleteByPrimaryKey(DseBzRuninfoRKey key);

    int insert(DseBzRuninfoR record);

    int insertSelective(DseBzRuninfoR record);

    DseBzRuninfoR selectByPrimaryKey(DseBzRuninfoRKey key);

    int updateByPrimaryKeySelective(DseBzRuninfoR record);

    int updateByPrimaryKey(DseBzRuninfoR record);
}