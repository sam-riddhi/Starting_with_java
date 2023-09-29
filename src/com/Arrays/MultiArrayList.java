package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialisation
        for (int i = 0; i < 3; i++) //3 lists have been added
        {
            list.add(new ArrayList<>());
        }
        // add elements
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                list.get(i).add(in.nextInt()); //get the arraylist at the index i and something to it
            }
        }
        System.out.println(list);
    }
}
