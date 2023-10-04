package com.Functions;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first no.: ");
        int a = in.nextInt();
        System.out.println("Enter the second no.: ");
        int b = in.nextInt();
        System.out.println("Enter the third no.: ");
        int c = in.nextInt();

        int large = Max(a, b, c);
        int small = Min(a, b, c);

        System.out.println("Maximum no. among " + a +", " + b + "and " + c + ": " + large);
        System.out.println("Minimum no. among " + a +", " + b + "and " + c + ": " + small);
    }
    public static int Max(int first, int second, int third)
    {
        int max = first;
        if (second > first)
        {
            max  = second;
        }
        if (third > first)
        {
            max = third;
        }
        return max;
    }

    public static int Min(int first, int second, int third)
    {
        int min = first;
        if (second < first)
        {
            min  = second;
        }
        if (third < first)
        {
            min = third;
        }
        return min;
    }
}
