package com.basic.Recursion;
/* 猴子吃桃子问题:有一堆桃子,猴子第一天吃了其中的一半,并再多吃了一个!
以后每天猴子都吃其中的一半,然后再多吃一个。当到第 10 天时,
想再吃时(即还没吃),发现只有 1 个桃子了。问题:最初共多少个桃子? */

public class Recusion04 {
    public static void main(String[] args) {
        Peach peach = new Peach();
        int total = peach.peach(1);
        System.out.println(total);
    }
}

class Peach{
    public int peach(int i){
        if (i == 10){
            return 1;
        }else {
            return (peach(i+1)+1)*2;
        }
    }
}