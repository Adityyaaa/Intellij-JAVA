package com.aditya.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll no.
        int[] num = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: (roll, name , marks)
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
        // Student aditya;
        // aditya = new Student();

        Student aditya = new Student(6, "Rishul", 56);
        Student rahul = new Student();

//         aditya.roll = 06;
//         aditya.name = "Rishul";
//         aditya.marks = 78.56f;

//        aditya.changeName("Rishul");
//        aditya.greeting();

        System.out.println(aditya.roll);
        System.out.println(aditya.name);
        System.out.println(aditya.marks);

        Student random = new Student(aditya);
        System.out.println(random.name);

//        Student one = new Student();
//        Student two = one;
//
//        one.name = "Something something";
//        System.out.println(two.name);

    }
}
class Student {
    // create a class
    // for every single student
    int roll;
    String name;
    float marks = 45;

    // we need a way to add the values of above properties obj by obj
    // we need one word to access every obj

    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

    Student (Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

    Student () {
        this.name = "Aditya";
        this.roll = 6;
        this.marks = 58.5f;
    }

    //student arpit = new Student(18, "Arpit", 98.5f);
    //here this will be replaced with arpit
    Student (int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

}
