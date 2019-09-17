package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.model.Admin;
import com.shortrent.myproject.generator.model.House;
import com.shortrent.myproject.generator.model.User;
import com.shortrent.myproject.service.HouseService;
import com.shortrent.myproject.service.MailService;
import com.shortrent.myproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.lang.model.element.NestingKind;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@Slf4j
@RequestMapping("/purerent")
public class TemplateController {

    @Resource
    private HouseService houseService;

    @Resource (name = "userServiceImpl")
    private UserService userService;

    @Resource
    private MailService mailService;

    @GetMapping("/thymeleaf")
    public String index(Model model) {

        Admin admin=new Admin();
        model.addAttribute("admin",admin);

        //模版名称，实际的目录为：resources/templates/thymeleaftemp.html
        return "thymeleaftemp";
    }

    @GetMapping("/index")
    public String index(Model model,HttpServletRequest request) {
        Object login=request.getSession().getAttribute("login");
        if(login!=null) {
            model.addAttribute("login", login.toString());
        }
        else {
            model.addAttribute("login",0);
        }
        return "indextemp";
    }

    @GetMapping("/housesearchcontroller")
    public String housesearch(){
        return "housesearch";
    }

    @GetMapping("/housere1")
    public String houserelease(){
        return "houserelease";
    }

    @GetMapping("/housere2")
    public String houserelease2(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String H_type=request.getParameter("H_type");
        request.getSession().setAttribute("H_type",H_type);
        String H_retype=request.getParameter("H_retype");
        request.getSession().setAttribute("H_retype",H_retype);
        String H_hutype=request.getParameter("H_hutype");
        request.getSession().setAttribute("H_hutype",H_hutype);
        String H_area=request.getParameter("H_area");
        request.getSession().setAttribute("H_area",H_area);
        String H_batype=request.getParameter("H_batype");
        request.getSession().setAttribute("H_batype",H_batype);
        String H_bedinfo=request.getParameter("H_bedinfo");
        request.getSession().setAttribute("H_bedinfo",H_bedinfo);
        String H_Sunum=request.getParameter("H_Sunum");
        request.getSession().setAttribute("H_Sunum",H_Sunum);
        String H_cohabitation=request.getParameter("H_cohabitation");
        request.getSession().setAttribute("H_cohabitation",H_cohabitation);
        String H_Sihouse=request.getParameter("H_Sihouse");
        request.getSession().setAttribute("H_Sihouse",H_Sihouse);
        return "houserelease2";
    }

    @GetMapping("/housere3")
    public String houserelease3(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String H_name=request.getParameter("H_name");
        request.getSession().setAttribute("H_name",H_name);
        String H_pedescription=request.getParameter("H_pedescription");
        request.getSession().setAttribute("H_pedescription",H_pedescription);
        String H_insituation=request.getParameter("H_insituation");
        request.getSession().setAttribute("H_insituation",H_insituation);
        String H_traffic=request.getParameter("H_traffic");
        request.getSession().setAttribute("H_traffic",H_traffic);
        String H_beside=request.getParameter("H_beside");
        request.getSession().setAttribute("H_beside",H_beside);
        return "houserelease3";
    }

    @GetMapping("/housere4")
    public String houserelease4(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String H_bath=request.getParameter("H_bath");
        request.getSession().setAttribute("H_bath",H_bath);
        String H_electro=request.getParameter("H_electro");
        request.getSession().setAttribute("H_electro",H_electro);
        String H_facilities=request.getParameter("H_facilities");
        request.getSession().setAttribute("H_facilities",H_facilities);
        String H_spefac=request.getParameter("H_spefac");
        request.getSession().setAttribute("H_spefac",H_spefac);
        String H_require=request.getParameter("H_require");
        request.getSession().setAttribute("H_require",H_require);
        String H_price=request.getParameter("H_price");
        request.getSession().setAttribute("H_price",H_price);
        return "houserelease4";
    }

    @GetMapping("/msg")
    public @ResponseBody String msg(){
        String Msg="123";
        return Msg;
    }

    @GetMapping("/mail")
    public void mail(HttpServletRequest request){
        log.info("456798");

        String to=(String)request.getParameter("to");
        String subject=(String)request.getParameter("subject");
        String content=(String)request.getParameter("content");

        log.info(to);
        log.info(subject);
        log.info(content);
        mailService.sendSimpleMail(to,subject,content);
    }

    @GetMapping("/tohousedetail")
    public String housedetail(Model model,HttpServletRequest request){
        String hId=request.getParameter("hId");
        String leavetimeyear=request.getParameter("leavetimeyear");
        String leavetimemonth=request.getParameter("leavetimemonth");
        String leavetimeday=request.getParameter("leavetimeday");
        House house=houseService.getHouse(Integer.valueOf(hId));
        model.addAttribute("house",house);
        model.addAttribute("leavetimeyear",leavetimeyear);
        model.addAttribute("leavetimemonth",leavetimemonth);
        model.addAttribute("leavetimeday",leavetimeday);
        return "housedetail";
    }

    @GetMapping("/totenantpage")
    public String tenantpage(){
        return "tenantpage";
    }

    @GetMapping("/tolandlordpage")
    public String landlordpage(){
        return "landlordpage";
    }

    @GetMapping("/toperinfo")
    public String perinfo(){
        return "perinfo";
    }
}