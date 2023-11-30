package com.aditya.Linked_List;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL () {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    //using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1 , node.next);
        return node;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
             if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    //questions

    //remove duplicates
    public void duplicates() {
        Node node = head;

        while(node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //merge sorted LL
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null) {
            if(f.value <= s.value) {
                ans.insertLast(f.value);
                f = f.next;
            }
            else {
                 ans.insertLast(s.value);
                 s = s.next;
            }
        }
        while(f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public void bubbleSort() {
        bubbleSort(size-1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            Node first = get(col);
            Node second = get(col+1);

            if(first.value > second.value) {
                //swap
                if(first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }
                else {
                     Node prev = get(col - 1);
                     prev.next = second;
                     first.next = second.next;
                     second.next = first;
                }
            }
            bubbleSort(row, col+1);
        } else {
            bubbleSort(row-1, 0);
        }
    }

    //recursion reverse
    private void reverse(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //inplace reversal
    public void reverse () {
        if(size < 2) {
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    //LL Reversal 2
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) {
            return head;
        }

        //skip first left-1 nodes
        ListNode present = head;
        ListNode prev = null;
        for(int i = 0; present != null && i < left-1; i++) {
            prev = present;
            present = present.next;
        }

        ListNode last = prev;
        ListNode newEnd = present;

        //reverse between left and right
        assert present != null;
        ListNode next = present.next;
        for(int i = 0; present != null && i < right-left+1; i++) {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) {
                next = next.next;
            }
        }

        if(last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = present;
        return head;
    }

    // Palindrome LL
//    public boolean isPalindrome(ListNode head) {
//        ListNode mid = middleNode(head);
//        ListNode headSecond = reverseList(mid);
//        ListNode rereverseHead = headSecond;
//
//        //compare both halves
//        while(head != null && headSecond != null) {
//            if(head.val != headSecond.val) {
//                break;
//            }
//            head = head.next;
//            headSecond = headSecond.next;
//        }
//        reverseList(rereverseHead);
//
//        return (head == null || headSecond == null);
//    }

    //Reorder List
//    public void reorderList(ListNode head) {
//         if(head == null || head.next == null) {
//             return;
//         }
//
//        //skip first left-1 nodes
//        ListNode present = head;
//        ListNode prev = null;
//        for(int i = 0; present != null && i < left-1; i++) {
//            prev = present;
//            present = present.next;
//        }
//
//        ListNode last = prev;
//        ListNode newEnd = present;
//
//        //reverse between left and right
//        assert present != null;
//        ListNode next = present.next;
//        for(int i = 0; present != null && i < right-left+1; i++) {
//            present.next = prev;
//            prev = present;
//            present = next;
//            if(next != null) {
//                next = next.next;
//            }
//        }
//
//        if(last != null) {
//            last.next = prev;
//        } else {
//            head = prev;
//        }
//        newEnd.next = present;
//        return head;
//    }

    // reverse k nodes
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null) {
            return head;
        }

        //skip first left-1 nodes
        ListNode present = head;
        ListNode prev = null;

        while (true) {
            ListNode last = prev;
            ListNode newEnd = present;

            //reverse between left and right
            assert present != null;
            ListNode next = present.next;
            for(int i = 0; present != null && i < k; i++) {
                present.next = prev;
                prev = present;
                present = next;
                if(next != null) {
                    next = next.next;
                }
            }

            if(last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = present;

            if(present == null) {
                break;
            }

            prev = newEnd;
        }
        return head;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode last = head;
        int length = 1;
        while(last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newLast = head;
        for(int i = 0; i < skip -1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

    public static void main(String[] args) {

        //remove duplicates

//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//
//        list.display();
//        list.duplicates();
//        list.display();

        //merge sorted lists

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();

        LL list = new LL();
        for(int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}
