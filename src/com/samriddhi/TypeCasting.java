package com.samriddhi;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //Type casting
//        int num = (int)(54.76f);
//        System.out.println(num);

        //automatic type promotion in expression
//        int number  = 'A';
//        System.out.println(number);
//        System.out.println("नमस्ते");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 45456;
        float f = 56.987f;
        double d = 0.2345;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        //float + int - double = double
        System.out.println(result);

    }
}
