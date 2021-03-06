package com.yibao.music.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;


public class HanziToPinyins {
    private static char xe = 0x4e00;
    private static char xf = 0x9fa5;

    /**
     * 返回一个字的拼音
     */
    private static String toPinYin(char hanzi) {
        HanyuPinyinOutputFormat hanyuPinyin = new HanyuPinyinOutputFormat();
        hanyuPinyin.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        hanyuPinyin.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        hanyuPinyin.setVCharType(HanyuPinyinVCharType.WITH_U_UNICODE);
        String[] pinyinArray = null;

        try {
            //是否在汉字范围内
            if (hanzi >= xe && hanzi <= xf) {
                pinyinArray = PinyinHelper.toHanyuPinyinStringArray(hanzi, hanyuPinyin);
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            e.printStackTrace();
        }
        //将获取到的拼音返回
        if (pinyinArray != null && pinyinArray.length > 0) {
            return pinyinArray[0];
        } else {
            return "#";
        }
    }

    /**
     * 返回传入的字符串的首字母
     *
     * @param input i
     * @return r
     */
    public static char stringToPinyinSpecial(String input) {
        if (input == null) {
            return 0;
        }
        StringBuilder result = null;
        for (int i = 0; i < input.length(); i++) {
            //是否在汉字范围内
            if (input.charAt(i) >= xe && input.charAt(i) <= xf) {
                result = (result == null ? new StringBuilder("null") : result).append(toPinYin(input.charAt(i)));
            } else {
                result = (result == null ? new StringBuilder("null") : result).append(input.charAt(i));
            }
        }
        if (result != null) {
            if (result.length() > Constants.NUMBER_FOUR) {
                result = new StringBuilder(result.substring(4));
            }

            //如果首字母不在[a,z]和[A,Z]内则首字母改为‘#’
            if (!(result.toString().toUpperCase().charAt(0) >= Constants.LETTER_A && result.toString().toUpperCase().charAt(0) <= Constants.LETTER_Z)) {
                StringBuilder builder = new StringBuilder(result.toString());
                builder.replace(0, 1, "#");
                result = new StringBuilder(builder.toString());
            }
            return result.toString().toUpperCase().charAt(0);
        }
        return 'a';
    }

}
