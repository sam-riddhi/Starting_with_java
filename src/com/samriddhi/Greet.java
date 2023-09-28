package com.samriddhi;


import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String str = in.next();
        System.out.println("Hello " + str);
    }
}
