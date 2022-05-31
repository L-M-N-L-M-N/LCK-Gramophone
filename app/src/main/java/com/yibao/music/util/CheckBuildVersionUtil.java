package com.yibao.music.util;

import android.os.Build;


public class CheckBuildVersionUtil {

    public static boolean checkAndroidVersionQ() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q;
    }

    public static boolean checkAndroidVersionN() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N;
    }
}
