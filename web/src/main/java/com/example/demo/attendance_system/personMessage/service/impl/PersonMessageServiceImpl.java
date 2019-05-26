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
    public String changePassword(Map<String,String> params) {
        // 根据id获取对象
        String id = params.get("id");
        String oldPassword =params.get("oldPassword");
        String newPassword = params.get("newPassword");
        String checkPassword = params.get("checkPassword");
        PersonMessage personMessage = personMessageDao.getPersonMessageById(id);
        if(personMessage != null){
            if(oldPassword.equals(personMessage.getPassword())){
                // 旧密码正确修改新密码
                if(newPassword.equals(checkPassword)){
                    int i =  personMessageDao.changePassword(id,newPassword);
                    if(i == 1){
                        return "修改密码成功";
                    }else {
                       return "更新密码失败";
                    }
                }else {
                    return "两次密码输入不一致";
                }
            }else{
                return "旧密码错误";
            }
        }else{
            return "获取id错误";
        }
    }
}
