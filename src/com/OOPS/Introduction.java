package com.OOPS;

import java.util.Arrays;
import java.util.SimpleTimeZone;

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

        Student random = new Student(sam);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one  = new Student();
        Student two = one;

        one.name = "Something";

        System.out.println(two.name);
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

        Student (Student other)
        {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }
        Student()
        {
            // this is how you call a constructor from another constructor
            // internally : new Student();
            this (13,"default person", 100.6f);
        }

        // Student arpit = new Student(17, "Arpit", 78.9f);
        // here, this will be replaced with arpit
        Student(int rno, String name, float marks)
        {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }

