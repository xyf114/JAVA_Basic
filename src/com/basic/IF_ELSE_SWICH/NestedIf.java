package com.basic.IF_ELSE_SWICH;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score;
        char gender;
        System.out.println("输入成绩");
        score = scanner.nextDouble();
        if (score > 8.0)
            System.out.println("输入性别");
            gender = scanner.next().charAt(0);
            if (gender == '男')
                System.out.println("进入男子组");
            else if (gender == '女')
                System.out.println("进入女子组");
            else
                System.out.println("被淘汰了");
    }
}
