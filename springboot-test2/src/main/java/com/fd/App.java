package com.fd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@MapperScan(basePackages = "com.fd.mapper")
@ComponentScan(basePackages = {"com.fd"})
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
