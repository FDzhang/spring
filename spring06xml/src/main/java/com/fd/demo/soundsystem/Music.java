package com.fd.demo.soundsystem;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 14:45
 */

public class Music {
    private String title;
    private Integer duration;

    public Music() {
        super();
    }

    public Music(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
