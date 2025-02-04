package com.rahul.kumar.Module8_Day66_Graph2;

// Asked in LinkedIn
import java.util.LinkedList;
import java.util.Queue;

// Number of Islands
// You are given a 2D grid of '1's (land) and 'O's (water). Your task is to determine the number of islands in the grid. An island is 
// formed by connecting adjacent(horizontally or vertically) land cells. Diagonal connections are not considered.Given here if the 
// cell values has 1 then there is land and 0 if it is water, and you may assume all four edges of the grid are all surrounded by water.
public class Program4_NumberOfIsland {

	static int noOfIsland(int [][]arr) {
		int row = arr.length;
		int col = arr[0].length;
		
		int island = 0;
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				if(arr[r][c]==1) {
					bfs(r,c,row,col,arr);
					island++;
				}
			}
		}
		return island;                                                  //      TC = O[R*C]     SC = O[R*C]
	}
	static void bfs(int r, int c,int rowLength,int colLength,int [][]arr) {
		Queue<FlipPair> queue = new LinkedList<>();
		queue.add(new FlipPair(r,c));
		
		int [] rowDir = {0,-1,1,0};                                  
		int [] colDir = {-1,0,0,1};
		
		while(!queue.isEmpty()) {
			FlipPair p = queue.remove();
			
			for(int i=0;i<=3;i++) {
				int newRow = rowDir[i] + p.r;
				int newCol = colDir[i] + p.c;
				
				if((newRow>=0 && newRow<rowLength) && (newCol>=0 && newCol<colLength) && (arr[newRow][newCol]==1)) {
					arr[newRow][newCol]=2;
					queue.add(new FlipPair(newRow,newCol));
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int [][]arr = {{1,1,0,0,1},{0,1,0,1,0},{1,0,0,1,1},{1,1,0,0,0},{1,0,1,1,1}};
		
		System.out.println(noOfIsland(arr));
	}
}
