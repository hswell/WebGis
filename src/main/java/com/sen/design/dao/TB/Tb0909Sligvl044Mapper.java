package com.sen.design.dao.TB;

import com.sen.design.entity.TB.Tb0909Sligvl044;
import com.sen.design.entity.TB.Tb0909Sligvl044Key;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Tb0909Sligvl044Mapper {
    int deleteByPrimaryKey(Tb0909Sligvl044Key key);

    int insert(Tb0909Sligvl044 record);

    int insertSelective(Tb0909Sligvl044 record);

    Tb0909Sligvl044 selectByPrimaryKey(Tb0909Sligvl044Key key);

    int updateByPrimaryKeySelective(Tb0909Sligvl044 record);

    int updateByPrimaryKey(Tb0909Sligvl044 record);
}