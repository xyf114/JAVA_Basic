package com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortCustom {
    public static void main(String[] args) {
        int [] arr = {2, 9, -1, 45, 99, 20};
        //sort_bubble(arr);
        sort_bubble(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
//冒泡排序
    public static void sort_bubble(int [] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 -i; j++){
                if (arr[j] > arr[j + 1]){
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void sort_bubble(int [] arr, Comparator comparator){
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 -i; j++){
                if (comparator.compare(arr[j], arr[j + 1]) >0){
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
