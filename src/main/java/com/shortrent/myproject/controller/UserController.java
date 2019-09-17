package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.model.AjaxResponse;
import com.shortrent.myproject.generator.model.Order;
import com.shortrent.myproject.generator.model.User;
import com.shortrent.myproject.service.OrderService;
import com.shortrent.myproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.reflect.MethodDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;


@Slf4j
@Controller
@RequestMapping("/purerent")
public class UserController {

    @Resource(name="userServiceImpl")
    UserService userService;

    @PostMapping("/user")
    public @ResponseBody
    AjaxResponse saveUser(User user){

        log.info("saveUser:{}",user);
        userService.saveUser(user);
        return AjaxResponse.success(user);
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
}
