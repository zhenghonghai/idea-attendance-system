package com.example.demo.attendance_system.login.dao;

import modules.login.entity.Login;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginDao {
    List<Login> getLogin();
}
