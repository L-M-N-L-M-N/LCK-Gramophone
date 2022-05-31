package com.yibao.music.model;


public class MoreMenuStatus {
    private int musicPosition;
    private int position;
    private MusicBean musicBean;

    public MoreMenuStatus(int musicPosition, int position, MusicBean musicBean) {
        this.musicPosition = musicPosition;
        this.position = position;
        this.musicBean = musicBean;
    }

    public int getMusicPosition() {
        return musicPosition;
    }

    public int getPosition() {
        return position;
    }

    public MusicBean getMusicBean() {
        return musicBean;
    }
}
