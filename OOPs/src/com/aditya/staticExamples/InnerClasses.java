package com.aditya.staticExamples;

public class InnerClasses {
    static class Test {
        String name;
        public Test(String name) {  //creating a constructor
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("X");
        Test b = new Test("Y");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
