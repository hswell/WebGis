package com.sen.design.dao.SYS;

import com.sen.design.entity.SYS.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long USERID);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long USERID);
    Long login(SysUser user);
    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}