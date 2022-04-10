package com.String;

import java.util.Scanner;

public class StringBufferExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(input);

        for ( int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3){
            stringBuffer = stringBuffer.insert(i, ",");
        }

        System.out.println("================");
        System.out.println(stringBuffer);
    }
}
