package com.yibao.music.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.yibao.music.fragment.AboutFragment;
import com.yibao.music.fragment.AlbumFragment;
import com.yibao.music.fragment.ArtistFragment;
import com.yibao.music.fragment.PlayListFragment;
import com.yibao.music.fragment.SongCategoryFragment;
import com.yibao.music.fragment.SongFragment;


public class SongViewPagerAdapter
        extends FragmentStateAdapter {


    public SongViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return SongCategoryFragment.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return 4;
    }

}
