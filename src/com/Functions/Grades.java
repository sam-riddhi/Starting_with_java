package com.Functions;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Marks Of Subjects: ");
        int marks = in.nextInt();
        Check(marks);
    }

//          Marks        Grade
//          91-100         AA
//          81-90          AB
//          71-80          BB
//          61-70          BC
//          51-60          CD
//          41-50          DD
//          <=40          Fail

    public static void Check(int n)
    {
        if(n <= 100 && n>=91)
            System.out.println("AA");
        else if(n <= 90 && n>=81)
            System.out.println("AA");
        else if(n <= 80 && n>=71)
            System.out.println("AA");
        else if(n <= 70 && n>=61)
            System.out.println("AA");
        else if(n <= 60 && n>=51)
            System.out.println("AA");
        else if(n <= 50 && n>=41)
            System.out.println("AA");
        else
            System.out.println("Fail");
    }
}
