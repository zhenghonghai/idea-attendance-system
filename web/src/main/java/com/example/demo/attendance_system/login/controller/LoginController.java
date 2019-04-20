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

    @PostMapping("/")
    public boolean getLogin(@RequestBody Login login){
        return loginService.getLogin(login);
    }

    @RequestMapping("/login")
    public List<Login> login(){
        System.out.println("------------1111----------");
        return loginService.login();
    }


    @RequestMapping("/register")
    public Login register(@RequestBody Login login){
        return loginService.register(login);
    }

}
