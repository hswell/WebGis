package com.sen.design.dao;

import com.sen.design.entity.DseBzszRemark;

public interface DseBzszRemarkMapper {
    int deleteByPrimaryKey(String BZSTCD);

    int insert(DseBzszRemark record);

    int insertSelective(DseBzszRemark record);

    DseBzszRemark selectByPrimaryKey(String BZSTCD);

    int updateByPrimaryKeySelective(DseBzszRemark record);

    int updateByPrimaryKey(DseBzszRemark record);
}