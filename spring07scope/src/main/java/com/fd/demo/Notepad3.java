package com.fd.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 15:56
 */

public class Notepad3 {
    public Notepad3() {
        super();
        System.out.println("Notepad3 无参构造函数---"+this.toString());
    }
    @PostConstruct
    public void init(){
        System.out.println("Notepad3 的初始化方法");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Notepad3 的销毁方法");

    }
}
