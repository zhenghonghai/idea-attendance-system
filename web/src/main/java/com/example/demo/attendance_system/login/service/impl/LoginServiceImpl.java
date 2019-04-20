package com.example.demo.attendance_system.login.service.impl;

import com.example.demo.attendance_system.login.dao.LoginDao;
import com.example.demo.attendance_system.login.service.LoginService;
import modules.login.entity.Login;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    @Override
    public boolean getLogin(Login login) {
        return loginDao.getLogin(login);
    }

    @Override
    public boolean register(Login login) {
        boolean flag = loginDao.selectTel(login.getTel());
        if(flag){
            return false;
        }else {
            loginDao.register(login);
            return true;
        }


    }
}
