package com.yibao.music.base.listener;


public interface NotifycationChangeListener {
    /**
     * show通知
     */
    void show();

    /**
     * hi通知
     */
    void hide();


    /**
     * 通知是否显示
     *
     * @return b
     */
    boolean visible();

    /**
     * 更新通知栏上的收藏按钮
     *
     * @param currentFavorite c
     */
    void updataFavoriteBtn(boolean currentFavorite);

}
