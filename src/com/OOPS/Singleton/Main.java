package com.OOPS.Singleton;

public class Main {
    public static void main(String[] args) {
        singleton obj = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        singleton obj3 = singleton.getInstance();

        // all 3 reference variables are pointing to just one object
    }
}
