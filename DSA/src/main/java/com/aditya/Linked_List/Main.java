package com.aditya.Linked_List;

public class Main {
    public static void main(String[] args) {

        // SINGLE LINKED LIST OPERATION

        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(15);
        list.insertFirst(45);
        list.insertFirst(96);
        list.insertFirst(6);

        list.insert(99,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(5,2);
        list.display();

        // DOUBLY LINKED LIST OPERATION

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(15);
//        list.insertLast(99);
//        list.insert(8,65);
//
//        list.display();

        //CIRCULAR LINKED LIST OPERATION

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(2);
//        list.insert(8);
//        list.insert(15);
//
//        list.display();
//        list.delete(15);
//
//        list.display();

    }
}
