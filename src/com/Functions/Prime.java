package com.Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        Check(n);
    }
    public static void Check(int m)
    {
        int c = 0;
        for(int i = 1; i <= m; i++)
        {
            if (m % i == 0 )
            {
                c++;
            }
        }
        if(c == 2)
        {
            System.out.println(m + " is a Prime number");
        }
        else
        {
            System.out.println(m + " is not a Prime number");
        }
    }
}
