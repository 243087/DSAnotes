package com.rahul.kumar.Module8_Day58_Heap2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Program5_RunningMedian_Optimised {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();                           // Min-heap

    // Method to insert a number into the heaps
    public void insertNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        //either both the heap will have equal number of elements or max-heap will have one or more element than the min-heap
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }                                                                   //        TC = O[logN]          SC = O[N]

    // Method to find the median
    public double findMedian() {
        int n = minHeap.size() + maxHeap.size();
        if (n % 2 == 1)                             // Odd size
            return maxHeap.peek();


        return (minHeap.peek() + maxHeap.peek()) / 2.0;
    }


    public static void main(String[] args) {
        Program5_RunningMedian_Optimised runningMedian = new Program5_RunningMedian_Optimised();

        int[] inputStream = {12, 4, 5, 3, 8, 7};

        // Compute and print the median after each insertion
        for (int num : inputStream) {
            runningMedian.insertNum(num);
            System.out.println("After inserting " + num + ", median is: " + runningMedian.findMedian());
        }
    }
}
