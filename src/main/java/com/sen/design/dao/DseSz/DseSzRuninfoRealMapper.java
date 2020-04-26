package com.sen.design.dao.DseSz;

import com.sen.design.entity.DseBz.DseBzRunstateR;
import com.sen.design.entity.DseSz.DseSzRuninfoReal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface DseSzRuninfoRealMapper {
    int deleteByPrimaryKey(String STCD);

    int insert(DseSzRuninfoReal record);

    int insertSelective(DseSzRuninfoReal record);
    List<String> getAllSTCD();
    List<DseSzRuninfoReal> selectByStcdTime(@Param("STCD")String STCD, @Param("startTM") Date startTM, @Param("endTM") Date endTM);
    DseSzRuninfoReal selectByPrimaryKey(String STCD);

    int updateByPrimaryKeySelective(DseSzRuninfoReal record);

    int updateByPrimaryKey(DseSzRuninfoReal record);
}