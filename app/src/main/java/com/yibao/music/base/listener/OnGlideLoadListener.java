package com.yibao.music.base.listener;

/**
 * 根据列表的滚动状态决定Glide是否需要加载图片
 */
public interface OnGlideLoadListener {

    /**
     * 加载图片
     */
    void resumeRequests();

    /**
     * 停止加载图片
     */
    void pauseRequests();

}
