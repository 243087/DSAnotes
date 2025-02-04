package com.rahul.kumar.Module6Day39_Searching_BinarySearch3;

//         :--> Given N boards with length of each board
//           a) A painter takes 1 unit of time to paint 1 unit of length.
//           b) A board can only be painted by 1 painter.
//           c) A painter can only paint boards placed next to each other ( i.e continuous segment ).

// <Question> : Find min number of painters required to paint all the boards in T unit of time.If not possible return infinity.
//         Means : Time is given and we need to find the no of painters
public class Program1_PaintersPartition1 {

	static int noOfPaintersRequired(int []arr, int time) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>time) {
				return Integer.MAX_VALUE;
			}
		}
		int area = 0;
		int painters = 1;
		for(int i=0;i<arr.length;i++) {
			int board = arr[i];
			area += board;
			if(area>time) {
				painters += 1;
				area = board;                              //        TC = O[N]      SC = O[1]
			}
		}
		return painters;
	}
	public static void main(String[] args) {
		int []arr = {5,3,6,1,9};
		int time = 20;
		System.out.println(noOfPaintersRequired(arr,time));
	}
}
