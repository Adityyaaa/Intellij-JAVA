package com.aditya.introduction;

public class Wrapper {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a + " " + b);

//         final int bonus = 2;
//         bonus = 4;    }

        final A aditya = new A("Aditya Awasthi");
        aditya.name = "other name";
        System.out.println(aditya);

        //when a non premitive is final you cannot reassign it
//         aditya = new A("new object");

        A obj = new A("AMIT");
        System.out.println(obj);

        for(int i = 0; i < 100000000; i++) {
            obj = new A("Random Name");
        }
    }

    static void swap (Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("Object created.");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed!");
    }
}
