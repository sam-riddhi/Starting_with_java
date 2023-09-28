package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
    /*
            1 2 3
            4 5 6
            7 8 9
     */
        Scanner in = new Scanner(System.in);
        //int[][] arr = new int[3][3]; //the firs bracket is for no. of rows; 2nd is for columns
        // adding no. of columns is not necessary but adding no. of rows is necesaary

//    int[][] arr = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//    };
//        int[][] arr = {
//                {1, 2, 3},   //0th index
//                {4, 5},  // 1st index
//                {7, 8, 9, 10} // 2nd index -> arr[2] = {7, 8, 9, 10}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); //gives no. of rows i.e. 3
        //input

        for (int row = 0; row < arr.length; row++)
        {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }

        //output
//        for (int row = 0; row < arr.length; row++)
//        {
//            //for each column in every row
//            for (int col = 0; col < arr[row].length; col++)
//            {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // OR another way to print the output

//        for (int row = 0; row < arr.length; row++)
//        {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
