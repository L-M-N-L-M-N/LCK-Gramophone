package com.yibao.music.base.listener;


public interface OnUpdataTitleListener {

    /**
     * 当前歌曲是否收藏
     */
    void checkCurrentFavorite();

    /**
     * 切换ControlBar
     */
    void switchControlBar();

    /**
     * 详情页面标识
     * @param detailFlag d
     */
    void handleBack(int detailFlag);
}
