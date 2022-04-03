package com.wrapper;

public class Exercise1 {
    public static void main(String[] args) {
        Integer integer = new Integer(1);
        Integer integer1 = new Integer(1);

        System.out.println(integer == integer1);

/*
*         public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }
* */

        //未超过范围直接返回数值
        Integer integer2 = 1;
        Integer integer3 = 1;
        System.out.println(integer2 == integer3);
        //超过范围重新new
        Integer integer4 = 128;
        Integer integer5 = 128;
        System.out.println(integer4 == integer5);

        //虽然未超过范围但integer7为新创建对象
        Integer integer6 = 127;
        Integer integer7 = new Integer(127);
        System.out.println(integer6 == integer7);

        //出现基本数据类型则比较数值大小
        int integer8 = 127;
        Integer integer9 = new Integer(127);
        System.out.println(integer8 == integer9);
        //出现基本数据类型则比较数值大小
        int integer10 = 128;
        Integer integer11 = new Integer(128);
        System.out.println(integer10 == integer11);

    }
}
