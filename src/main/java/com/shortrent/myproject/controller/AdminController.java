package com.shortrent.myproject.controller;


import com.shortrent.myproject.generator.model.Admin;
import com.shortrent.myproject.generator.model.AjaxResponse;
import com.shortrent.myproject.service.AdminService;
import com.shortrent.myproject.service.AdminServiceImpl;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/purerent")
public class AdminController {

    @Resource(name="adminServiceImpl")
    AdminService adminService;

    @PostMapping("/admins")
    public @ResponseBody AjaxResponse saveAdmin(Admin admin){
        log.info("k;lfakd");
        log.info("saveAdmin:{}",admin);
        adminService.saveAdmin(admin);
        return AjaxResponse.success(admin);
    }


    @PutMapping("/admins/id")
    public  @ResponseBody AjaxResponse updateAdmin(Admin admin){

        adminService.updateAdmin(admin);
        return AjaxResponse.success();
    }
    @GetMapping("/admins/id")
    public @ResponseBody AjaxResponse getAdmin(Integer adminId){
        log.info("getAdmin:{}",adminService.getAdmin(adminId));
        return AjaxResponse.success();
    }

    @GetMapping("/admins")
    public @ResponseBody AjaxResponse getAll(){
        log.info("554564564");
        return AjaxResponse.success(adminService.getAll());
    }

    @DeleteMapping("/admins/id")
    public @ResponseBody AjaxResponse deleteAdmin(Integer adminId){
        adminService.deleteAdmin(adminId);
        return AjaxResponse.success();
    }

}
