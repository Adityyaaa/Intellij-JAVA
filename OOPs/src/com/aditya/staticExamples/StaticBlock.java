package com.aditya.staticExamples;

//this is a demo to show initialisation of static var
public class StaticBlock {
    static int a = 10;
    static int b;

    //only run once when the first object will be created that is obj here
    static {
        System.out.println("I am in static block!");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
