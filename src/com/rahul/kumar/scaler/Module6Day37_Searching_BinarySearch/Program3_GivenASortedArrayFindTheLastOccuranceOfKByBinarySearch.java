package com.rahul.kumar.scaler.Module6Day37_Searching_BinarySearch;

public class Program3_GivenASortedArrayFindTheLastOccuranceOfKByBinarySearch {

	static int lastOccurance(int []arr,int num) {
		int l = 0;
		int r = arr.length;
		int ans = -1;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(num == arr[mid]) {
				ans = mid;
				l = mid + 1;
			}
			else if(num > arr[mid])
				l = mid+1;
			else
				r = mid-1;
		}
		return ans;                                                 //        TC = O[logN]          SC = O[1]
	}
	public static void main(String[] args) {
		int []arr =  {-5,-5,-3,0,0,1,5,5,5,5,5,8,10,10,15};
		int num = 5;
		System.out.println(lastOccurance(arr,num));
	}
}
