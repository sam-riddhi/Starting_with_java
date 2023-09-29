package com.ConditionalsQues;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float r = in.nextFloat();
        double area = 3.14 * r * r;
        System.out.println("Area of Circle: " + area);
    }
}
