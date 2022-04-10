package com.wrapper;
/*
* StringBuilder没有线程安全
* 在单线程中效率高于StringBuffer
* StringBuilder没有做同步处理，在无并发的情况下使用
*
* 效率 StringBuilder>StringBuffer>String
*
* */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String demo = "hello world";
        stringBuilder.append(demo);
        System.out.println(stringBuilder);
        System.out.println("=================");
        StringBuilder stringBuilder1 = new StringBuilder("hello,world");
        System.out.println(stringBuilder1);
        System.out.println("=================");
        stringBuilder.delete(0,6);
        System.out.println(stringBuilder);
    }
}
