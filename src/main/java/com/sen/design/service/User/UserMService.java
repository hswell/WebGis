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
    public boolean insert(SysUser sysUser){
        if (sysUser==null){
            return false;
        }
        SysUser exit=new SysUser();
        exit=sysUserMapper.selectByName(sysUser.getUNAME());
        if (exit!=null){
            return false;
        }
        long i=5273;
        sysUser.setUSERID(i++);
        sysUser.setVALID("1");
        sysUser.setISSYS("1");
        sysUser.setUTYPE("3");
        try {
            sysUserMapper.insert(sysUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SysUser mysysUser= sysUserMapper.selectByName(sysUser.getUNAME());
        if (mysysUser!=null){
            return true;
        }
        return false;
    }


}
