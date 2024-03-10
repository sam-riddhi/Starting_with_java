package com.OOPS.StaticExample;

import java.security.PublicKey;
class Test {
    static String name;

    public Test(String name)
    {
        this.name = name;
    }
}
public class InnerClasses {

    public static void main(String[] args) {
        Test a = new Test("Samriddhi");
        Test b = new Test("Saksham");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//static class A{
//
//}
