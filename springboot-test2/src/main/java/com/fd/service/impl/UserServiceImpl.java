package com.fd.service.impl;

import com.fd.mapper.UserMapper;
import com.fd.model.User;
import com.fd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/10 17:04
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        userMapper.save(username,password);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }


}
