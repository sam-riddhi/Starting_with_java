package com.samriddhi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2 == 0)
        {
            System.out.println(n + " is Even number");
        }
        else
        {
            System.out.println(n + " is Odd number");
        }
    }
}
