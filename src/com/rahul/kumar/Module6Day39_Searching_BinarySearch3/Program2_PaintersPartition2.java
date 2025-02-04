package com.rahul.kumar.Module6Day39_Searching_BinarySearch3;

//       :--> Given N boards with length of each board
//         a) A painter takes 1 unit of time to paint 1 unit of length.
//         b) A board can only be painted by 1 painter.
//         c) A painter can only paint boards placed next to each other ( i.e continuous segment ).

//<Question> : Find minimum time to paint all boards if P painters are available..
//     Means : Painters is given and we need to find the time.
public class Program2_PaintersPartition2 {

	static int noOfTimeRequired(int []arr, int painters) {
		int maxEle = arr[0];
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
			if(arr[i]>maxEle) {
				maxEle = arr[i];
			}
		}
		int ans = -1;
		int l = maxEle;
		int r = total;
		while(l<=r) {                                  //        TC = O[Nlog[total-maxEle]]       SC = O[1]
			int mid = l+(r-l)/2;
			
			int noOfPainters = Program1_PaintersPartition1.noOfPaintersRequired(arr,mid);
			if(noOfPainters<=painters) {
				ans = mid;
				r = mid-1;
			}
			else
				l = mid+1;
		}
		return ans;
	}
	public static void main(String[] args) {
		int []arr = {5,3,6,1,9};
		int painters = 3;
		System.out.println(noOfTimeRequired(arr,painters));
	}
}
