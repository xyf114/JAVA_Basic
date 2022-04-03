package com.wrapper;

@SuppressWarnings("removal")
public class WrapperDemo {
    public static void main(String[] args) {
        Double aDouble = 200d;
        Float aFloat = 300f;
        //三元运算符属于一条语句，会调整为精度最高项
        Object object = (true)?new Integer(1):new Double(2.0);
        System.out.println(aDouble);
        System.out.println(aFloat);
        System.out.println(object);

        //条件语句分不同语句，不会改变精度
        Object object2;
        if (true)
            object2 = new Integer(1);
        else
            object2 = new Double(2d);

        System.out.println(object2);
    }

}
