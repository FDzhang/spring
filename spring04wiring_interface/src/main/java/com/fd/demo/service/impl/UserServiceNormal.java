package com.fd.demo.service.impl;

import com.fd.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 9:32
 */
@Component
@Qualifier("normal")
public class UserServiceNormal implements UserService {


    public void add() {
        System.out.println("添加用户");
    }
}
