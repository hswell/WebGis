package com.sen.design.dao.DseST;

import com.sen.design.entity.DseST.StStbprpB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StStbprpBMapper {
    int deleteByPrimaryKey(String STCD);

    int insert(StStbprpB record);

    int insertSelective(StStbprpB record);
    String getSTCD(String STNM);
    List<String> getAllName();
    List<String> getAllSTCD();
    StStbprpB selectByPrimaryKey(String STCD);

    int updateByPrimaryKeySelective(StStbprpB record);

    int updateByPrimaryKeyWithBLOBs(StStbprpB record);

    int updateByPrimaryKey(StStbprpB record);
}