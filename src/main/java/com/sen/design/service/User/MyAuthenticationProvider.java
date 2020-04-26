package com.sen.design.service.User;

import com.sen.design.entity.SYS.SysUser;
import com.sen.design.service.User.UserMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class MyAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    UserMService userMService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = authentication.getName();// 这个获取表单输入中返回的用户名;
        String password = (String) authentication.getCredentials();// 这个是表单中输入的密码；
        // 这里构建来判断用户是否存在和密码是否正确
        SysUser sysUser=userMService.loadUserByUsername(userName);
        if (sysUser==null){
            throw new BadCredentialsException("用户名不存在");
        }
        if (!sysUser.getPWD().equals(password)){
            throw new BadCredentialsException("密码不正确");
        }
        Collection<? extends GrantedAuthority> authorities = sysUser.getAuthorities();
        // 构建返回的用户登录成功的token
        return new UsernamePasswordAuthenticationToken(sysUser,password,authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        // TODO Auto-generated method stub
        // retrun true;表示是支持这个执行
        return  true;
    }
}
