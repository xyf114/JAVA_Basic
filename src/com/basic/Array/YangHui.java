package com.basic.Array;

import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int [][] yanghui = new int[input][];
        for (int i = 0; i < input; i++){
            yanghui[i] = new int[i + 1];
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            for (int j = 1 ; j < yanghui[i].length - 1; j++){
                if (i == 0 || i == 1){
                    continue;
                }else {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
            }
        }

        for (int i = 0; i < yanghui.length; i++){
            for (int j = 0; j < yanghui[i].length; j++){
                System.out.printf(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
