package com.wrapper;

@SuppressWarnings("removal")
public class WrapperToString {
    public static void main(String[] args) {
        Integer integer = 1;

        String s = integer.toString();
        String s2 = String.valueOf(integer);

        System.out.println(s);
        System.out.println(s2);

        String s1 = "12345";
        Integer integer1 = Integer.parseInt(s1);
        Integer integer2 = new Integer(s1);

        System.out.println(integer1);
        System.out.println(integer2);
    }
}
