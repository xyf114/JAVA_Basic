package com.date;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //Calender无格式化输出
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        //月份从0开始编号
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }
}
