package com.aditya.staticExamples;

public class Main {
    public static void main(String[] args) {
//        Human aditya = new Human(21,"Aditya", 10000, false);
//        Human rahul = new Human(20,"Rahul", 20000, true);
//        Human arpit = new Human(20,"Arpit", 20000, true);
//
//        System.out.println(aditya.population);
//        System.out.println(rahul.population);
//        System.out.println(arpit.population);

        Main funn = new Main();
        funn.fun2();

    }

    static void fun() {
        // greeting(); // you cannot use this becasue it requires an instance but the function you are using it in does not depend in instances
        // you cannot access non static stuff without referncing their instances in a static context

        // hence here i am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    void greeting() {
        // fun();
        System.out.println("Greeting!");
    }
}
