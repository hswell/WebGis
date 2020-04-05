package com.sen.design.dao.TB;

import com.sen.design.entity.TB.Tb0902Slcnstrl044;
import com.sen.design.entity.TB.Tb0902Slcnstrl044Key;

public interface Tb0902Slcnstrl044Mapper {
    int deleteByPrimaryKey(Tb0902Slcnstrl044Key key);

    int insert(Tb0902Slcnstrl044 record);

    int insertSelective(Tb0902Slcnstrl044 record);

    Tb0902Slcnstrl044 selectByPrimaryKey(Tb0902Slcnstrl044Key key);

    int updateByPrimaryKeySelective(Tb0902Slcnstrl044 record);

    int updateByPrimaryKey(Tb0902Slcnstrl044 record);
}