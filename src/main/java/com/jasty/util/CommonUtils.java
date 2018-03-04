package com.jasty.util;

import java.util.UUID;

/**
 * Created by Administrator on 2018-03-04.
 */
public class CommonUtils {

    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
