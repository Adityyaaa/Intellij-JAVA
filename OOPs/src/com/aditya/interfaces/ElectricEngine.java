package com.aditya.interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("EE Starts");
    }

    @Override
    public void stop() {
        System.out.println("EE Stops");
    }

    @Override
    public void acc() {
        System.out.println("EE Acc");
    }
}
