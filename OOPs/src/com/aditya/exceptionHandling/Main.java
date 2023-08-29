package com.aditya.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
//            divide(a,b);
            String name = "Aditya is king!";
            if(name.equals("Aditya is king!")) {
                throw new MyException("name is aditya.");
            }
        } catch (MyException e) {         //Exception is a class
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {         //Exception is a class
            System.out.println(e.getMessage());
        } catch (Exception e) {         //Exception is a class
            System.out.println("normal exception");
        } finally {                     //finally will always run no matters it catches error or not
            System.out.println("this will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}