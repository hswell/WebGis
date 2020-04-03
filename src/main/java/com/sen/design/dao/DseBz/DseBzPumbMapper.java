package com.sen.design.dao.DseBz;

import com.sen.design.entity.DseBz.DseBzPumb;
import com.sen.design.entity.DseBz.DseBzPumbKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DseBzPumbMapper {
    int deleteByPrimaryKey(DseBzPumbKey key);

    int insert(DseBzPumb record);

    int insertSelective(DseBzPumb record);
    List<DseBzPumb> queryList();
    List<DseBzPumb> querybykey(String ENNMCD);
    DseBzPumb selectByPrimaryKey(DseBzPumbKey key);

    int updateByPrimaryKeySelective(DseBzPumb record);

    int updateByPrimaryKey(DseBzPumb record);
}