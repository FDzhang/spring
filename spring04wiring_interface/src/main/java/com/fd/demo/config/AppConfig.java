package com.fd.demo.config;

import com.fd.demo.dao.UserDao;
import com.fd.demo.service.UserService;
import com.fd.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 9:36
 */

@Configuration
// @ComponentScan(basePackages = {"com.fd.demo"})
@ComponentScan(basePackageClasses = {UserController.class, UserService.class, UserDao.class})
public class AppConfig {
}
