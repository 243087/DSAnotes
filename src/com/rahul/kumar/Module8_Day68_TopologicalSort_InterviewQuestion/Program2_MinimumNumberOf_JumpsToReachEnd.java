package com.rahul.kumar.Module8_Day68_TopologicalSort_InterviewQuestion;

import java.util.LinkedList;
import java.util.Queue;

//<Question> : You are given a 0-indexed array of integers arr of length n. You are initially positioned at arr[0]. Each element 
//             arr[i] represents the maximum length of a forward jump from index i. In other words, if you are at arr[i], you can 
//             jump to any arr[i + j] where: 0 <= j <= arr[i] and i + j < n
//         Return the minimum number of jumps to reach arr[n - 1].
public class Program2_MinimumNumberOf_JumpsToReachEnd {

	static int minJumps(int []arr) {
		if(arr.length==1)
			  return 0;
		
		Queue<Pair> queue = new LinkedList<>();             //           TC = O[V+E]
		queue.add(new Pair(0,0));                           //                  | |
		boolean []visited = new boolean[arr.length+1];      //                 N  N^2
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			Pair p = queue.remove();
			int jump = p.jump;
			int index = p.index;
			
			if(index==arr.length-1)
				return jump;
			
			// below neighbouring index will go from (i+1) to (i+arr[i]) and 
//suppose my array first element = 1000 and array size is 4, so till last we can't we right for that reason we are using Min			
			for(int i=index+1;i<=Math.min(index+arr[index],arr.length-1);i++) {
				if(visited[i]==false) {
					visited[i] = true;
					queue.add(new Pair(jump+1,i));
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {2,3,1,1,4};
		System.out.println(minJumps(arr));
	}
}
