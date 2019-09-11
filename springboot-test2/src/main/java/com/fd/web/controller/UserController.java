package com.fd.web.controller;

import com.fd.model.User;
import com.fd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * 通过id查询用户信息
     * @return String
     */
    @RequestMapping("{id}")
    @ResponseBody
    public User userInfo(@PathVariable("id") Integer id){
        User user = new User("zxq","123");
        user.setId(id);
        return user;
    }

    @Autowired
    private IUserService userService;
    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        userService.register(username,password);
        return "success";
    }

    @RequestMapping("find")
    @ResponseBody
    public User register(String username){
        User user = userService.findByUsername(username);
        return user;
    }
}
