package com.fd.web.controller;

import com.fd.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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

}
