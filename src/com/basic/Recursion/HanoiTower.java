package com.basic.Recursion;
import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Tower tower = new Tower();
        tower.move(input,'A','B','C');
    }
}

class Tower{
    public void move(int num,char A,char B,char C){
        if (num == 1) {
            System.out.println(A + "->" + C);
        }else {
            move(num - 1, A, C, B);
            System.out.println(A + "->" + C);
            move(num - 1, B, A, C);
        }
    }
}
