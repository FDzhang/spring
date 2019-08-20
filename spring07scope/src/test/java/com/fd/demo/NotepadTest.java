package com.fd.demo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 15:58
 */

public class NotepadTest {


    /**
     * scope="singleton"
     * 无论我们是否主动去获取bean对象，Spring上下文一加载就会创建bean对象
     * 无论获取多少次，拿到的都是同一个对象
     *
     * scope="prototype"
     * Spring上下文加载不会创建bean对象
     * 每次获取，拿到的都是不同的bean对象
     */
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object notepad1 = (Notepad)context.getBean("notepad");
//        Object notepad2 = (Notepad)context.getBean("notepad");
//        System.out.println(notepad1==notepad2);
//        context.destroy();
        context.close();
    }

}
