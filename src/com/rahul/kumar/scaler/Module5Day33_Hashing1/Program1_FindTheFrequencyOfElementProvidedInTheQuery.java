package com.rahul.kumar.scaler.Module5Day33_Hashing1;


//Given N elements & Q queries. Find the frequency of elements provided in the query.
public class Program1_FindTheFrequencyOfElementProvidedInTheQuery {

	static void countFrequency(int []arr,int []query) {
		for(int i=0;i<query.length;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(query[i]==arr[j]) {
					count++;
				}
			}                                                        //             TC = O[N^2]           SC = O[1]
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		int []arr = {2,6,3,8,2,8,2,3,8,10,6};
		int []query = {2,8,3,5};
		
		countFrequency(arr,query);
	}
}
