package com.fd.mapper;

import com.fd.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/10 17:32
 */

public interface UserMapper {

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Insert("insert into t_user (username,password) values (#{username},#{password})")
    int save(@Param("username") String username,@Param("password") String password);

    @Select("select * from t_user where username=#{username}")
    public User finyByUsername(@Param("username") String username);
}
