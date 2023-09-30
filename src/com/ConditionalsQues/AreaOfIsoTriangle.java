package com.ConditionalsQues;

import java.util.Scanner;

public class AreaOfIsoTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b;
        System.out.println("Enter the sides: ");
        a = in.nextDouble();
        b = in.nextDouble();
        double v = (Math.sqrt((a * a) - ((b * b) / 4))) ;
        double area = 1/2 *v *b;
        System.out.println(area);
    }
}
