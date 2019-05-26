package com.example.demo.attendance_system.personMessage.service.impl;

import com.example.demo.attendance_system.personMessage.dao.PersonMessageDao;
import com.example.demo.attendance_system.personMessage.service.PersonMessageService;
import modules.personMessage.entity.PersonMessage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class PersonMessageServiceImpl implements PersonMessageService {
    @Resource
    private PersonMessageDao personMessageDao;
    @Override
    public PersonMessage getPersonMessage(PersonMessage personMessage) {
        PersonMessage p = personMessageDao.getPersonMessage(personMessage);
        return p;
    }
    @Override
    public PersonMessage changePassword(Map<String,String> params) {
        // 根据id获取对象
        String id = params.get("id");
        PersonMessage personMessage = personMessageDao.getPersonMessageById(id);
        if(personMessage != null){
            if(params.get("oldPassword").equals(personMessage.getPassword())){
                // 旧密码正确修改新密码
                String newPassword = params.get("newPassword");
                String changePassword = params.get("changePassword");
                if(newPassword.equals(changePassword)){

                    int i =  personMessageDao.changePassword(id,newPassword);
                    if(i>0){
                        PersonMessage newPasswordMessage = personMessageDao.getPersonMessageById(id);
                        return newPasswordMessage;
                    }else {
                        System.out.println("更新密码失败");
                    }
                }else {
                    System.out.println("两次密码输入不一致");
                    return null;
                }
            }else{
                System.out.println("旧密码错误");
                return null;
            }
        }else{
            System.out.println("id错误");
            return null;
        }
        return null;
    }
}
