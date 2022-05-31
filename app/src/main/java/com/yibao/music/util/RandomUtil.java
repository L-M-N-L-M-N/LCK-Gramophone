package com.yibao.music.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomUtil {
    public static int getRandomPostion(int listSize) {
        Random random = new Random();
        return Math.abs(random.nextInt(listSize));
    }

    public static String getRandomUrl(boolean picUrlFlag) {
        Random random = new Random();
        int picUrlLength = Api.picUrlArr.length;
        int position = random.nextInt(picUrlLength) + 1;

//        return picUrlFlag ? getUnsplashUrl(picUrlLength).get(position) : Api.picUrlArr[position >= picUrlLength ? picUrlLength - 1 : position];
        return Api.picUrlArr[position >= picUrlLength ? picUrlLength - 1 : position];

    }

    private static List<String> getUnsplashUrl(int picUrlLength) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < picUrlLength; i++) {
            list.add(Constants.UNSPLASH_URL + i);
        }
        return list;
    }
}
