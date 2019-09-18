package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.model.Admin;
import com.shortrent.myproject.generator.model.House;
import com.shortrent.myproject.generator.model.Order;
import com.shortrent.myproject.generator.model.User;
import com.shortrent.myproject.service.HouseService;
import com.shortrent.myproject.service.MailService;
import com.shortrent.myproject.service.OrderService;
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
import java.math.BigInteger;
import java.sql.Date;
import java.text.SimpleDateFormat;

@Controller
@Slf4j
@RequestMapping("/purerent")
public class TemplateController {

    @Resource
    private HouseService houseService;

    @Resource
    private UserService userService;

    @Resource
    private MailService mailService;

    @Resource
    private OrderService orderService;

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
        request.getSession().setAttribute("checkcode","fdsfsaretvbcoubir");
        if(login!=null) {
            model.addAttribute("login", login.toString());
        }
        else {
            model.addAttribute("login",0);
        }
        return "indextemp";
    }

    @GetMapping("/housesearchcontroller")
    public String housesearch(HttpServletRequest request,Model model) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String city=request.getParameter("city");
        log.info(city);
        String indate=request.getParameter("indate");
        log.info(indate);
        model.addAttribute("city",city);
        model.addAttribute("indate",indate);
        return "housesearch1";
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
        String startime=request.getParameter("startime");
        String leavetime=request.getParameter("leavetime");
        House house=houseService.getHouse(Integer.valueOf(hId));
        log.info(startime);
        log.info(leavetime);
        model.addAttribute("house",house);
        model.addAttribute("startime",startime);
        model.addAttribute("leavetime",leavetime);
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
    public String perinfo(Model model,HttpServletRequest request){
        String userPhone=request.getSession().getAttribute("login").toString();
        User user1=new User();
        BigInteger userPhone1=new BigInteger(userPhone);
        user1.setUserPhone(userPhone1);
        User user = userService.getUserByphone(user1).get(0);
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String birthday=format.format(user.getUserBirthday());
        log.info("456465445645646465456456");
        log.info(user.getUserPhone().toString());
        model.addAttribute("user",user);
        model.addAttribute("birthday",birthday);
        return "perinfo";
    }

    @GetMapping("/toreninfo")
    public String reninfo(Model model,HttpServletRequest request){
        String userPhone=request.getSession().getAttribute("login").toString();
        User user1=new User();
        BigInteger userPhone1=new BigInteger(userPhone);
        user1.setUserPhone(userPhone1);
        User user = userService.getUserByphone(user1).get(0);
        log.info("456465445645646465456456");
        log.info(user.getUserPhone().toString());
        model.addAttribute("user",user);
        return "reninfo";
    }

    @GetMapping("/toorderdetail")
    public String orderdetail(Model model,HttpServletRequest request){
        String orderId=request.getParameter("orderId");
        Order order=orderService.getOrder(Integer.valueOf(orderId));
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String starttime=format.format(order.getoStarttime());
        String endtime=format.format(order.getoEndtime());
        model.addAttribute("order",order);
        model.addAttribute("starttime",starttime);
        model.addAttribute("endtime",endtime);
        return "orderdetail";
    }

    @GetMapping("/toperinfoedit")
    public String perinfoedit(Model model,HttpServletRequest request){
        String userId=request.getParameter("usrId");
        User user=userService.getUser(Integer.valueOf(userId));
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String birthday=format.format(user.getUserBirthday());
        log.info("edit");
        log.info(userId);
        log.info(user.getUserPhone().toString());
        model.addAttribute("user",user);
        model.addAttribute("birthday",birthday);
        return "perinfoedit";
    }

    @GetMapping("/toreninfoedit")
    public String reninfoedit(Model model,HttpServletRequest request){
        String userId=request.getParameter("usrId");
        User user=userService.getUser(Integer.valueOf(userId));
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String birthday=format.format(user.getUserBirthday());
        model.addAttribute("user",user);
        model.addAttribute("birthday",birthday);
        return "reninfoedit";
    }

}