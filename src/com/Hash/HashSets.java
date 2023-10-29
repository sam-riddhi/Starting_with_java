package com.Hash;
import java.util.HashSet;
import java.util.Iterator;
public class HashSets {
    public static void main(String[] args) {
        //Creation
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  //does not consider duplicate elements

        //Size
        System.out.println("Size of set is : " + set.size());

        //Print all elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //Search - Contains
        if(set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)) {
            System.out.println("Does not contain");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("Does not contain 1 - we deleted 1");
        }
    }
}
