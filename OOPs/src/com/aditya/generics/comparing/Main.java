package com.aditya.generics.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student aditya = new Student(12, 45.45f);
        Student rahul = new Student(4, 99.54f);
        Student a = new Student(7, 95.54f);
        Student b = new Student(1, 29.54f);

        Student [] list = {aditya, rahul, a, b};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

//        if(aditya.compareTo(rahul) < 0) {
//            System.out.println(aditya.compareTo(rahul));
//            System.out.println("Rahul has more marks");
//        }
    }
}
