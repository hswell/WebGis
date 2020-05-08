package com.sen.design.service.BZ;

import com.sen.design.dao.DseBz.DseBzPumbMapper;
import com.sen.design.entity.DseBz.DseBzPumb;
import com.sen.design.entity.DseBz.DseBzPumbKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DseBzPumbService {
    @Autowired
    private DseBzPumbMapper dseBzPumbMapper;

    public List queryList() {
        return dseBzPumbMapper.queryList();
    }
    public List  queryByKey(String ENNMCD) {
        return  dseBzPumbMapper.querybykey(ENNMCD);
    }
    public DseBzPumb select(DseBzPumbKey key){
        return dseBzPumbMapper.selectByPrimaryKey(key);
    }

}
