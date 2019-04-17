package com.example.demo.attendance_system.login.controller;

import com.example.demo.attendance_system.login.service.LoginService;
import modules.login.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public List<Login> getLogin(){
        return loginService.getLogin();
    }

}
