package com.sen.design.dao.DseST;

import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseST.DseStPptnReal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
@Mapper
public interface DseStPptnRealMapper {
    int deleteByPrimaryKey(String STCD);

    int insert(DseStPptnReal record);

    int insertSelective(DseStPptnReal record);
    List<DseStPptnReal> selectAll();
    DseStPptnReal selectByPrimaryKey(String STCD);
    List<DseStPptnReal> selectByStcdTime(@Param("STCD")String STCD, @Param("startTM") Date startTM, @Param("endTM") Date endTM);
    int updateByPrimaryKeySelective(DseStPptnReal record);

    int updateByPrimaryKey(DseStPptnReal record);
}