package com.basic.bitoperator;

public class BitOperator {
    public static void main(String[] args) {
        int a=1>>2; // 1 向右位移 2 位
        int b=-1>>2;//算术右移
        int c=1<<2;//算术左移
        int d=-1<<2;//
        int e=3>>>2;//无符号右移//a,b,c,d,e 结果是多少
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);

        System.out.println(~2);
        System.out.println(2&3);
        System.out.println(2|3);
        System.out.println(~-5);
        System.out.println(13&7);
        System.out.println(5|4);
        System.out.println(-3^3);
    }
}
