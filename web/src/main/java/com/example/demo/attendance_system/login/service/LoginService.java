package com.example.demo.attendance_system.login.service;

import modules.login.entity.Login;

public interface LoginService {
    Login getLogin(Login login);
    String register(Login login);
}
