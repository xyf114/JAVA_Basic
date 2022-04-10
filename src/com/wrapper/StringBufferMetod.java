package com.wrapper;

public class StringBufferMetod {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world ");
        stringBuffer.append(100);
        stringBuffer.append(" add ").append(true).append(648);
        System.out.println(stringBuffer);

        stringBuffer.delete(5,11);//删除[5,11)
        System.out.println(stringBuffer);

        stringBuffer.replace(0,5, "world");//替换[0,5)
        System.out.println(stringBuffer);

        stringBuffer.insert(6, "world");
        System.out.println(stringBuffer);

        //lastIndexOf返回最后一个匹配字符串出现的首位，indexOf返回第一个匹配字符串出现的首位，未找到返回-1
        System.out.println(stringBuffer.lastIndexOf("z"));
        System.out.println(stringBuffer.indexOf("z"));
    }
}
