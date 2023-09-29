package com.ConditionalsQues;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float l, b;
        l = in.nextFloat();
        b = in.nextFloat();
        float a = l*b;
        System.out.println(a);
    }
}
