package com.rahul.kumar.Module8_Day66_Graph2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
// Problem :
// You are given a 2D matrix A of size NXM representing the map, where each cell is marked with either a 0 or a 1. 
// Here, a 0 denotes a locality, and a 1 signifies a warehouse. The objective is to calculate a new 2D matrix of the same dimensions 
// as A. In this new matrix, the value of each cell will represent the minimum distance to the nearest warehouse. For the purpose of 
// distance calculation, you are allowed to move to any of the eight adjacent cells directly surrounding a given cell.
public class Program3_FlipKart_DeliveryOptimisation {

	static int [][] calculateDistances(int [][]arr){
		int row = arr.length;
		int col = arr[0].length;
		
		int [][]disMatrix = new int[row][col];
		Queue<FlipPair> queue = new LinkedList<>();
		
		int []rowDir = {-1, -1, -1, 0, 1, 1, 1, 0};
		int []colDir = {-1, 0, 1, 1, 1, 0, -1, -1};
		
		// add all warehouses to the queue
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				if(arr[r][c]==1) {
					queue.add(new FlipPair(r,c));
				}
				else
					disMatrix[r][c] = -1; // Mark unvisited localities
			}
		}
		
		while(!queue.isEmpty()) {
			FlipPair p = queue.remove();
			int r = p.r;
			int c = p.c;
			
			for(int i=0;i<=7;i++) {
				int newRow = rowDir[i] + r;
				int newCol = colDir[i] + c;
				if((newRow>=0 && newRow<row) && (newCol>=0 && newCol<col) && (disMatrix[newRow][newCol]==-1)) {
					 // Update distance
						disMatrix[newRow][newCol] = disMatrix[r][c]+1;
				     	queue.add(new FlipPair(newRow, newCol));
				}
			}
		}
		return disMatrix;
	}
	public static void main(String[] args) {
		int[][] A = {{0, 0, 0, 0, 1, 0, 0, 1, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 1, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 1}};
		
		int[][] distances = calculateDistances(A);
		for (int[] row : distances) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
	}
}
