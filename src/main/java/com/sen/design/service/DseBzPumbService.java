package com.sen.design.service;

import com.sen.design.dao.AdCdBMapper;
import com.sen.design.dao.DseBzPumbMapper;
import com.sen.design.entity.AdCdB;
import com.sen.design.entity.DseBzPumb;
import com.sen.design.entity.DseBzPumbKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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


}
