package com.fd.demo.service.impl;

import com.fd.demo.dao.UserDao;
import com.fd.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 9:32
 */

@Service("normal")
public class UserServiceNormal implements UserService {

    @Autowired
    private UserDao userDao;

    public void add() {
        userDao.add();
    }
}
