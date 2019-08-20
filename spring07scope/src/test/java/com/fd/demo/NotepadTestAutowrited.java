package com.fd.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 16:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NotepadTestAutowrited {

    @Autowired
    private Notepad notepad1;

    @Autowired
    private Notepad notepad2;

    /**
     * 无论我们是否主动去获取bean对象，Spring上下文一加载就会创建bean对象
     * 无论【注入】多少次，拿到的都是同意对象
     */
    @Test
    public void test01(){
        System.out.println(notepad1==notepad2);
    }
}
