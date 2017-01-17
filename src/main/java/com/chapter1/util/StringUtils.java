package com.chapter1.util;

/**
 * Created by HR-LZ on 2017/1/17.
 */
public class StringUtils {

    public String[] spiltString(String content,String regExp){

        StringBuffer stringBuffer = new StringBuffer(content);

        String[] result = stringBuffer.toString().split(regExp);
        return  result;
    }
}
