package com.bigintegerANDbigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigDemo {
    public static void main(String[] args) {
//        long longnum = 9999999999999999999999999999; 无法放入
        BigInteger bigInteger = new BigInteger("9999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("1");

        BigInteger add = bigInteger.add(bigInteger1);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        BigInteger divide = bigInteger.divide(bigInteger1);
        BigInteger multiply = bigInteger.multiply(bigInteger1);

        System.out.println(add);
        System.out.println(subtract);
        System.out.println(divide);
        System.out.println(multiply);

        BigDecimal bigDecimal = new BigDecimal("1.23456789123456789123456789");
        BigDecimal bigDecimal1 = new BigDecimal("3.0");

        BigDecimal add1 = bigDecimal.add(bigDecimal1);
        BigDecimal subtract1 = bigDecimal.subtract(bigDecimal1);
        BigDecimal multiply1 = bigDecimal.multiply(bigDecimal1);

        //BigDecimal divide1 = bigDecimal.divide(bigDecimal1);
        // 除不尽 会抛出无限循环异常
        BigDecimal divide1 = bigDecimal.divide(bigDecimal1, RoundingMode.CEILING);

        System.out.println(add1);
        System.out.println(subtract1);
        System.out.println(multiply1);
        System.out.println(divide1);

    }
}
