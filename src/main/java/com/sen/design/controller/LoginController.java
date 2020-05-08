package com.sen.design.controller;



import com.sen.design.entity.SYS.SysUser;
import com.sen.design.service.User.UserMService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by EalenXie on 2018/1/11.
 */
@Controller

public class LoginController {
    @Resource
    UserMService userMService;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping("/")
    public String root() {
        return "index";
    }

    public SysUser getUser() { //为了session从获取用户信息,可以配置如下
        SysUser user = new SysUser();
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        if (auth.getPrincipal() instanceof UserDetails) user = (SysUser) auth.getPrincipal();
        return user;
    }
    @GetMapping("/register")
    public String register() {
        return "register";
    }
    @RequestMapping(value = "/doRegister")
    public String doRegister(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam("tel") String tel){
        SysUser user=new SysUser();
        user.setUNAME(username);
        user.setPWD(password);
        user.setDFTEL(tel);
        if(user!=null&&userMService.insert(user)==true){
            return "login";
        }

        return "register";
    }


    public HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
