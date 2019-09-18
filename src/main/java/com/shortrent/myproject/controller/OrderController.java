package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.dao.HURelateDao;
import com.shortrent.myproject.generator.dao.OrderDao;
import com.shortrent.myproject.generator.model.*;
import com.shortrent.myproject.service.HouseService;
import com.shortrent.myproject.service.OrderService;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import com.shortrent.myproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/purerent")
public class OrderController {
    @Resource(name="orderServiceImpl")
    OrderService orderService;

    @Resource
    OrderDao orderDao;

    @Resource
    UserService userService;

    @Resource(name = "houseServiceImpl")
    HouseService houseService;

    @Resource
    HURelateDao huRelateDao;

    @PostMapping("/order")
    public @ResponseBody
    AjaxResponse saveOrder(@RequestBody Order order){

        log.info("saveOrder:{}",order);
        orderService.saveOrder(order);
        return AjaxResponse.success(order);
    }

    @GetMapping("/order/{id}")
    public @ResponseBody AjaxResponse getOrder(@RequestBody Integer oId){
        log.info("getOrder:{}",orderService.getOrder(oId));
        return AjaxResponse.success();
    }

    @GetMapping("/order")
    public @ResponseBody AjaxResponse getAll(){
        return AjaxResponse.success(orderService.getAll());
    }

    @DeleteMapping("/order/{id}")
    public @ResponseBody AjaxResponse deleteOrder(@RequestBody Integer oId){
        orderService.deleteOrder(oId);
        return AjaxResponse.success();
    }

    @GetMapping("/produceorder")
    public @ResponseBody Order produceorder(HttpServletRequest request) throws ParseException {
        String o_applicant1=request.getParameter("applicant");
        String o_amount=request.getParameter("amount");
        BigInteger o_applicant=new BigInteger(o_applicant1);
        User user=new User();
        user.setUserPhone(o_applicant);
        Integer uid=userService.getUserByphone(user).get(0).getUsrId();
        String o_houseid=request.getParameter("houseid");
        String leavetime1=request.getParameter("leavetime");
        String leavetime=leavetime1+" 12:00:00";
        HURelateExample huRelateExample=new HURelateExample();
        HURelateExample.Criteria criteria=huRelateExample.createCriteria();
        log.info("sfdasfasfasfasfdsafsa");
        log.info(o_houseid);
        log.info(leavetime);
        criteria.andHIdEqualTo(Integer.valueOf(o_houseid));
        List<HURelate> huRelates = huRelateDao.selectByExample(huRelateExample);
        Integer o_acceptor=huRelates.get(0).getuId();
        Order order=new Order();
        order.setoAcceptor(o_acceptor);
        order.setoApplicant(uid);
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        order.setoStarttime(date);
        Date o_endtime=format.parse(leavetime);
        order.setoEndtime(o_endtime);
        order.setoHouseid(Integer.valueOf(o_houseid));
        order.setoStatus("正常");
        order.setoAmount(Integer.valueOf(o_amount));
        orderService.saveOrder(order);
        log.info("159357123345668999");
        log.info(format.format(date));
        return order;
    }

    @GetMapping("/getorderbyacuid")
    public @ResponseBody List<Order> getorderbyacuid(HttpServletRequest request, Model model) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String userPhone=request.getSession().getAttribute("login").toString();
        BigInteger userPhone1=new BigInteger(userPhone);
        User user=new User();
        user.setUserPhone(userPhone1);
        Integer uid=userService.getUserByphone(user).get(0).getUsrId();
        OrderExample orderExample=new OrderExample();
        OrderExample.Criteria criteria=orderExample.createCriteria();
        criteria.andOApplicantEqualTo(uid);
        List<Order> orders=orderDao.selectByExample(orderExample);
        return orders;
    }

    @GetMapping("/getorderbyreuid")
    public @ResponseBody List<Order> getorderbyreuid(HttpServletRequest request, Model model){
        String userPhone=request.getSession().getAttribute("login").toString();
        BigInteger userPhone1=new BigInteger(userPhone);
        User user=new User();
        user.setUserPhone(userPhone1);
        Integer uid=userService.getUserByphone(user).get(0).getUsrId();
        OrderExample orderExample=new OrderExample();
        OrderExample.Criteria criteria=orderExample.createCriteria();
        criteria.andOAcceptorEqualTo(uid);
        List<Order> orders=orderDao.selectByExample(orderExample);
        return orders;
    }

    @GetMapping("/getorderbyhid")
    public @ResponseBody List<Order> getorderbyhid(HttpServletRequest request, Model model){
        String hid=request.getParameter("hid");
        OrderExample orderExample=new OrderExample();
        OrderExample.Criteria criteria=orderExample.createCriteria();
        criteria.andOHouseidEqualTo(Integer.valueOf(hid));
        List<Order> orders=orderDao.selectByExample(orderExample);
        return orders;
    }

}
