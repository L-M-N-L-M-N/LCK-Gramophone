package com.yibao.music.base.listener;

/**
 * 清空收藏列表后更新PlayAcitivity和MusicActivity界面的收藏图片的状态
 */

public interface OnCheckFavoriteListener {
    /**
     * 更新当前收藏状态
     */
    void updataFavoriteStatus();

}
