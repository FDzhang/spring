package com.fd.demo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 15:58
 */

public class NotepadTest {


    /**
     * 无论我们是否主动去获取bean对象，Spring上下文一加载就会创建bean对象
     * 无论获取多少次，拿到的都是同意对象
     */
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object notepad1 = (Notepad)context.getBean("notepad");
        Object notepad2 = (Notepad)context.getBean("notepad");
        System.out.println(notepad1==notepad2);
    }
}
