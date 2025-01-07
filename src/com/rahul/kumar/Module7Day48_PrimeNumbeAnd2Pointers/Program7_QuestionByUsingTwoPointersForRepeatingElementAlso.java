package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

import java.util.Arrays;

// < Question > : Given an integer sorted array A and an integer K. Find any pair[i,j], such that A[ i ] - A[ j ] = K, i != j
public class Program7_QuestionByUsingTwoPointersForRepeatingElementAlso {

	static int countPairs(int []arr, int find) { 
		Arrays.sort(arr);


    int l = 0;
    int r = 1;  // Start with r one step ahead of l
    long count = 0;


    while (r < arr.length) {
        int currentDiff = arr[r] - arr[l];

        if (currentDiff > find) {
            l++;
        } 
        else if (currentDiff < find) {
            r++;
        } else { 
            if (arr[l] == arr[r]) {
                long dupCount = r - l + 1;
                count += (dupCount * (dupCount - 1)) / 2;
                break;
            } else {
                int leftCount = 0;
                int rightCount = 0;

                int x = arr[l];
                int y = arr[r];


                while (l < arr.length && arr[l] == x) {
                    leftCount++;
                    l++;
                }


                while (r < arr.length && arr[r] == y) {
                    rightCount++;
                    r++;
                }

                count += (long) leftCount * rightCount;
            }
        }
    }

    return (int) count;
}
	public static void main(String[] args) {
		int[] arr = {8, 12, 16, 4, 0, 20};
		int find = 4;
		System.out.println(countPairs(arr, find));
	}
}
