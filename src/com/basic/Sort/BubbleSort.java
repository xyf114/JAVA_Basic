package com.basic.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] sort = {55,67,88,100,1,34,345};
        int temp = 0;
        for (int i = 0; i < sort.length - 1; i++)
            for (int j = 0; j < sort.length - i -1; j++){
                if(sort[j] > sort[j + 1])
                {
                    temp = sort[j + 1];
                    sort[j + 1] = sort[j];
                    sort[j] = temp;
                }
            }
        for (int i = 0 ; i < sort.length; i++){
            System.out.printf(sort[i] + " ");
        }
    }
}
