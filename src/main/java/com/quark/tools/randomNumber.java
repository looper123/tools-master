package com.quark.tools;

import org.apache.http.impl.client.CloseableHttpClient;

public class randomNumber {

    private CloseableHttpClient client;

    //   生成随机六位数

    public void testRandomNumber() {
        String a = "0123456789";
        char[] rands = new char[6];
        for (int i = 0; i < rands.length; i++) {
//            生成随机的double类型的数字
            double v = Math.random();
//            和a的长度相乘
            double v1 = v * a.length();
//            double转化为int
            int rand = (int) (v1);
//            赋值
            rands[i] = a.charAt(rand);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < rands.length; i++) {
            stringBuffer.append(rands[i]);
        }
        System.out.println("----------" + stringBuffer);
    }
}
