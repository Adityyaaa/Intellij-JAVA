//package com.aditya.Linked_List;
//
//import java.util.List;
//
//public class MergeSort {
//
//    public static class ListNode {
//
//        public ListNode head;
//        public ListNode tail;
//
//        public ListNode () {
//            int size = 0;
//        }
//        int val;
//        ListNode next;
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    }
//
//    public void insertFirst(int i) {
//        ListNode node = new ListNode(val);
//        node.next = head;
//        head = node;
//
//        if(tail == null) {
//            tail = head;
//        }
//
//        size += 1;
//    }
//
//    public ListNode getMid(ListNode head) {
//        ListNode midPrev = null;
//        while(head != null && head.next != null) {
//            midPrev = (midPrev == null) ? head : midPrev.next;
//            head = head.next.next;
//        }
//
//
//        ListNode mid = midPrev.next;
//        midPrev.next = null;
//        return mid;
//    }
//
//    public void display() {
//        ListNode temp = head;
//        while(temp != null) {
//            System.out.print(temp.val + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("END");
//    }
//
//    public static void main(String[] args) {
//        ListNode list = new ListNode();
//        list.insertFirst(1);
//        list.insertFirst(9);
//        list.insertFirst(6);
//        list.insertFirst(8);
//        list.insertFirst(4);
//
//    }
//}
//
