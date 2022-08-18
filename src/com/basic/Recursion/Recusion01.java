package com.basic.Recursion;

public class Recusion01 {
    public static void main(String[] args) {
        T t = new T();
        t.test(6);
    }
}

class T{
    public void test(int n){
        if (n > 2)
        {
            test(n - 1);
        }
        System.out.println(n);
    }
}


