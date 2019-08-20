package com.fd.demo.service;

import com.fd.demo.dao.UserDao;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 10:41
 */

public class UserServiceNormal implements UserService {

    private UserDao userDao;


    public UserServiceNormal() {
        super();
    }

    public UserServiceNormal(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }
}
