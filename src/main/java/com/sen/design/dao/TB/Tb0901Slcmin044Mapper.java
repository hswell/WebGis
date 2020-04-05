package com.sen.design.dao.TB;

import com.sen.design.entity.TB.Tb0901Slcmin044;
import com.sen.design.entity.TB.Tb0901Slcmin044Key;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Tb0901Slcmin044Mapper {
    int deleteByPrimaryKey(Tb0901Slcmin044Key key);

    int insert(Tb0901Slcmin044 record);

    int insertSelective(Tb0901Slcmin044 record);

    Tb0901Slcmin044 selectByPrimaryKey(Tb0901Slcmin044Key key);

    int updateByPrimaryKeySelective(Tb0901Slcmin044 record);

    int updateByPrimaryKey(Tb0901Slcmin044 record);
}