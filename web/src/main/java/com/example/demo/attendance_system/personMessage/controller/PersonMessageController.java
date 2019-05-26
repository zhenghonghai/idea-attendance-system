package com.example.demo.attendance_system.personMessage.controller;

import com.example.demo.attendance_system.personMessage.service.PersonMessageService;
import modules.personMessage.entity.PersonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class PersonMessageController {
    @Autowired
    private PersonMessageService personMessageService;


    /**
     * 获取个人信息
     * @param personMessage
     * @return
     */
    @PostMapping("/home/personMessage")
    public PersonMessage getPersonMessage(PersonMessage personMessage){
        return  personMessageService.getPersonMessage(personMessage);
    }

    /**
     * 修改密码
     * @param params
     * @return
     */
    @PostMapping("/home/changePassword")
    public PersonMessage changePassword(@RequestParam Map<String,String> params){
        return  personMessageService.changePassword(params);
    }


}
