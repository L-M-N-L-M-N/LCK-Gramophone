package com.yibao.music.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.yibao.music.fragment.AlbumCategoryFragment;
import com.yibao.music.fragment.SongCategoryFragment;


public class AlbumViewPagerAdapter
        extends FragmentStateAdapter {


    public AlbumViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return  AlbumCategoryFragment.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return 2;
    }

}
