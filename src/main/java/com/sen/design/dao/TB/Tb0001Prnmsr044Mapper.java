package com.sen.design.dao.TB;

import com.sen.design.entity.DseBz.DseBzPumb;
import com.sen.design.entity.TB.Tb0001Prnmsr044;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Tb0001Prnmsr044Mapper {
    int deleteByPrimaryKey(String ENNMCD);

    int insert(Tb0001Prnmsr044 record);

    int insertSelective(Tb0001Prnmsr044 record);
    List<Tb0001Prnmsr044> queryList();
    Tb0001Prnmsr044 selectByPrimaryKey(String ENNMCD);
    Tb0001Prnmsr044 selectByENNM(String ENNM);

    int updateByPrimaryKeySelective(Tb0001Prnmsr044 record);

    int updateByPrimaryKey(Tb0001Prnmsr044 record);
}