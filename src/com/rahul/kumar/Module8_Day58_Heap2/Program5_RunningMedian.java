package com.rahul.kumar.Module8_Day58_Heap2;

import java.util.ArrayList;
import java.util.Collections;

// Given an infinite stream of integers. Find the median of current set of elements.
public class Program5_RunningMedian {

    static double addAndFindMedian(int num) {
        ArrayList<Integer> stream = new ArrayList<>();
       
        stream.add(num);                              // Add the number to the stream
        Collections.sort(stream);                     // Sort the stream
        int size = stream.size();                     // Find the median
        
        if (size % 2 == 1) 
            return stream.get(size / 2);              // Odd size, median is the middle element
        else 
            return (stream.get(size / 2 - 1) + stream.get(size / 2)) / 2.0;    // Even size, median is the average of the two middle elements
    }
	 public static void main(String[] args) {
                                                                  //             TC = O[NlogN]    SC = O[N]
	        int[] inputStream = {8, 3, 5, 10, 2, 4};
	        for (int i=0;i<inputStream.length;i++) {
	            double median = addAndFindMedian(inputStream[i]);
	            System.out.println("After adding " + inputStream[i] + ", Median is: " + median);
	        }
	    }
}
