package com.aditya.enumsExamples;

public class Basic {
    enum Week {
        Mon, Tues, Wed, Thurs, Fri, Sat, Sun;
        //these are enum constants
        //public, static and final
        //since its final you can create child enums
        //type is Week

        Week() {
            System.out.println("Constructor called for " + this);
        }
        //this is not public or protected, only private or default
        //why? we don't want to create new objs
        //this is not the enums concept

        //internally: public static final Week Monday = new Week();

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Mon;

//        for(Week day: Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
    }
}
