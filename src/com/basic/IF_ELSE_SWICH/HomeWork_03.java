package com.basic.IF_ELSE_SWICH;
import java.util.Scanner;
public class HomeWork_03 {
    public static void main(String[] args) {
        System.out.println("月份");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
