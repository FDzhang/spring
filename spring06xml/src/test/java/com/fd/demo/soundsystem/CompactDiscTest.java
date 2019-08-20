package com.fd.demo.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 14:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-constructor.xml")
public class CompactDiscTest {

    @Autowired
    private CompactDisc compactDisc1;

//    @Autowired
//    private CompactDisc compactDisc2;
//
//    @Autowired
//    @Qualifier("compactDisc2")
//    private CompactDisc compactDisc3;

    @Test
    public void test01(){
        compactDisc1.paly();
//        compactDisc2.paly();
//        compactDisc3.paly();
    }
}
