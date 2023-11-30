//package com.aditya.TreeQuestions;
//import java.sql.SQLOutput;
//import java.util.*;
//
//public class DFS {
//    void dfsStack(TreeNode node) {
//        if(node == null) {
//            return;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(node);
//
//        while(!stack.isEmpty()) {
//            TreeNode removed = stack.pop();
//            System.out.println(removed.val + " ");
//            if(removed.right != null) {
//                stack.push(removed.right);
//            }
//            if(removed.left != null) {
//                stack.push(removed.left);
//            }
//        }
//    }
//}
