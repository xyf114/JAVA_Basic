package com.basic.IF_ELSE_SWICH;
import java.util.Scanner;
public class HomeWork_02 {
    public static void main(String[] args) {
        System.out.println("输入a~z");
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        switch (character){
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            default:
                System.out.println("other");
        }
    }
}
