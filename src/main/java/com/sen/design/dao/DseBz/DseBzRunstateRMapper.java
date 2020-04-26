package com.sen.design.dao.DseBz;

import com.sen.design.entity.DseBz.DseBzRunState;
import com.sen.design.entity.DseBz.DseBzRuninfoR;
import com.sen.design.entity.DseBz.DseBzRunstateR;
import com.sen.design.entity.DseBz.DseBzRunstateRKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface DseBzRunstateRMapper {
    int deleteByPrimaryKey(DseBzRunstateRKey key);

    int insert(DseBzRunstateR record);

    int insertSelective(DseBzRunstateR record);
    DseBzRunstateR selectLatestM(String stcd);
    DseBzRunstateR selectByPrimaryKey(DseBzRunstateRKey key);
    List<DseBzRunstateR> selectByStcdTime(@Param("STCD")String STCD, @Param("startTM") Date startTM, @Param("endTM") Date endTM);
    int updateByPrimaryKeySelective(DseBzRunstateR record);

    int updateByPrimaryKey(DseBzRunstateR record);
}