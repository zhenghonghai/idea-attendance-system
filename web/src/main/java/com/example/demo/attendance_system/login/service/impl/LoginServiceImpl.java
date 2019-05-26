package com.example.demo.attendance_system.login.service.impl;

import com.example.demo.attendance_system.login.dao.LoginDao;
import com.example.demo.attendance_system.login.service.LoginService;
import modules.login.entity.Login;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    @Override
    public Login getLogin(Login login) {
        return loginDao.getLogin(login);
    }

    @Override
    public String register(Login login) {
        if(loginDao.selectTel(login.getTel())){
            return "该手机号码已经被注册过";
        }else {
            if(loginDao.selectUsername(login.getUsername())){
                return  "该用户名已经存在";
            }else {
                UUID uuid = UUID.randomUUID();
                String id = uuid.toString().replace("-","");
                login.setId(id);
                loginDao.register(login);
                return "注册成功";
            }
        }
    }
}
