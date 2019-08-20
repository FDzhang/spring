package com.fd.demo.soundsystem;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 14:12
 */

public class CDPlayer {

    private CompactDisc cd;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer 无参构造函数 ---" + this.toString());
    }

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
        System.out.println("CDPlayer 有参构造函数 ---" + this.toString());
    }

    public CompactDisc getCd() {
        return cd;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
        System.out.println("---"+this.toString()+"---注入 cd");

    }

    public void play(){
        System.out.println("CDPlayer ..." + this.toString());
        cd.paly();
    }
}
