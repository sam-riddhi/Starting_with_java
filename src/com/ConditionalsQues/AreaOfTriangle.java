package com.ConditionalsQues;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s;
        System.out.println("Enter sides of Triangle: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if ((a+b)>c && (a+c)>b && (b+c)>a) {
            s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of Triangle is: " + area);
        }
        else {
            System.out.println("The triangle with entered dimensions do not exist");
        }
    }
}
