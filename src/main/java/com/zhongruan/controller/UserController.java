package com.zhongruan.controller;

import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    ModelAndView mv;
    List<UserInfo> userInfos;


    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        userInfos=userService.findAll();
        mv=new ModelAndView();
        mv.addObject("ui",userInfos);
        mv.setViewName("allUser");
        return mv;
    }
    @RequestMapping("toAddUser.do")
    public ModelAndView toAddUser(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("addUser");
        return mv;
    }

    @RequestMapping("/save.do")
    public ModelAndView save(UserInfo userInfo){
        mv=new ModelAndView();
        userService.save(userInfo);
        userInfos=userService.findAll();
        mv.addObject("ui",userInfos);
        mv.setViewName("allUser");
        return mv;
    }
    @RequestMapping("toUpdate")
    public ModelAndView toUpdate(int id){
         mv=new ModelAndView();
         UserInfo userInfo=userService.queryById(id);
         mv.addObject("userInfo",userInfo);//
         mv.setViewName("updateUser");
         return mv;
    }




    @RequestMapping("/update.do")
    public ModelAndView update(UserInfo userInfo){
        mv=new ModelAndView();
        userService.update(userInfo);
        List<UserInfo> userInfos=userService.findAll();
        mv.addObject("ui",userInfos);
        mv.setViewName("allUser");
        return mv;
    }



    @RequestMapping("/delete.do")
    public ModelAndView delete (int id){
        mv=new ModelAndView();
        userService.delete(id);
        List<UserInfo> userInfos=userService.findAll();
        mv.addObject("ui",userInfos);
        mv.setViewName("allUser");
        return mv;
    }


}
