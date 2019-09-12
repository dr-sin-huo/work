package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.model.Admin;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/purerent")
public class TemplateController {


    @GetMapping("/thymeleaf")
    public String index(Model model) {

        Admin admin=new Admin();
        model.addAttribute("admin",admin);

        //模版名称，实际的目录为：resources/templates/thymeleaftemp.html
        return "thymeleaftemp";
    }

    @GetMapping("/index")
    public String index() {
        return "indextemp";
    }

    @GetMapping("/housere1")
    public String houserelease(){
        return "houserelease";
    }

    @GetMapping("/housere2")
    public String houserelease2(){
        return "houserelease2";
    }

    @GetMapping("/housere3")
    public String houserelease3(){
        return "houserelease3";
    }

    @GetMapping("/housere4")
    public String houserelease4(){
        return "houserelease4";
    }

}