package com.aditya.properties.inheritance;

public class BoxWeight extends Box{
     double weight;

     public BoxWeight() {
         this.weight = -1;
     }

//     @Override
//             static void greeting() {
//         System.out.println("Hey i am in BoxWeight class.");
//     }

     BoxWeight (BoxWeight other) {
         super(other);
         weight = other.weight;
     }

     BoxWeight(double side, double weight) {
         super(side);
         this.weight = weight;
     }

     public BoxWeight(double l, double h, double w, double weight) {

         super(l,h,w);    //what is this? call the parent class constructor
         //used to initialise values present in parent class
         this.weight = weight;
     }
}
