package com.basic.Search;

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        String [] name = {"A", "B", "C", "D"};
        Scanner scanner = new Scanner(System.in);
        int flag = -1;
        String input = scanner.next();

        for (int i = 0; i < name.length; i++){
            if (name[i].equals(input)){
                System.out.println("find");
                System.out.println("下标为" + i);
                flag = i;
            }
        }

        if (flag == -1){
            System.out.printf("无");
        }
    }
}
