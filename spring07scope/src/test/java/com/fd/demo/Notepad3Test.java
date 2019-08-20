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
@ContextConfiguration(classes = AppConfig.class)
public class Notepad3Test {

    @Autowired
    private Notepad3 notepad1;
//
//    @Autowired
//    private Notepad3 notepad2;

    @Test
    public void test01(){
//        System.out.println(notepad1==notepad2);
    }
}
