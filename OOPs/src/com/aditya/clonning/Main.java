package com.aditya.clonning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human aditya = new Human(34, "Aditya Awasthi");
//        Human twin = new Human(aditya);     //making a copy of aditya

        Human twin = (Human)aditya.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(aditya.arr));

    }
}
