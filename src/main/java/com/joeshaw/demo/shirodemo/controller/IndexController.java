package com.joeshaw.demo.shirodemo.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public ModelAndView loginView(ModelAndView modelAndView){
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "userLogin",method = RequestMethod.POST)
    @ResponseBody
    public Object login(String username,String password){
        LOGGER.info(String.format("用户信息:username= %s,password=%s",username,password));
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        //进行验证，这里可以捕获异常，然后返回对应信息
        subject.login(token);
        return -1;
    }


    @GetMapping("index")
    public String index(){
        return "index";
    }


    @RequiresPermissions("get")
    @RequestMapping("/get")
    public String show(){
        return "list";
    }

    @RequiresPermissions("add")
    @RequestMapping("/add")
    public String add(){
        return "add";
    }


    @RequiresPermissions("delete")
    @RequestMapping("/remove")
    public String remove(){
        return "remove";
    }

    @RequiresPermissions("edit")
    @RequestMapping("/update")
    public String update(){
        return "update";
    }

    @RequestMapping("/anon")
    public String anon(){
        return "anon";
    }
}
