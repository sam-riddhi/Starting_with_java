package com.Functions;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = in.nextInt();
        calc(n1, n2);
    }
    public static void calc(int num1, int num2)
    {
        int result = num1 * num2;
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + result);
    }
}
