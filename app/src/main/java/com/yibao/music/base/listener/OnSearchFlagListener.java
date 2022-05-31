package com.yibao.music.base.listener;


public interface OnSearchFlagListener {
    /**
     * 用来区分搜索的标识：1 Artist 、 2 Album 、  3 SongName
     * @param searchFlag flag
     */
    void setSearchFlag(int searchFlag);
}
