package com.fd.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 15:56
 */
@Component
// @Scope("prototype")
// @Scope(scopeName = "prototype")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Lazy
public class Notepad2 {
    public Notepad2() {
        super();
        System.out.println("Notepad2 无参构造函数---"+this.toString());
    }

    @PostConstruct
    public void init(){
        System.out.println("Notepad2 的初始化方法");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Notepad2 的销毁方法");

    }
}
