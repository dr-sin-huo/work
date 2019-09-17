package com.shortrent.myproject.controller;

import com.shortrent.myproject.generator.dao.HouseDao;
import com.shortrent.myproject.generator.model.*;
import com.shortrent.myproject.service.CommentService;
import com.shortrent.myproject.service.HURelateService;
import com.shortrent.myproject.service.HouseService;
import com.shortrent.myproject.service.UserService;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import javax.mail.Multipart;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@Slf4j
@Controller
@RequestMapping("/purerent")
public class HouseController {
    @Resource(name="houseServiceImpl")
    HouseService houseService;

    @Resource(name = "HURelateServiceImpl")
    HURelateService huRelateService;

    @Resource(name = "userServiceImpl")
    UserService userService;

    @Resource
    HouseDao houseDao;

    @PostMapping("/house")
    public @ResponseBody
    AjaxResponse saveHouse(@RequestBody House house){

        log.info("saveHouse:{}",house);
        houseService.saveHouse(house);
        return AjaxResponse.success(house);
    }

    @GetMapping("/house/{id}")
    public @ResponseBody AjaxResponse getHouse(@RequestBody Integer hId){
        log.info("getHouse:{}",houseService.getHouse(hId));
        return AjaxResponse.success();
    }

    @GetMapping("/house")
    public @ResponseBody AjaxResponse getAll(){
        return AjaxResponse.success(houseService.getAll());
    }

    @DeleteMapping("/house/{id}")
    public @ResponseBody AjaxResponse deleteHouse(@RequestBody Integer hId){
        houseService.deleteHouse(hId);
        return AjaxResponse.success();
    }

    @PostMapping("/housesave")
    public String housesave(HttpServletRequest request, @RequestParam("img") MultipartFile file, Model model) throws UnsupportedEncodingException {
        House house=new House();
        request.setCharacterEncoding("utf-8");
        String H_type=(String)request.getSession().getAttribute("H_type");
        house.sethType(H_type);
        String H_retype=(String)request.getSession().getAttribute("H_retype");
        house.sethRetype(H_retype);
        String H_hutype=(String)request.getSession().getAttribute("H_hutype");
        house.sethHutype(H_hutype);
        String H_area=(String)request.getSession().getAttribute("H_area");
        house.sethArea(H_area);
        String H_batype=(String)request.getSession().getAttribute("H_batype");
        house.sethBatype(H_batype);
        String H_bedinfo=(String)request.getSession().getAttribute("H_bedinfo");
        house.sethBedinfo(H_bedinfo);
        String H_Sunum=request.getSession().getAttribute("H_Sunum").toString();
        house.sethSunum(H_Sunum);
        String H_cohabitation=(String)request.getSession().getAttribute("H_cohabitation");
        house.sethCohabitation(H_cohabitation);
        String H_Sihouse=(String)request.getSession().getAttribute("H_Sihouse");
        house.sethSihouse(H_Sihouse);
        String H_name=(String)request.getSession().getAttribute("H_name");
        house.sethName(H_name);
        String H_pedescription=(String)request.getSession().getAttribute("H_pedescription");
        house.sethPedescription(H_pedescription);
        String H_insituation=(String)request.getSession().getAttribute("H_insituation");
        house.sethInsituation(H_insituation);
        String H_traffic=(String)request.getSession().getAttribute("H_traffic");
        house.sethTraffic(H_traffic);
        String H_beside=(String)request.getSession().getAttribute("H_beside");
        house.sethBeside(H_beside);
        String H_bath=(String)request.getSession().getAttribute("H_bath");
        house.sethBath(H_bath);
        String H_electro=(String)request.getSession().getAttribute("H_electro");
        house.sethElectro(H_electro);
        String H_facilities=(String)request.getSession().getAttribute("H_facilities");
        house.sethFacilities(H_facilities);
        String H_spefac=(String)request.getSession().getAttribute("H_spefac");
        house.sethSpefac(H_spefac);
        String H_require=(String)request.getSession().getAttribute("H_require");
        house.sethRequire(H_require);
        String H_price=(String)request.getSession().getAttribute("H_price");
        house.sethPrice(H_price);
        String H_Delocation=(String)request.getSession().getAttribute("H_Delocation");
        house.sethDelocation(H_Delocation);
        //存储图片路径
        String uppath="";//用于保存上传路径
        String savepath="";
        String fileFullname=file.getOriginalFilename();//获取文件名
        uppath="/"+fileFullname;
        savepath="D:/IDEAworkplace/myproject/src/main/resources/static"+uppath;
        File file1=new File(savepath);
        if(!file1.getParentFile().exists()){
            file1.getParentFile().mkdir();
        }
        try{
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        house.sethPicture(uppath);
        houseService.saveHouse(house);
        Integer hid=houseService.getHouseBylocation(house).get(0).gethId();
        Integer phone=(Integer)request.getSession().getAttribute("login");
        User user=new User();
        user.setUserPhone(phone);
        Integer uid=userService.getUserByphone(user).get(0).getUsrId();
        HURelate huRelate=new HURelate();
        huRelate.sethId(hid);
        model.addAttribute("housepicture",uppath);
        huRelate.setuId(uid);
        huRelateService.saveHURelate(huRelate);
        return "redirect:/purerent/index";
    }

    @GetMapping("/hDelocation")
    public @ResponseBody String  savehDelocation(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String  H_delocation=request.getParameter("H_delocation");

        request.getSession().setAttribute("H_Delocation",H_delocation);
        log.info(H_delocation);
        return H_delocation;
    }

    @PostMapping("/search")
    @ResponseBody
    public  Map<String,List<House>> search(HttpServletRequest request,Model model){

        String hDelocation=request.getParameter("hDelocation");
        String highprice=request.getParameter("highprice");
        String hRetype=request.getParameter("hRetype");
        HouseExample houseExample=new HouseExample();
        HouseExample.Criteria criteria=houseExample.createCriteria();
        if(highprice!="0") {
            houseExample.setOrderByClause("h_price asc");
        }
        else {
            houseExample.setOrderByClause("h_price desc");
        }
        criteria.andHDelocationEqualTo(hDelocation);
        criteria.andHRetypeEqualTo(hRetype);

        List<House> houses=houseDao.selectByExample(houseExample);
        log.info(houses.get(0).gethDelocation());
        Map<String, List<House>> map=new HashMap<String,List<House>>();
        map.put("house",houses);

        return map;

    }
}
