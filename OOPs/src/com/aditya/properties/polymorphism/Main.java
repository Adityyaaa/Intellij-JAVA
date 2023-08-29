package com.aditya.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();  //type of the reference var is of parent class but the obj is of sub class
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
