//package com.aditya.TreeQuestions;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class AverageOfLevels {
//     public class TreeNode {
//         int val;
//         TreeNode left;
//         TreeNode right;
//         TreeNode() {}
//         TreeNode(int val) { this.val = val; }
//         TreeNode(int val, TreeNode left, TreeNode right) {
//             this.val = val;
//             this.left = left;
//             this.right = right;
//            }
//     }
//    public List<Double> averageOfLevels(LevelOrderTraversal.TreeNode root) {
//        {
//            List<Double> result = new ArrayList<>();
//
//            if(root == null) {
//                return result;
//            }
//
//            Queue<LevelOrderTraversal.TreeNode> queue = new LinkedList<>();
//            queue.offer(root);
//
//            while(!queue.isEmpty()) {
//                int size = queue.size();
//                double average = 0;
//
//                for(int i = 0; i < size; i++) {
//                    LevelOrderTraversal.TreeNode curr = queue.poll();
//                    average += curr.val;
//                    if(curr.left != null) {
//                        queue.offer(curr.left);
//                    }
//                    if(curr.right != null) {
//                        queue.offer(curr.right);
//                    }
//                }
//                average = average/size;
//                result.add(average);
//            }
//
//            return result;
//        }
//    }
//
//}
