package com.rahul.kumar.Module8_Day66_Graph2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Demo {

	static int rotOranges(int [][]arr) {
		int row = arr.length;
		int col = arr[0].length;
		Queue<RottenPair> queue = new LinkedList<>();
		int time = -1;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]==2);
				   queue.add(new RottenPair(0,i,j));
					
			}
		}
		int [] rowDir = {0,-1,1,0};                                   //       TC = O[row*col]     SC = O[row*col]
		int [] colDir = {-1,0,0,1};
		
		while(!queue.isEmpty()) {
			RottenPair p = queue.remove();
			time = p.time;
			
			for(int i=0;i<=3;i++) {
				int newRow = rowDir[i] + p.r;
				int newCol = colDir[i] + p.c;
				
				if((newRow>=0 && newRow<row) && (newCol>=0 && newCol<col) && arr[newRow][newCol]==1) {
					arr[newRow][newCol]=2;
					queue.add(new RottenPair(time+1,newRow,newCol));
				}
			}
		}
		for(int r = 0;r<row;r++) {
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
