package com.basic.Array;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,10};
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int [] sort_arr = new int[arr.length + 1];
        int index = 0;
        for (int i = 0 ; i < arr.length; i++){

        }
        for (int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] < input){
                sort_arr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < sort_arr.length; i++){
            System.out.printf(sort_arr[i] + " ");
        }
    }
}
