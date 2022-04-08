package com.wrapper;

public class StringBufferDemo {
    public static void main(String[] args) {
        //默认创建value[] char数组 初始16字符
        StringBuffer stringBuffer = new StringBuffer();
        //构造器指定大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //当前字符串长度加16
        StringBuffer stringBuffer2 = new StringBuffer("buffer");
    }
}
