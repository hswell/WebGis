package com.sen.design.dao.TB;

import com.sen.design.entity.TB.Tb0904Escpp044;
import com.sen.design.entity.TB.Tb0904Escpp044Key;

public interface Tb0904Escpp044Mapper {
    int deleteByPrimaryKey(Tb0904Escpp044Key key);

    int insert(Tb0904Escpp044 record);

    int insertSelective(Tb0904Escpp044 record);

    Tb0904Escpp044 selectByPrimaryKey(Tb0904Escpp044Key key);

    int updateByPrimaryKeySelective(Tb0904Escpp044 record);

    int updateByPrimaryKey(Tb0904Escpp044 record);
}