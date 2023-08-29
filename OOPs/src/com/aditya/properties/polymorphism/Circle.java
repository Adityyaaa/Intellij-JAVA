package com.aditya.properties.polymorphism;

public class Circle extends Shapes{

    //this will run when obj of Circle is created
    //hence it is overriding the parent method
    @Override  //this is called annotation
    void area() {
        System.out.println("I am in circle!");
    }
}
