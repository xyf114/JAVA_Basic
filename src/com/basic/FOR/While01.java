package com.basic.FOR;

public class While01 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            if(i%2 == 0){
                System.out.println(i);
                i++;
            }
            i++;
        }
    }
}
