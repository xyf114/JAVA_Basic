package com.basic.Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[1][1] = 8;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
