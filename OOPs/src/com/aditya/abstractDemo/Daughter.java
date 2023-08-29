package com.aditya.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }
    @Override
    void carrer() {
        System.out.println("I want to be eng");
    }

    @Override
    void partner() {
        System.out.println("I love cooking.");
    }
}
