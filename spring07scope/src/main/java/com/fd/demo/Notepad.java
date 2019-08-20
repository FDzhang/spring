package com.fd.demo;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 15:56
 */

public class Notepad {
    public Notepad() {
        super();
        System.out.println("Notepad 无参构造函数---"+this.toString());
    }

    public void init(){
        System.out.println("Notepad 的初始化方法");
    }
    public void destroy(){
        System.out.println("Notepad 的销毁方法");

    }
}
