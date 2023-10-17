package com.Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Factorial(n));
    }
    static int Factorial(int n) {
        int x=1;
        for (int i = 1; i <=n; i++)
        {
            x = x*i;
        }
        return x;
    }
}
