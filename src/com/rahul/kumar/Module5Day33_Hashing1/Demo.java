package com.rahul.kumar.Module5Day33_Hashing1;

import java.util.HashMap;

public class Demo {

	static int sumOfModuloPairs(int[] arr) {
        final int MOD = 1_000_000_007;  // Large modulo value to prevent overflow
        long sum = 0;

        // Frequency map to count occurrences of each element in the array
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int modValue = arr[i] % arr[j];
                sum = (sum + modValue) % MOD;
            }
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15};  // Example array
        System.out.println(sumOfModuloPairs(arr));  // Output the result
    }
}
