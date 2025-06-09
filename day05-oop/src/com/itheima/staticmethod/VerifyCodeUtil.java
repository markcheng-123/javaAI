package com.itheima.staticmethod;

import java.util.Random;

public class VerifyCodeUtil {
    private static final String CHARSET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static String getCode(int n) {
        //创建一个随机数对象
        Random random = new Random();
        //创建一个StringBuffer对象,用于拼接字符串
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            //随机生成一个索引
            int index = random.nextInt(CHARSET.length());
            //根据索引得到对应的字符
            char c = CHARSET.charAt(index);
            //拼接字符
            sb.append(c);
        }
        return sb.toString();
    }
}
