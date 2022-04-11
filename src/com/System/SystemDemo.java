package com.System;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        Integer a[] = {1,2,3};
        Integer [] b = new Integer[a.length];

//        System.arraycopy(a,0,b,0,a.length);
        System.arraycopy(a,0,b,1,2);
        System.out.println(Arrays.toString(b));

        System.out.println(System.currentTimeMillis());
        System.exit(0);//0表示程序正常退出
    }
}
