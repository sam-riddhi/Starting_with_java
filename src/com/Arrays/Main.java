package com.Arrays;

public class Main {
    public static void main(String[] args) {
        // Store a roll no
        int a = 19;

        // Store a person's name
        String name = "Samriddhi";

        // store 5 roll numbers
        int roll1 = 23;
        int roll2 = 45;

        // Syntax of arrays
        // datatype[] variable_name = new datatype[size];

        // Store 5 roll numbers;
//        int[] ronos = new int[5];
////        //or directly
////        int[] ronos2 = {23,45,33,66,78};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; //initialization: actually here object is being created in the heap memory
       // System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);


        }
}
