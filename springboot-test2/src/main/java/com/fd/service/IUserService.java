package com.fd.service;

import com.fd.model.User;

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

    User findByUsername(String username);
}
