package com.fd.demo.dao;

import org.springframework.stereotype.Component;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 10:03
 */
@Component
public class UserDaoNormal implements UserDao {
    public void add() {
        System.out.println("UserDao add");
    }
}
