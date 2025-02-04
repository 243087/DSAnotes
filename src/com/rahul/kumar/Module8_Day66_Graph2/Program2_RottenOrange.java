package com.rahul.kumar.Module8_Day66_Graph2;

import java.util.LinkedList;
import java.util.Queue;

public class Program2_RottenOrange {

	static int rotOranges(int [][]arr) {
		int row = arr.length;
		int col = arr[0].length;
		
		Queue<RottenPair> queue = new LinkedList<>(); 
		int time = -1;
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				// add all the rotten Oranges
				if(arr[r][c]==2)
					queue.add(new RottenPair(0,r,c));
			}
		}
		int [] rowDir = {0,-1,1,0};                                   //       TC = O[row*col]     SC = O[row*col]
		int [] colDir = {-1,0,0,1};
		
		while(!queue.isEmpty()) {
			RottenPair p =queue.remove();
			time = p.time;
			
			// go to all neighbour cells
			for(int i=0;i<=3;i++) {
				int newRow = rowDir[i] + p.r;
				int newCol = colDir[i] + p.c;
				
				if((newRow>=0 && newRow<row) && (newCol>=0 && newCol<col) && arr[newRow][newCol]==1) {
					arr[newRow][newCol]=2; // visited
					queue.add(new RottenPair(p.time+1,newRow,newCol));
				}
			}
		}
		// this code is for --> if it is not possible to become all the oranges rotten then we can just check any array has 1 
		for(int r=0;r<row;r++) {     //  value and if we find the then we can directly return -1
			for(int c=0;c<col;c++) {
				if(arr[r][c]==1)
					return -1;
			}
		}
		return time;
	}
	public static void main(String[] args) {
		int[][] arr = { { 2, 1, 0, 2, 1 },{ 1, 0, 1, 2, 1 },{ 1, 0, 0, 2, 1 } };

        System.out.println("Max time incurred: " + rotOranges(arr));
	}
}
