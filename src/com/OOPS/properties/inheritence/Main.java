package com.OOPS.properties.inheritence;

public class Main {
    public static void main(String[] args) {
        //Box box1 = new Box(4.6, 7.8, 9.8);
        //Box box2 = new Box(box1);
        //System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
//        System.out.println(box3.h + " " + box3.weight );

        Box box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in ref type i.e. Boxweight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialized
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
        //BoxWeight box6 = new Box(2, 3, 4);
        //System.out.println(box6);
    }
}
