package com.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        Integer[] integer = {1, 2, 3, 60};
        System.out.println(Arrays.toString(integer));

//      数组是引用类型，排序后会直接改变原结果
        Integer[] sort = {1,4,-5,-9,80};
//        Arrays.sort(sort);
//        定制排序，调用匿名内部类
//        体现了接口编程+动态绑定
//        sort使用的是二插排序树
//        o1-o2顺序，o2-o1逆序
        Arrays.sort(sort, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(sort));

//      二分查找，必须有序，存在返回下标位置，不存在返回应该在的位置+1，并取负
        System.out.println(Arrays.binarySearch(sort, 1));
        System.out.println(Arrays.binarySearch(sort, 0));

//      拷贝数组
        Integer [] copy = Arrays.copyOf(sort, sort.length);
//      第二个参数为拷贝数组的长度，若超过原数组则补充null
        Integer [] copy2 = Arrays.copyOf(sort, sort.length + 1);
        Integer [] copy3 = Arrays.copyOf(sort, sort.length - 1);
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy2));
        System.out.println(Arrays.toString(copy3));


        Arrays.fill(integer, 99);
        System.out.println(Arrays.toString(integer));

        Integer [] integers_equal = {99, 99, 99, 99};
        boolean equal = Arrays.equals(integers_equal, integer);
        System.out.println(equal);

        List<Integer> list = Arrays.asList(integer);
        System.out.println(list);
    }
}
