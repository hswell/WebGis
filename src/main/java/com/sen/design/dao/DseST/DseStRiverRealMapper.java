package com.sen.design.dao.DseST;

import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseST.DseStRiverReal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface DseStRiverRealMapper {
    int deleteByPrimaryKey(String STCD);

    int insert(DseStRiverReal record);

    int insertSelective(DseStRiverReal record);
    List<DseStRiverReal> selectByStcdTime(@Param("STCD")String STCD, @Param("startTM") Date startTM, @Param("endTM") Date endTM);
    DseStRiverReal selectByPrimaryKey(String STCD);
    int updateByPrimaryKeySelective(DseStRiverReal record);

    int updateByPrimaryKey(DseStRiverReal record);
}