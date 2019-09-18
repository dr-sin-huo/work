package com.shortrent.myproject.service;


import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.shortrent.myproject.generator.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {
    void saveUser(User user);

    void deleteUser(Integer usrId);

    User getUser(Integer usrId);

    void updateUser(User user);

    List<User> getUserByphone(User user);

    List<User> getAll();

    public SendSmsResponse sendMessage(String phoneNumber, int demonum, HttpServletRequest request1) throws ClientException;

    public String rand( int num);

}
