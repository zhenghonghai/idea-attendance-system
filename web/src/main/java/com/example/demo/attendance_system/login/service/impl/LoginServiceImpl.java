package com.example.demo.attendance_system.login.service.impl;

import com.example.demo.attendance_system.login.dao.LoginDao;
import com.example.demo.attendance_system.login.service.LoginService;
import modules.login.entity.Login;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    @Override
    public List<Login> getLogin() {
        return loginDao.getLogin();
    }
}
