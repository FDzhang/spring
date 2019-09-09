package com.fd.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/9 15:19
 */
@RestController
public class HelloController {

    /**
     * ResponseBody的作用 把return的转成json
     * @return String
     */
    @RequestMapping("hello/{name}")
    @ResponseBody
    public String hello(@PathVariable("name") String name){
        return "Hello,Springboot---"+name;
    }
}
