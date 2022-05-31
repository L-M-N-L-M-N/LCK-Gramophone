package com.yibao.music.model;


public class MusicCountBean {
    private int currentCount;
    private int size;

    public MusicCountBean(int musicCount, int size) {
        this.currentCount = musicCount;
        this.size = size;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
