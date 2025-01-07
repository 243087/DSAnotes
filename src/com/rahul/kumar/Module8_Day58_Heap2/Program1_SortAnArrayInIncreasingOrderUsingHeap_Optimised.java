package com.rahul.kumar.Module8_Day58_Heap2;

import java.util.ArrayList;
import java.util.Arrays;

public class Program1_SortAnArrayInIncreasingOrderUsingHeap_Optimised {

    static ArrayList<Integer> heapSort(ArrayList<Integer> al) {
        buildHeap(al);                // Build the max-heap              for this TC = O[N]
        System.out.println("Max Heap : "+al);
        int last = al.size() - 1;

        // Perform the heap sort
        while (last > 0) {
            swap(al, 0, last);
            last--;
            heapify(al, 0, last);
        }

        return al;                                                 //           TC = O[NlogN]       SC = O[1]
    }

    static void buildHeap(ArrayList<Integer> al) {
        int n = al.size();
        for (int i = (n - 2) / 2; i >= 0; i--) {
            heapify(al, i, n);
        }
    }

    static void heapify(ArrayList<Integer> arr, int index, int size) {
        while (2 * index + 1 < size) { // While left child exists
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;


            int maxValue = Math.max(arr.get(index),Math.max(safeGet(arr, leftChild, size), safeGet(arr, rightChild, size)));

            if (maxValue == arr.get(index)) // If parent is already the largest, stop
                break;

            if (maxValue == safeGet(arr, leftChild, size)) { // Swap with left child
                swap(arr, index, leftChild);
                index = leftChild; // Update index to continue heapifying
            } else { // Swap with right child
                swap(arr, index, rightChild);
                index = rightChild; // Update index to continue heapifying
            }
        }
    }

    static void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

    static int safeGet(ArrayList<Integer> A, int index, int size) {
        if (0 <= index && index < size) {
            return A.get(index);
        }
        return Integer.MIN_VALUE; 
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(14, 13, 10, 7, 6, 8, 5, 2, 1, 3));
        System.out.println("Sorted Array: " + heapSort(al));
    }
}
