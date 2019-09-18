package com.fd.service;

import com.fd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/10 17:04
 */
@Service
@Transactional
public class UserServiceImpl  {

    @Autowired
    private UserMapper userMapper;


    public void register(String username, String password) {
        userMapper.save(username,password);
    }
}
