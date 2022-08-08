package com.basic.FOR;
//打印 1~100 之间所有是 9 的倍数的整数,统计个数及 总和
public class ForExercise {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        for (int i = 1; i <= 100; i++){
            if((i*9) <100){
                count ++;
                sum += i*9;
            }else break;
        }
        System.out.println("count = "+ count + " sum = " + sum);
    }
}
