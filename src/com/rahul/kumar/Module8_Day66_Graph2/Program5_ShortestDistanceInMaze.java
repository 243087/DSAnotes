package com.rahul.kumar.Module8_Day66_Graph2;

import java.util.LinkedList;
import java.util.Queue;

// asked in Google
public class Program5_ShortestDistanceInMaze {

	public static int shortestDistance(int[][] A, int[] startPos, int[] endPos) {
		int row = A.length;
		int col = A[0].length;
		                                                         //         TC = O[R*C(R+C)]          SC = O[R*C]
		int [][]dist = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				dist[i][j] = Integer.MAX_VALUE;
			}
		}
		int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
		int sr = startPos[0];
		int sc = startPos[1];
		int er = endPos[0];
		int ec = endPos[1];
		
		dist[sr][sc] = 0;
		Queue<FlipPair> queue = new LinkedList<>();
        queue.add(new FlipPair(sr, sc));
        
        while(!queue.isEmpty()) {
        	FlipPair p = queue.remove();
        	int curRow = p.r;
        	int curCol = p.c;
        	
        	// Explore all four directions
        	for(int i=0;i<directions.length;i++) {
        		int newRow = curRow;
                int newCol = curCol;
                int count = 0;
                
                // Move in the current direction until hitting a wall or boundary
                while (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && A[newRow][newCol] == 0) {
                    newRow += directions[i][0];
                    newCol += directions[i][1];
                    count++;
                }
             // Step back to the last valid position
                newRow -= directions[i][0];
                newCol -= directions[i][1];
                count--;
                
                // Update distance if a shorter path is found
                if (dist[curRow][curCol] + count < dist[newRow][newCol]) {
                    dist[newRow][newCol] = dist[curRow][curCol] + count;
                    queue.add(new FlipPair(newRow, newCol));
                }
        	}
        }
     // Return the shortest distance to the end point or -1 if unreachable
        if (dist[endPos[0]][endPos[1]] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[endPos[0]][endPos[1]];
        }
	}
	 public static void main(String[] args) {
	        int[][] maze = {
	            {0, 0, 1, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 1, 0},
	            {1, 1, 0, 1, 1},
	            {0, 0, 0, 0, 0}
	        };
	        int[] R = {0, 4}; // Start position
	        int[] C = {4, 4}; // End position
	        System.out.println(shortestDistance(maze, R, C));
	    }
}
