package com.aditya.interfaces;

public class Car implements Engine, Brake, Media{

    @Override
    public void brake() {
        System.out.println("I brake");
    }

    @Override
    public void start() {
        System.out.println("I start from car.java");
    }

    @Override
    public void stop() {
        System.out.println("I stop from car.java");
    }

    @Override
    public void acc() {
        System.out.println("I acc");
    }
}
