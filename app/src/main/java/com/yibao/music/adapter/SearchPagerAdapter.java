package com.yibao.music.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.yibao.music.fragment.SearchFragment;
import com.yibao.music.fragment.SongCategoryFragment;


public class SearchPagerAdapter
        extends FragmentStateAdapter {

    private String mArtist;
    public SearchPagerAdapter(@NonNull FragmentActivity fragmentActivity,String artist) {
        super(fragmentActivity);
        mArtist = artist;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return SearchFragment.newInstance(position,mArtist);
    }

    @Override
    public int getItemCount() {
        return 4;
    }

}
