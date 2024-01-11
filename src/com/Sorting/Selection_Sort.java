package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.print("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with current index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i <= end; i++)
        {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}

