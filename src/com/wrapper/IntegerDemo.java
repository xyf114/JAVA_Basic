package com.wrapper;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class IntegerDemo {
    public static void main(String[] args) {
        //拆箱
        Integer integer = new Integer(3);
        int n = integer.intValue();
        //装箱
        Integer integer1 = new Integer(n);
        Integer integer2 = integer.valueOf(n);
        //自动装箱
        Integer integer3 = 4;
        Integer integer4 = n;
        //自动拆箱
        n = integer3;

        System.out.println(n);
        System.out.println(integer1);
        System.out.println(integer2);
    }

}
