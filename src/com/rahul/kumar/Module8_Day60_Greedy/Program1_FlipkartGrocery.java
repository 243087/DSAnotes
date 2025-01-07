package com.rahul.kumar.Module8_Day60_Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// Hint : Sort on expiry time and maintain the k largest profit
public class Program1_FlipkartGrocery {

	static int maxProfit(int []A,int []B) {
		int [][]AB = new int[A.length][2];
		for(int i=0;i<A.length;i++) {
			AB[i][0] = A[i];
			AB[i][1] = B[i];
		}
		
		Arrays.sort(AB, new Comparator<int []>() {
			@Override
			public int compare(int []a,int []b) {
				return a[0] - b[0];
			}                                                //        TC = O[NlogN]         SC = O[N]
		});
		for(int i=0;i<AB.length;i++) {
			System.out.println("....."+Arrays.toString(AB[i]));
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int time = 0;
		
		for(int i=0;i<AB.length;i++) {
			int expiration = AB[i][0];
			int profit = AB[i][1];
			 time++;
			
			pq.add(profit);
			if(time>expiration) {
				pq.poll();
				time--;
			}
		}
		int profit = 0;
		while(!pq.isEmpty()) {
			profit += pq.poll();
		}
		return profit;
	}
	public static void main(String[] args) {
		int []expiryTime = {3,1,3,2,5};
		int []profit = {6,5,3,1,9};
		System.out.println(maxProfit(expiryTime,profit));
	}
}
