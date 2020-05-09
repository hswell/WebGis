package com.sen.design.dao.TB;

import com.sen.design.entity.TB.Tb1502Meidsbi044;
import com.sen.design.entity.TB.Tb1502Meidsbi044Key;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Tb1502Meidsbi044Mapper {
    int deleteByPrimaryKey(Tb1502Meidsbi044Key key);

    int insert(Tb1502Meidsbi044 record);

    int insertSelective(Tb1502Meidsbi044 record);
    Tb1502Meidsbi044 selectBySTCD(String ENNMCD);
    Tb1502Meidsbi044 selectByPrimaryKey(Tb1502Meidsbi044Key key);

    int updateByPrimaryKeySelective(Tb1502Meidsbi044 record);

    int updateByPrimaryKey(Tb1502Meidsbi044 record);
}