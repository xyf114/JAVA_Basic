package com.basic.Recursion;

public class Recusion02 {
    public static void main(String[] args) {
        T2 t2 = new T2();
        int answer = t2.factorial(3);
        System.out.println(answer);
    }
}

class T2{
    public int factorial(int i){
        if ( i == 1){
            return 1;
        }else {
            return factorial(i-1)*i;
        }
    }
}