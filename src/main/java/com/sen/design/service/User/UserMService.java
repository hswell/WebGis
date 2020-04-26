package com.sen.design.service.User;

import com.sen.design.dao.SYS.SysUserMapper;
import com.sen.design.entity.SYS.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserMService implements UserDetailsService {
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser loadUserByUsername(String name) throws UsernameNotFoundException {
        SysUser sysUser=sysUserMapper.selectByName(name);
        if (sysUser==null){
            throw new UsernameNotFoundException("user + " + name + "not found.");
        }
        return sysUser;
    }


}
