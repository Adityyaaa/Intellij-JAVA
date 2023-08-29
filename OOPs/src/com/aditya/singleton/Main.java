package com.aditya.singleton;

import com.aditya.access.A;

public class Main extends A{
    public Main(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

        // All 3 ref var are pointing to just one obj
        Singleton obj = Singleton.getInstance();

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        A a = new A(10, "Aditya");
        a.getNum();
        int n = a.num;
    }
}
