package com.OOPS;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
        // stores 5 roll nos
        int[] numbers = new int[5];

        // stores 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // A class is a named group of properties and functions

        Student[] students = new Student[5];
        // just declaring
//        Student Sam;
//        Sam  = new Student();

        Student sam = new Student(15, "Samriddhi", 90);
       // Student sak = new Student();

//        sam.rno = 13;
//        sam.name = "Samriddhi Jaiswal";
//        sam.marks = 98.5f;

//            sam.changeName("Shally");
//            sam.greeting();

        System.out.println(sam.rno);
        System.out.println(sam.name);
        System.out.println(sam.marks);
        //System.out.println(Arrays.toString(students));
    }
}
    // create a class
    // for every single student
    class Student {
        int rno;
        String name;
        float marks;

        // we need a way to add the values of the above
        // properties object by object

        // we need one word to access every object

        void greeting()
        {
            System.out.println("Hello " +name);
        }

        void changeName(String newname)
        {
            name  = newname;
        }
        Student(int roll, String name, float marks)
        {
            rno = roll;
            name = name;
            marks = marks;
        }
    }

