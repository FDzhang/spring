package com.fd.demo.soundsystem;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 13:44
 */

public class CompactDisc {

    private String title;
    private String artist;
    private Music[] tracks;

    public CompactDisc(String title, String artist, Music[] tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
        System.out.println("CompactDisc 有3参构造函数...." + this.toString());
    }

    public CompactDisc() {
        super();
        System.out.println("CompactDisc 构造函数...." + this.toString());
    }

    public CompactDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
        System.out.println("CompactDisc 有参构造函数...." + this.toString());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("---"+this.toString()+"---注入 title");
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        System.out.println("---"+this.toString()+"---注入 artist");
    }

    public Music[] getTracks() {
        return tracks;
    }

    public void setTracks(Music[] tracks) {
        this.tracks = tracks;
        System.out.println("---"+this.toString()+"---注入 tracks");

    }

    public void paly() {
        System.out.println("播放CD音乐....." + this.toString() + "--" + this.title + " by " + this.artist);
        for (Music track : this.tracks) {
            System.out.println("音乐:"+track.getTitle()+",时长："+track.getDuration());
        }
    }
}
