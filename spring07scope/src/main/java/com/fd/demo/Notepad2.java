package com.fd.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 15:56
 */
@Component
// @Scope("prototype")
// @Scope(scopeName = "prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad2 {
    public Notepad2() {
        super();
        System.out.println("Notepad2 无参构造函数---"+this.toString());
    }

}
