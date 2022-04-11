package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getDayOfMonth());

        LocalDate localDate = LocalDate.now();//年月日
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();//时分秒
        System.out.println(localTime);

    }
}
