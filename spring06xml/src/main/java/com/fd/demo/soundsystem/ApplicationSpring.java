package com.fd.demo.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 13:47
 */

public class ApplicationSpring {

    public static void main(String[] args) {
        System.out.println("ApplicationSpring is running .....");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CompactDisc cd = context.getBean(CompactDisc.class);
        cd.paly();
    }
}
