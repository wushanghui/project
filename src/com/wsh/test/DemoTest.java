package com.wsh.test;

import java.io.UnsupportedEncodingException;

/**
 * class
 *
 * @author wsh
 * @date 2019-07-11 14:03
 */
public class DemoTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        //System.out.println(stringBuilder.toString());
        String str = new String("abcd<p> 你好");
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.println(c);
            int length = String.valueOf(c).getBytes("UTF-8").length;
            System.out.println("char length: "+length);
        }
    }
}
