package com.yibao.music.base;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.baidu.mobstat.StatService;
import com.yibao.music.MusicApplication;
import com.yibao.music.model.greendao.AlbumInfoDao;
import com.yibao.music.model.greendao.MusicBeanDao;
import com.yibao.music.util.RxBus;

import butterknife.Unbinder;
import io.reactivex.disposables.CompositeDisposable;


public abstract class BaseFragment extends Fragment {
    protected AppCompatActivity mActivity;
    protected RxBus mBus;
    protected final MusicBeanDao mMusicBeanDao;
    protected CompositeDisposable mCompositeDisposable;
    protected Context mContext;
    protected Unbinder unbinder;
    protected final AlbumInfoDao mAlbumDao;
    protected FragmentManager mFragmentManager;
    protected String TAG = " ==== " + this.getClass().getSimpleName() + "  ";

    protected BaseFragment() {
        mMusicBeanDao = MusicApplication.getIntstance().getMusicDao();
        mAlbumDao = MusicApplication.getIntstance().getAlbumDao();

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mActivity = (AppCompatActivity) getActivity();
        mContext = getActivity();
        mCompositeDisposable = new CompositeDisposable();
        mBus = RxBus.getInstance();
        mFragmentManager = mActivity.getSupportFragmentManager();

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        StatService.start(mActivity.getApplicationContext());
        StatService.setDebugOn(false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        if (mCompositeDisposable != null) {
            mCompositeDisposable.dispose();
            mCompositeDisposable.clear();
            mCompositeDisposable = null;

        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
