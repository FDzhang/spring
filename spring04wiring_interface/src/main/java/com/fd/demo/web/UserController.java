package com.fd.demo.web;

import com.fd.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 10:07
 */

@Controller
public class UserController {

    @Autowired
    @Qualifier("normal")
    private UserService userService;

    public void add(){
        userService.add();
    }
}
