package com.jasty.util;

import java.util.UUID;

/**
 * Created by Administrator on 2018-03-04.
 */
public class CommonUtils {

    //32자리 랜덤한 파일이름 생성
    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
