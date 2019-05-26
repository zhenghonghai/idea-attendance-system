package com.example.demo.attendance_system.personMessage.service;

import modules.personMessage.entity.PersonMessage;

import java.util.Map;

public interface PersonMessageService {

    PersonMessage getPersonMessage(PersonMessage personMessage);

    String changePassword(Map<String,String> params);
}
