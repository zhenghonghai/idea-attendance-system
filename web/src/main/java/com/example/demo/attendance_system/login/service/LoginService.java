package com.example.demo.attendance_system.login.service;

import modules.login.entity.Login;
import sun.rmi.runtime.Log;

import java.util.List;

public interface LoginService {
    boolean getLogin(Login login);
    Login register(Login login);
    List<Login> login();
}
