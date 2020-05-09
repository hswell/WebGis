package com.sen.design.dao.DseBz;

import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseBz.DseBzRuninfoRKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface DseBzRuninfoRMapper {
    int deleteByPrimaryKey(DseBzRuninfoRKey key);

    int insert(DseBzRuninfoR record);

    int insertSelective(DseBzRuninfoR record);
    DseBzRuninfoR selectLatestM(String stcd);
    List<DseBzRuninfoR> selectLatestL(String stcd);
    List<String> getAllSTCD();
    DseBzRuninfoR selectByPrimaryKey(DseBzRuninfoRKey key);
    List<DseBzRuninfoR> selectByStcdTime(@Param("STCD")String STCD, @Param("startTM") Date startTM, @Param("endTM") Date endTM);
    int updateByPrimaryKeySelective(DseBzRuninfoR record);

    int updateByPrimaryKey(DseBzRuninfoR record);
}