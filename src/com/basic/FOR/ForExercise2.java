package com.basic.FOR;

public class ForExercise2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int start = 9;
        int end = 100;
        for (int i = start; i <= end; i++){
            if(i%9 == 0){
                sum += i;
                count ++;
            }
        }
        System.out.println("sum = "+ sum + " count = " + count);
    }
}
