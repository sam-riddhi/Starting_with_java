package com.samriddhi;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Print numbers from 1-5
//        for(int num = 1; num<=5; num++)
//        {
//            System.out.println(num);
//        }
        //Print numbers from 1-n
        //int n = in.nextInt();
//        for (int num = 0; num <= n; num++) {
//           // System.out.println(num + " ");
//            System.out.println("Hello World");
//        }
        //while loop

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num +=1;
        }

        //do while

        int n =1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

    }
}
