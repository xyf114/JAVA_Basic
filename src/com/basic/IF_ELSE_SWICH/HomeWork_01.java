package com.basic.IF_ELSE_SWICH;
import java.util.Scanner;
public class HomeWork_01 {
    public static void main(String[] args) {
        int month;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("月份");
        month = scanner.nextInt();
        System.out.println("年龄");
        age = scanner.nextInt();
        if (month > 4 && month < 10)
        {
            if (age < 18){
                System.out.println(30);
            } else if (age >=18 && age <= 60) {
                System.out.println(60);
            } else {
                System.out.println(20);
            }
        }else
        {
            if (age < 18 || age > 60)
            {
                System.out.println(20);
            }else{
                System.out.println(40);
            }
        }
    }
}

