package com.String;

public class StringMethod {
    public static void main(String[] args) {
        String string = "早上好，hello，123";
        //split返回一个同类型数组
        String [] split = string.split("，");
        for (String tmp: split) {
            System.out.println(tmp);
        }
        System.out.println("==============");

//        String path = "D\\abc\\def";
        String path = "a?b?c";
        //特殊符号需要转译符\\,特殊符号{}[]!$/^-|?*+.
//        split = path.split("\\\\");
        split = path.split("\\?");
        for (String tmp: split) {
            System.out.println(tmp);
        }
        System.out.println("==============");

        //用第一个string替换第二个string
        String replace = string.replace("123", "456");
        System.out.println(replace);
        System.out.println("==============");

        char [] charArray = string.toCharArray();
        for (char tmp: charArray) {
            System.out.print(tmp);
        }
        System.out.println("==============");

        //字符串格式化

        String name = "Ivan";
        char gender = '男';
        int age = 26;
        double score = 87.66;
        // %.2f指代四舍五入保留两位小数
        String format = "我的名字叫%s，我是%c性，我今年%d岁，我的成绩是%.2f";
        String info = String.format(format, name, gender, age, score);
        System.out.println(info);
        System.out.println("==============");

    }
}
