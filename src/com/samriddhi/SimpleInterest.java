package com.samriddhi;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        int P = in.nextInt();
        System.out.println("Enter Time: ");
        int T = in.nextInt();
        System.out.println("Enter Rate: ");
        int R = in.nextInt();
        int si = (P*T*R)/100;
        System.out.println("Simple Interest: " + si);
    }
}
