package com.aditya.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.partner();

        Daughter daughter = new Daughter(32);
        daughter.carrer();

        Parent.hello();
    }
}
