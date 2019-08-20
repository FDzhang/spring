package com.fd.demo;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 16:52
 */

public class PersonFactory {

    /**
     * 静态工厂方法
     * @return person
     */
    public static Person createPerson1(){
        System.out.println("静态工厂创建Person -----");
        return new Person();
    }

    /**
     * 实例工厂方法
     * @return person
     */
    public Person createPerson2(){
        System.out.println("实例工厂创建Person -----");
        return new Person();
    }
}
