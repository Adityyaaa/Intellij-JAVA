package com.aditya.easy;

public class Nto1 {
    public static void main(String[] args) {
        funRev(5);
    }

    static void fun(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        funRev(n-1);
        System.out.println(n);
    }
}
