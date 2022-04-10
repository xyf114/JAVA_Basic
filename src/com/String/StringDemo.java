package com.String;

public class StringDemo {
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "abc";//当方法区常量池中有相同字符串时直接使用原地址

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));

        String string3 = new String("abc");
        String string4 = new String("abc");//不同对象在堆中开辟不同内存空间，但value数组指向相同字符串地址
        System.out.println(string1 == string3);
        System.out.println(string1.equals(string3));
        System.out.println(string3 == string4);

        System.out.println(string3 == string4.intern());
        System.out.println(string4 == string4.intern());

        String string5 = "abc";
        String string6 = "hello";
        String string7 = string5 + string6;//在堆中创建了新的对象，可追踪源码学习
        String string8 = "abchello";
        System.out.println(string7 == string8);

    }

}
