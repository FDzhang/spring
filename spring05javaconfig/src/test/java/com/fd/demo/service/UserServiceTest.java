package com.fd.demo.service;

import com.fd.demo.config.AppConfig;
import com.fd.demo.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 10:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void add(){
        userService.add();
    }
}
