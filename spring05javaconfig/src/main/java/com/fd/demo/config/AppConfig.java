package com.fd.demo.config;

import com.fd.demo.dao.UserDao;
import com.fd.demo.dao.UserDaoNormal;
import com.fd.demo.service.UserService;
import com.fd.demo.service.UserServiceNormal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 10:34
 */
@Configuration
public class AppConfig {

    @Bean
    public UserDao userDaoNormal(){
        System.out.println("AppConfig  userDaoNormal");
        return new UserDaoNormal();
    }

    @Bean
    public UserService userServiceNormal(){
        System.out.println("AppConfig  userServiceNormal");
        UserDao userDao = userDaoNormal();
        return new UserServiceNormal(userDao);
    }

}
