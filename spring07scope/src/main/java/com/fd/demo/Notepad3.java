package com.fd.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 15:56
 */

public class Notepad3 {
    public Notepad3() {
        super();
        System.out.println("Notepad3 无参构造函数---"+this.toString());
    }

}
