package com.example.demo.attendance_system.login.controller;

import com.example.demo.attendance_system.login.service.LoginService;
import modules.login.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 登录
     * @param login（账号、密码）
     * @return
     */
    @PostMapping("/login")
    public boolean getLogin(Login login){
        return loginService.getLogin(login);
    }

    /**
     * 注册
     * @param login (账号、密码、邮箱、手机)
     * @return
     */
    @RequestMapping("/register")
    public boolean register(Login login){
        return loginService.register(login);
    }

}
