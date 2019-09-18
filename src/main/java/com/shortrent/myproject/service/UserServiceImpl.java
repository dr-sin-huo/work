package com.shortrent.myproject.service;


import com.shortrent.myproject.generator.dao.UserDao;
import com.shortrent.myproject.generator.model.User;
import com.shortrent.myproject.generator.model.UserExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.*;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;



@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.insert(user);
    }

    @Override
    public void deleteUser(Integer usrId) {
        userDao.deleteByPrimaryKey(usrId);
    }

    @Override
    public User getUser(Integer usrId) {
        User user=userDao.selectByPrimaryKey(usrId);
        return user;
    }

    @Override
    public List<User> getUserByphone(User user) {
        UserExample userExample=new UserExample();

        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUserPhoneEqualTo(user.getUserPhone());

        return userDao.selectByExample(userExample);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> getAll() {
        List<User> users=userDao.selectByExample(null);
        return users;
    }



    @Override
    public SendSmsResponse sendMessage(String phoneNumber, int demonum, HttpServletRequest request1) throws ClientException {

        String code=rand(6);
        request1.getSession().setAttribute("checkcode",code);

        String demo="";//模板类型

        if(demonum==1)
        {
            demo = "SMS_170180354";//注册模板
        }
        else
        {
            demo="SMS_174020102";//找回密码模板
        }

        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIX1BcLE0CkgcA", "fTSIJs7nvh5tqLceYGZwZpHXFs97sr");
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Dysmsapi", "dysmsapi.aliyuncs.com");
        IAcsClient acsClient = new DefaultAcsClient(profile);
        SendSmsRequest request = new SendSmsRequest();
        request.setPhoneNumbers(phoneNumber);//****处填写接收方的手机号码
        request.setSignName("纯粹短租网");//此处填写已申请的短信签名
        request.setTemplateCode(demo);//此处填写获得的短信模版CODE
        request.setTemplateParam("{\"code\":\""+code+"\"}");//此处对应填写验证码
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);


        if(sendSmsResponse.getCode()!= null && sendSmsResponse.getCode().equals("OK")){
            System.out.println("短信发送成功！");
        }else {
            System.out.println("短信发送失败！");
        }

        return  sendSmsResponse;
    }

    @Override
    public String rand(int num){
        Random ran = new Random();
        StringBuffer sb = new StringBuffer("");
        String[] code = { "A",  "B",  "C",  "D",  "E",
                "F",  "G",  "H", "I",  "J",  "K",
                "L",  "M",  "N",  "O",  "P",  "Q",
                "R",  "S",  "T",  "U",  "V",  "W",
                "X",  "Y",  "Z",  "0", "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "0", "1", "2", "3", "4", "5", "6", "7",
                "8", "9", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "1",
                "2", "3", "4", "5", "6", "7", "8", "9", "0", "1","A",  "B",  "C",  "D",  "E",
                "F",  "G",  "H", "I",  "J",  "K",
                "L",  "M",  "N",  "O",  "P",  "Q",
                "R",  "S",  "T",  "U",  "V",  "W",
                "X",  "Y",  "Z",  };
        for (int i = 0; i < num; i++) {
            String str = code[ran.nextInt(code.length)];
            sb.append(str);
        }
        String codeInfo = sb.toString();
        return codeInfo;
    }

}
