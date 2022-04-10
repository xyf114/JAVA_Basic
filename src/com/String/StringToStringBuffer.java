package com.String;

public class StringToStringBuffer {
    public static void main(String[] args) {
        String string = "hello";
        StringBuffer stringBuffer = new StringBuffer(string);//对string本身无影响
        //1.开辟一个stringbuffer
        //2.调用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(string);
        //使用toString方法
        StringBuffer stringBuffer2 = new StringBuffer("hello");
        String string1 = stringBuffer2.toString();
        //使用String构造器
        String string2 = new String(stringBuffer2);

    }
}
