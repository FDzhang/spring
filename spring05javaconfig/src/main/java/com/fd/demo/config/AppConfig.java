package com.fd.demo.config;

import com.fd.demo.dao.UserDao;
import com.fd.demo.dao.UserDaoCache;
import com.fd.demo.dao.UserDaoNormal;
import com.fd.demo.service.UserService;
import com.fd.demo.service.UserServiceNormal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 10:34
 */
@Configuration
public class AppConfig {

    /**
     * 说明： @Bean("normal") 等价于 @Bean + @Qualifier("normal")
     * @return UserDao
     */
    @Bean("normal")
    public UserDao userDaoNormal(){
        System.out.println("AppConfig  userDaoNormal");
        return new UserDaoNormal();
    }

    /**
     * 说明： @Bean  默认id为（方法名） userDaoCache
     * @return UserDao
     */
    @Bean
    public UserDao userDaoCache(){
        System.out.println("AppConfig  userDaoCache");
        return new UserDaoCache();
    }

    @Bean
    public UserService userServiceNormal(@Qualifier("userDaoCache") UserDao userDao){
        System.out.println("AppConfig  userServiceNormal");
        UserServiceNormal userService = new UserServiceNormal();
        userService.setUserDao(userDao);
        return userService;
    }

}
