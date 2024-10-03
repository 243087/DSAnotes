package com.rahul.kumar.Module5Day35_Sorting1_CountAndMergerSort;


// Given an a[n], calculate number of pairs[ i , j ], such that i<j && a[ i ] > a[ j ], i and j are index of array.
public class Program5_GivenArrayCalculatePairsIandJsuchThatIlessJAndArrayOfIGreaterThanJOptimised {

	   static  int count = 0;
		static void mergeSort(int []arr, int low, int high) {
			if(low == high)
				 return;
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
		static void merge(int []arr,int low,int mid,int high) {
			int arrRange = high - low + 1;
			int [] mergeArr = new int [arrRange];
			
			int a = low;
			int b = mid+1;
			int c = 0;
			while(a<=mid && b<=high) {
				if(arr[a]<=arr[b]) {
					mergeArr[c] = arr[a];
					c++;
					a++;
				}
				else {
					mergeArr[c] = arr[b];
					c++;
					b++;
					count += (mid-a+1);
				}
			}
			while(a<=mid) {
				mergeArr[c] = arr[a];
				c++;                                                 //              TC = O[NlogN]            SC = O[N]
				a++;
			}
			while(b<=high) {
				mergeArr[c] = arr[b];
				c++;
				b++;
			}
	// till above point our mergeArr is sorted but we need our original array itself to be sorted, so will copy from mergeArr to original array arr.

			int m = low;
			for(int i=0;i<mergeArr.length;i++) {
				arr[m] = mergeArr[i];
				m++;
			}
		}

	public static void main(String[] args) {
		int []arr = {5,3,1,4,2};
		mergeSort(arr,0,arr.length-1);
		System.out.println(count);
	}
}
