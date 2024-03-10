package com.OOPS;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);

        final int bonus = 2;
       // bonus = 3;

        A sam = new A("Samriddhi Jaiswal");
        sam.name = "Other name";

        // When a non primitive is final, we cannot reassign it.
        //sam = new A("New object");
    }

    static void swap(Integer a, Integer b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name)
    {
       // System.out.println();
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
}
