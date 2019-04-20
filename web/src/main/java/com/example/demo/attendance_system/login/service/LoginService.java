package com.example.demo.attendance_system.login.service;

import modules.login.entity.Login;

public interface LoginService {
    boolean getLogin(Login login);
    boolean register(Login login);
}
