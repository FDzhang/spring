package com.fd.web.controller;

import com.fd.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/9 15:33
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        //把数据保存到test1数据库
        userService.register(username,password);
        return "success";
    }

    @RequestMapping("login")
    public String login(String username,String password){
        //model.addattribte(path,"test2")
        return "user/list";
    }
}
