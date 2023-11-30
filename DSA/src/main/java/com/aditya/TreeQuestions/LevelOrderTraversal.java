//package com.aditya.TreeQuestions;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.*;
//
//public class LevelOrderTraversal {
//    public static class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode next;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//          this.next = next;
//      }
//  }
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        if(root == null) {
//            return result;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> level = new ArrayList<>();
//
//            for(int i = 0; i < size; i++) {
//                TreeNode curr = queue.poll();
//                level.add(curr.val);
//                if(curr.left != null) {
//                    queue.offer(curr.left);
//                }
//                if(curr.right != null) {
//                    queue.offer(curr.right);
//                }
//            }
//            result.add(level);
//        }
//
//        return result;
//    }
//
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//
//        if(root == null) {
//            return result;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//
//            for(int i = 0; i < size; i++) {
//                TreeNode curr = queue.poll();
//
//                if(i == size - 1) {
//                    result.add(curr.val);
//                }
//
//                if(curr.left != null) {
//                    queue.offer(curr.left);
//                }
//                if(curr.right != null) {
//                    queue.offer(curr.right);
//                }
//            }
//        }
//        return result;
//    }
//
//    public List<Double> averageOfLevels(LevelOrderTraversal.TreeNode root) {
//        {
//            List<Double> result = new ArrayList<>();
//
//            if(root == null) {
//                return result;
//            }
//
//            Queue<TreeNode> queue = new LinkedList<>();
//            queue.offer(root);
//
//            while(!queue.isEmpty()) {
//                int size = queue.size();
//                double average = 0;
//
//                for(int i = 0; i < size; i++) {
//                    TreeNode curr = queue.poll();
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
//
//    public TreeNode findSuccessor(TreeNode root, int key) {
//        List<Double> result = new ArrayList<>();
//
//        if(root == null) {
//            return null;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//                TreeNode curr = queue.poll();
//                if(curr.left != null) {
//                    queue.offer(curr.left);
//                }
//                if(curr.right != null) {
//                    queue.offer(curr.right);
//                }
//                if(curr.val == key) {
//                    break;
//                }
//        }
//
//        return queue.peek();
//    }
//
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        if(root == null) {
//            return result;
//        }
//
//        Deque<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        boolean reverse = false;
//
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> level = new ArrayList<>(size);
//
//            for(int i = 0; i < size; i++) {
//
//                if (!reverse) {
//                    TreeNode curr = queue.pollFirst();
//                    level.add(curr.val);
//                    if (curr.left != null) {
//                        queue.addLast(curr.left);
//                    }
//                    if (curr.right != null) {
//                        queue.addLast(curr.right);
//                    }
//                } else {
//                    TreeNode curr = queue.pollLast();
//                    level.add(curr.val);
//                    if (curr.right != null) {
//                        queue.addFirst(curr.right);
//                    }
//                    if (curr.left != null) {
//                        queue.addFirst(curr.left);
//                    }
//                }
//            }
//            reverse = !reverse;
//            result.add(level);
//        }
//        return result;
//    }
//
//    public TreeNode connect(TreeNode root) {
//         if(root == null) {
//             return null;
//         }
//
//         TreeNode leftMost = root;
//         while (leftMost.left != null) {
//             TreeNode curr = leftMost;
//             while (curr != null) {
//                 curr.left.next = curr.right;
//                 if(curr.next != null) {
//                     curr.right.next = curr.next.left;
//                 }
//                 curr = curr.next;
//             }
//             leftMost = leftMost.left;
//         }
//         return root;
//    }
//
//    public boolean isCousins(TreeNode root, int x, int y) {
//        TreeNode xx = findNode(root, x);
//        TreeNode yy = findNode(root, y);
//
//        return (level(root, xx, 0) == level(root, yy, 0) && (!isSibling(root, xx, yy));
//
//    }
//
//    TreeNode findNode(TreeNode node, int x) {
//        if(node == null) {
//            return null;
//        }
//        if(node.val == x) {
//            return node;
//        }
//        TreeNode n = findNode(node.left, x);
//        if(n != null) {
//            return n;
//        }
//        return findNode(node.right, x);
//    }
//
//    boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
//        if(node == null) {
//            return false;
//        }
//
//        return (
//                (node.left == x && node.right == y) || (node.left == y && node.right == x)
//                || isSibling(node.left, x, y) || isSibling(node.right, x, y)
//                );
//    }
//
//    int level(TreeNode node, TreeNode x, int lev) {
//        if(node == null) {
//            return 0;
//        }
//
//        if(node == x) {
//            return lev;
//        }
//
//        int l = level(node.left, x, lev+1);
//        if(l != 0) {
//            return l;
//        }
//        return level(node.right, x, lev+1);
//    }
//
//    public boolean isSymmetric(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root.left);
//        queue.add(root.right);
//
//        while(!queue.isEmpty()) {
//            TreeNode left = queue.poll();
//            TreeNode right = queue.poll();
//
//            if(left == null && right == null) {
//                continue;
//            }
//            if(left == null || right == null) {
//                return false;
//            }
//
//            if(left.val != right.val) {
//                return false;
//            }
//
//            queue.add(left.left);
//            queue.add(right.right);
//            queue.add(left.right);
//            queue.add(right.left);
//        }
//        return true;
//    }
//
//    int diameter = 0;
//    public int diameterOfBinaryTree(TreeNode root) {
//        height(root);
//        return diameter-1;
//    }
//
//    int height(TreeNode node) {
//        if(node == null) {
//            return 0;
//        }
//        int leftHeight = height(node.left);
//        int rightHeight = height(node.right);
//
//        int dia = leftHeight + rightHeight + 1;
//        diameter = Math.max(diameter, dia);
//
//        return Math.max(leftHeight, rightHeight) + 1;
//    }
//
//    public TreeNode invertTree(TreeNode root) {
//        if(root == null) {
//            return null;
//        }
//
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//
//        root.left = right;
//        root.right = left;
//
//        return root;
//    }
//
//    public void flatten(TreeNode root) {
//        if(root == null) {
//            return null;
//        }
//
//        TreeNode curr = root;
//        while(root != null) {
//            if(curr.left != null) {
//                TreeNode temp = curr.left;
//                while(temp.right != null) {
//                    temp = temp.right;
//                }
//
//                temp.right = curr.right;
//                curr.right = left;
//                curr.left = null;
//            }
//            curr = curr.right;
//        }
//    }
//
//    public boolean isValidBST(TreeNode root) {
//        return helper(root, null, null);
//    }
//    public boolean helper(TreeNode node, Integer low, Integer high) {
//        if(node == null) {
//            return true;
//        }
//
//        if(low != null && node.value <= low) {
//            return true;
//        }
//
//        if(high != null && node.val >= high) {
//            return false;
//        }
//
//        boolean leftTree = helper(node.left, low, node.val);
//        boolean rightTree = helper(node.right, node.val, high);
//
//        return leftTree && rightTree;
//    }
//
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == null) {
//            return null;
//        }
//
//        if(root == p || root == q) {
//            return root;
//        }
//
//        TreeNode left = lowestCommonAncestor(root.left, p, q);
//        TreeNode right = lowestCommonAncestor(root.right, p, q);
//
//        if(left != null && right != null) {
//            return root;
//        }
//
//        return left == null ? right : left;
//    }
//
//    public int kthSmallest(TreeNode root, int k) {
//        return helper(root, k).val;
//    }
//    public TreeNode helper(TreeNode root, int k) {
//        if(root == null) {
//            return null;
//        }
//
//        TreeNode left = helper(root.left, k);
//
//        if(left != null) {
//            return left;
//        }
//        count++;
//
//        if(count == k) {
//            return root;
//        }
//
//        return helper(root.right, k);
//    }
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if(preorder.length == 0) {
//            return null;
//        }
//
//        int r = preorder[0];
//        int index = 0;
//
//        for(int i = 0; i < inorder.length; i++) {
//            if(inorder[i] == r) {
//                index = i;
//            }
//        }
//
//        TreeNode node = new TreeNode(r);
//        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index));
//        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));
//
//        return node;
//    }
//}
