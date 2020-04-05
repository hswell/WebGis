package com.sen.design.dao.TB;

import com.sen.design.entity.TB.Tb0903Slhypr044;
import com.sen.design.entity.TB.Tb0903Slhypr044Key;

public interface Tb0903Slhypr044Mapper {
    int deleteByPrimaryKey(Tb0903Slhypr044Key key);

    int insert(Tb0903Slhypr044 record);

    int insertSelective(Tb0903Slhypr044 record);

    Tb0903Slhypr044 selectByPrimaryKey(Tb0903Slhypr044Key key);

    int updateByPrimaryKeySelective(Tb0903Slhypr044 record);

    int updateByPrimaryKey(Tb0903Slhypr044 record);
}