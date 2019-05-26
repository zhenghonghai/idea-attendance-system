package com.example.demo.attendance_system.personMessage.dao;

import modules.personMessage.entity.PersonMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMessageDao {
    PersonMessage getPersonMessage(@Param("personMessage") PersonMessage personMessage);

    PersonMessage getPersonMessageById(String id);

    int changePassword(String id ,String newPassword);
}
