package com.rahul.kumar.Module8_Day60_Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Demo {

	static int maxProfit(int []exp,int []pro) {
		int [][]AB = new int[exp.length][2];
		for(int i=0;i<AB.length;i++) {
			AB[i][0] = exp[i];
			AB[i][1] = exp[i];
		}
		
		Arrays.sort(AB,new Comparator<int []>() {
			@Override
			public int compare(int[]a,int[]b) {
				return a[0] - b[0];
			}
		});
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
