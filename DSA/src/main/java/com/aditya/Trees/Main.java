package com.aditya.Trees;

import java.util.* ;

public class Main {
    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(sc);
////        tree.display();
//        tree.prettyDisplay();

//        BinarySearchTree tree = new BinarySearchTree();
//        int[] nums = {5, 2, 7, 1, 3, 9, 12};
//        tree.populate(nums);
//        tree.display();

//        AVL tree = new AVL();
//        for(int i = 0; i < 1000; i++) {
//            tree.insert(i);
//        }
//
//        System.out.println(tree.height());

        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
//        tree.display();

        System.out.println(tree.query(1, 6));
    }
}