package com.OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human sam = new Human(22, "Samriddhi", 100000, false);
        Human sak = new Human(21, "Saksham", 10000, false);
        Human arp = new Human(24, "Arpit", 1000, true);
        System.out.println(sam.name);
        System.out.println(sam.population);
        System.out.println(sak.population);
        System.out.println(arp.population);

        Main funn = new Main();
        funn.fun2();

    }
    // this is not dependent on objects
    static void fun()
    {
        //greeting(); // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2()
    {
        greeting();
    }
    // We know that something which is not static, belongs to an object
    void greeting()
    {
        System.out.println("Hello");
    }
}
