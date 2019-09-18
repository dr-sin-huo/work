package com.shortrent.myproject.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.shortrent.myproject.generator.model.AjaxResponse;
import com.shortrent.myproject.generator.model.Order;
import com.shortrent.myproject.generator.model.User;
import com.shortrent.myproject.service.OrderService;
import com.shortrent.myproject.service.UserService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.reflect.MethodDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.ListUI;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;




@Slf4j
@Controller
@RequestMapping("/purerent")
public class UserController {

    @Resource(name="userServiceImpl")
    UserService userService;

    @PostMapping("/user")
    public @ResponseBody String saveUser(HttpServletRequest request){
        User user=new User();
        String userPhone=request.getParameter("userPhone");
        BigInteger userPhone1=new BigInteger(userPhone);
        user.setUserPhone(userPhone1);
        String usrPasswor=request.getParameter("usrPassword");
        user.setUsrPassword(usrPasswor);
        String checkcode=request.getSession().getAttribute("checkcode").toString();
        String checkcode1=request.getParameter("checkcode1");
        String flag;
        if (checkcode.equals(checkcode1)){
            userService.saveUser(user);
            flag="true";
            log.info("yes");
        }
        else {
            flag="flase";
            log.info("no");
        }
        log.info("saveUser:{}",user);

        return flag;
    }



    @GetMapping("/login")
    public String login(User user, Model model,HttpServletRequest request){
        List<User> users = userService.getUserByphone(user);
        if(!users.isEmpty()) {
            if (users.get(0).getUsrPassword().equals(user.getUsrPassword())) {

                model.addAttribute("login", user.getUserPhone());
                request.getSession().setAttribute("login", user.getUserPhone());
                return "indextemp";
            } else {
                request.getSession().setAttribute("login",0);
                model.addAttribute("login",0);
                return "waring";
            }
        }

        else{
            return "waring";
        }


    }
    @GetMapping("/exit")
    public String exit(Model model,HttpServletRequest request){
        model.addAttribute("login",0);
        request.getSession().setAttribute("login",0);
        return "indextemp";
    }

    @GetMapping("/user/id")
    public @ResponseBody AjaxResponse getUser(Model model, Integer userId){
        User user = userService.getUser(userId);
        log.info("getUser:{}",user);
        model.addAttribute("user",user);
        return AjaxResponse.success();
    }

    @GetMapping("/user")
    public @ResponseBody AjaxResponse getAll(Model model){
        List<User> users=userService.getAll();
        model.addAttribute("users",users);
        return AjaxResponse.success(users);
    }

    @DeleteMapping("/user/id")
    public @ResponseBody AjaxResponse deleteUser(Integer userId){
        userService.deleteUser(userId);
        return AjaxResponse.success();
    }

    @GetMapping("/updatausermsg")
    public  String updatausermsg(User user,String userBirthday1,HttpServletRequest request) throws UnsupportedEncodingException, ParseException {
        request.setCharacterEncoding("utf-8");

        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date userBirthday=format.parse(userBirthday1);
        user.setUserBirthday(userBirthday);
        userService.updateUser(user);
        return "redirect:/purerent/totenantpage";
    }


    @RequestMapping("/send")
    public @ResponseBody String send(String phone,int demo,HttpServletRequest request) throws ClientException {
        log.info("122312132123132131");
        log.info(phone);
        SendSmsResponse sendSmsResponse= null;
        try {
            sendSmsResponse = userService.sendMessage(phone,demo,request);
        } catch (ClientException e) {
            e.printStackTrace();
        }
        String checkcode=request.getSession().getAttribute("checkcode").toString();
        log.info(request.getSession().getAttribute("checkcode").toString());

        return "chenggong";
    }



}
