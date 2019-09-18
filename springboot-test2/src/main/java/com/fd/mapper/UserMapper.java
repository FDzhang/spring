package com.fd.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/10 17:32
 */

public interface UserMapper {

    @Insert("insert t_user (username,password) values (#{username},#{password})")
    int save(@Param("username") String username, @Param("password") String password);

}
