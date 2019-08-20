package com.fd.demo.dao;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 11:12
 */

public class UserDaoCache implements UserDao {
    public void add() {
        System.out.println("UserDaoCache add cache");
    }
}
