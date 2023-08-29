package com.aditya.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    static void greeting() {
        System.out.println("Hey, i am in box class.");
    }
    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side) {

        //super();  //obj class

        this.w = side;
        this.l = side;
        this.h = side;
    }

     Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void info() {
        System.out.println("Running the box!");
    }
}
