package com.basic.Array;
/* 看一个需求:动态创建下面二维数组,并输出
i = 0: 1
i = 1: 2 2
i = 2: 3 3 3
一个有三个一维数组, 每个一维数组的元素是不一样的*/
public class TwoDinmensionalArray02 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        for (int i = 0; i < 3; i++){
            arr[i] = new int[i + 1];
            for (int j = 0; j < i + 1 ;j++){
                arr[i][j] = i + 1;
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
                }
            System.out.println();
            }
        }
    }
