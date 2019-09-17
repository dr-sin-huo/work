package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.dao.HURelateDao;
import com.shortrent.myproject.generator.model.*;
import com.shortrent.myproject.service.HouseService;
import com.shortrent.myproject.service.OrderService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/purerent")
public class OrderController {
    @Resource(name="orderServiceImpl")
    OrderService orderService;

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
        String o_applicant=request.getParameter("o_applicant");
        String o_houseid=request.getParameter("o_houseid");
        String leavetimeyear=request.getParameter("leavetimeyear");
        String leavetimemonth=request.getParameter("leavetimemonth");
        String leavetimeday=request.getParameter("leavetimeday");
        String leavetime=leavetimeyear+"-"+leavetimemonth+"-"+leavetimeday+" 12:00:00";
        HURelateExample huRelateExample=new HURelateExample();
        HURelateExample.Criteria criteria=huRelateExample.createCriteria();
        log.info("sfdasfasfasfasfdsafsa");
        log.info(o_houseid);
        log.info(o_applicant);
        log.info(leavetime);
        criteria.andHIdEqualTo(Integer.valueOf(o_houseid));
        List<HURelate> huRelates = huRelateDao.selectByExample(huRelateExample);
        Integer o_acceptor=huRelates.get(0).getuId();
        Order order=new Order();
        order.setoAcceptor(o_acceptor);
        order.setoApplicant(Integer.valueOf(o_applicant));
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        order.setoStarttime(date);
        Date o_endtime=format.parse(leavetime);
        order.setoEndtime(o_endtime);
        order.setoHouseid(Integer.valueOf(o_houseid));
        order.setoStatus("正常");
        orderService.saveOrder(order);
        log.info("159357123345668999");
        log.info(format.format(date));
        return order;
    }
}
