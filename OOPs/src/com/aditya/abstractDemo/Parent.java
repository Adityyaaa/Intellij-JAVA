package com.aditya.abstractDemo;

public abstract class Parent {     //if we put final instead of public then it cannot be inherited
    int age;

    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 3453234;
    }

    static void hello() {
        System.out.println("Hello from parent");
    }

    void normal() {
        System.out.println("Normal method! ");
    }
    abstract void carrer();
    abstract void partner();
}
