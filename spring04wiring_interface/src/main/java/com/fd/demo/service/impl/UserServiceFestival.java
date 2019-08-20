package com.fd.demo.service.impl;

import com.fd.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 9:45
 */

@Service
public class UserServiceFestival implements UserService {
    public void add() {
        System.out.println("注册用户，发送优惠券");
    }
}
