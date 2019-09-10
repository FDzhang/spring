package com.fd.service;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/10 17:03
 */

public interface IUserService {
    /**
     * 注册
     * @param username username
     * @param password password
     */
    void register(String username,String password);
}
