package com.basic.Recursion;

import java.util.Scanner;
public class Recusion03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        T3 t3 = new T3();
        int answer =  t3.fibonacci(input);
        System.out.println(answer);
    }
}
class T3{
    public int fibonacci(int i){
        if (i == 1 || i == 2){
            return 1;
        }
        else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
}
