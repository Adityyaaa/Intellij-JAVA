package com.aditya.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void carrer() {
        System.out.println("I am doc");
    }

    @Override
    void partner() {
        System.out.println("I love coding!");
    }
}
