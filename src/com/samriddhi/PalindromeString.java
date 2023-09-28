package com.samriddhi;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.next();
        String rev = "";
        int len = str.length();
       // boolean flag = true;
        str = str.toLowerCase();
        for(int i = len - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");

    }
}
