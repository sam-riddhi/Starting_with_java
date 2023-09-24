package com.Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            // int a= 78; //already initialized outside the block in the same metgod, hence we cannot initialize again
            a = 100; //reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99; //values initialized inside this block, will remain inside the block
        }
       // System.out.println(c); // cannot use outside the block
    }
    static void random() {
        int num = 67;
        System.out.println(num);
    }
}
