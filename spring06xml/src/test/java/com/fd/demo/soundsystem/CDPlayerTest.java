package com.fd.demo.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 14:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CDPlayerTest {
    @Autowired
    private CDPlayer cdPlayer1;

    @Autowired
    private CDPlayer cdPlayer2;

    @Autowired
    private CDPlayer cdPlayer3;

    @Test
    public void Test01(){
        cdPlayer1.play();
    }
    @Test
    public void Test02(){
        cdPlayer2.play();
    }
    @Test
    public void Test03(){
        cdPlayer3.play();
    }
}
