package com.rahul.kumar.scaler.Module6Day38_Searching_BinarySearch2;

//Search an element in sorted and rotated array. [ Distinct ]
public class Program1_SearchAnElementInSortedAndRotatedArray {

	static int findElement(int []arr,int k) {
		int l = 0;
		int r = arr.length-1;
		int targetArea = getArea(arr,k);
		while(l<=r) {
			int mid = l + (r-l)/2;
			int midArea = getArea(arr,arr[mid]);
			
			if(arr[mid] == k)
				return mid;
		//  Case 1
			if(midArea == 1 && targetArea == 2)
				l = mid +1;
			else if(midArea == 2 && targetArea == 1)
				r = mid-1;
			else
		//  Normal Binary Search
				if(k>arr[mid])
					l = mid+1;
				else
					r = mid-1;
		}	
		return -1;                                     //               TC = O[logN]     SC = O[1]
	}
	static int getArea(int []arr,int k) {
		if(k>=arr[0])
			 return 1;
		return 2;
	}
	public static void main(String[] args) {
		int []arr = {10,20,30,1,2,3,4,5,6,7,8,9};
		System.out.println(findElement(arr,9));
	}
}
