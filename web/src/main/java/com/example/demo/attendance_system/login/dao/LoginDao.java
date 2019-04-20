package com.example.demo.attendance_system.login.dao;

import modules.login.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;
import sun.rmi.runtime.Log;

import java.util.List;

@Mapper
public interface LoginDao {

    boolean getLogin(@Param("login") Login login);

    boolean selectTel(String tel);

    boolean register(@Param("register") Login login);
}
