package com.aditya.interfaces.extendDemo2;

public interface A {
    default void fun() {
        System.out.println("I am in A");
    }
}
