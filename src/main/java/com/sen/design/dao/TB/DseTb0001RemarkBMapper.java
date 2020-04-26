package com.sen.design.dao.TB;

import com.sen.design.entity.TB.DseTb0001RemarkB;
import com.sen.design.entity.TB.Tb0001Prnmsr044;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DseTb0001RemarkBMapper {
    int insert(DseTb0001RemarkB record);
    List<DseTb0001RemarkB> queryList();
    String getEnnmcd(String STCD);
    String getStcd(String ENNMCD);
    DseTb0001RemarkB selectByENNMCD(String ENNMCD);
    int insertSelective(DseTb0001RemarkB record);
}