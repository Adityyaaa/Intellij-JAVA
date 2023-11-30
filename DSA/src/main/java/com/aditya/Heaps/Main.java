package com.aditya.Heaps;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(78);
        heap.insert(96);
        heap.insert(56);
        heap.insert(11);

//        System.out.println(heap.remove());

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
