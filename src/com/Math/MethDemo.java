package com.Math;
/*
* Math类都是静态方法
* */
public class MethDemo {
    public static void main(String[] args) {
        //Math.abs 绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);
        //Math.pow 取幂,2的3次方
        double pow = Math.pow(2.0 , 3.0);
        System.out.println(pow);
        //Math.ceil 向上取整
        double ceil = Math.ceil(-3.0003);
        System.out.println(ceil);
        //Math.floor 向下取整
        double floor = Math.floor(-5.0001);
        System.out.println(floor);
        //Math.round 四舍五入
        long round = Math.round(4.5);
        System.out.println(round);
        //Math.sqrt 开方
        double sqrt = Math.sqrt(128);
        System.out.println(sqrt);
        //Math.random [0,1)之间的随机小数
        double random = Math.random();
        System.out.println(random);
        //返回一个[2,7]间的整数
        int random_demo = (int) (2 + Math.random()*(7 - 2 + 1));
        //由于random[0,1),所以截位后会小于右边界值，例[2,5),故+1保证结尾后能取到边界值[2,6)
        System.out.println(random_demo);
    }
}
