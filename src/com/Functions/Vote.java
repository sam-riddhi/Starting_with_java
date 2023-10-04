package com.Functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = in.nextInt();
        int vote = Age(age);
        System.out.println(vote);
    }
    public static int Age(int age)
    {
        if (age >= 18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
        return age;
    }
}
