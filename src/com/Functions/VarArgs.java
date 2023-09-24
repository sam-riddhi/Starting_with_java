package com.Functions;

import java.util.Arrays;

public class VarArgs { //When we don't know how many inputs we are giving
    public static void main(String[] args) {
//        fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
//        multiple(2, 3, "Samriddhi", "Saksham");
        demo("43", "4");
    }

    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v) {

    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

}
