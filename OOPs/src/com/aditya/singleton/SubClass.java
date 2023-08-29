package com.aditya.singleton;

import com.aditya.access.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(34,"Saira");
//        int n = obj.num;
    }
}

class SubSubclass extends SubClass {
    public SubSubclass(int num, String name) {
        super(num, name);
        }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(34, "Aditya");
        int n = obj.num;
    }
}

class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(34,"Saira");
        int n = obj.num;
    }
}


