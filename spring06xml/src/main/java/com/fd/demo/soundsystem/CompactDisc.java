package com.fd.demo.soundsystem;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 13:44
 */

public class CompactDisc {

    private String title;
    private String artist;

    public CompactDisc() {
        super();
        System.out.println("CompactDisc 构造函数...." + this.toString());
    }

    public CompactDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
        System.out.println("CompactDisc 有参构造函数...." + this.toString());
    }

    public void paly() {
        System.out.println("播放CD音乐....." + this.toString() + "--" + this.title + " by " + this.artist);
    }
}
