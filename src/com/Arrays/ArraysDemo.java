package com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        Integer[] integer = {1, 2, 3, 60};
        System.out.println(Arrays.toString(integer));

        //数组是引用类型，排序后会直接改变原结果
        Integer[] sort = {1,4,-5,-9,80};
        //Arrays.sort(sort);
        //定制排序，调用匿名内部类
        //体现了接口编程+动态绑定
        //sort使用的是二插排序树
        //o1-o2顺序，o2-o1逆序
        Arrays.sort(sort, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(sort));
    }
}
