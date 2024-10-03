package com.rahul.kumar.scaler.Module5Day34_Hashing2;

import java.util.Arrays;
import java.util.HashSet;


//Given an array[ N ]. Check if there is a subarray with sum = k
public class Program3_CheckIfSubArraySumEqualToKOptimised {

    static boolean subSum(int[] arr, int num) {
        long[] preArr = new long[arr.length];
        preArr[0] = arr[0];

        // Calculate prefix sums
        for (int i = 1; i < arr.length; i++) {
            preArr[i] = preArr[i - 1] + arr[i];
        }
        System.out.println("Prefix sum array is "+Arrays.toString(preArr));
        HashSet<Long> hs = new HashSet<>();
        hs.add((long) 0);                                  // Add 0 to handle single element

        for (int i = 0; i < arr.length; i++) {
            long need = preArr[i] - num;
            if (hs.contains(need)) {
                return true;
            }
            hs.add(preArr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,9,-4,1,5,6,2,5};
        int num = 15;
        System.out.println(subSum(arr, num));  // Should print true
    }
}