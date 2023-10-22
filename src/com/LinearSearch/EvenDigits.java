package com.LinearSearch;

import java.util.Scanner;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++)
        {
           a[i] = in.nextInt();
        }
        System.out.println(findNumbers(a));
    }
    static int findNumbers(int[] nums) {
        int d = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int c= 0;
            while (nums[i] > 0)
            {
                c++;
                nums[i] = nums[i]/10;
            }
            if (c%2 == 0)
            {
                d++;
            }
        }
        return d;
    }
}
