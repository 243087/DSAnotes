package com.rahul.kumar.scaler.Module6Day37_Searching_BinarySearch;


//Given arr[ N ]. Find any one local minima.
//Note: An element which is less than or equals to it's adjacent elements.
public class Program6_GivenAZigZackArrayFindAnyOneLocalMinima {

	static int safeGet(int []arr, int index) {
		if(index>=0 && index<arr.length)
			return arr[index];
		return -Integer.MAX_VALUE;
	}
	static int findMinima(int []arr) {                          
		int l = 0;
		int r = arr.length-1;
		while(l<=r) {
			int mid = l +(r-l)/2;
			if(safeGet(arr,mid) < safeGet(arr,mid-1) && safeGet(arr,mid) < safeGet(arr,mid+1)) { 
				return arr[mid];                                                 
			}                                                                                
			
			if(safeGet(arr,mid) > safeGet(arr,mid-1) && safeGet(arr,mid) < safeGet(arr,mid+1)) {  
				r = mid-1;                                               
			}                                                                 
			else {                                                      
				l = mid+1;                                        
			}                                                          
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {3,8,7,5,4,2,4,5,1};
		System.out.println(findMinima(arr));
	}
}
