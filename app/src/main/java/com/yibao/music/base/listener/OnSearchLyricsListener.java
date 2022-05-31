package com.yibao.music.base.listener;

import com.yibao.music.model.qq.AlbumSong;
import com.yibao.music.model.qq.SongLrc;

import java.util.List;


public interface OnSearchLyricsListener {
    void searchResult(List<SongLrc> songLrcList);
}
