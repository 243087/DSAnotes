package com.rahul.kumar.Module8_Day65_Graph1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program2_TraversalOfGraph_DFS_DepthFirstTraversal {

	static Map<Integer,List<Integer>> graph = new HashMap<>();
	static boolean []visited;
	
	static void traversal(int V, int E, int [][]edges) {
		for(int i=0;i<=V;i++) {
			graph.put(i,new ArrayList<>());
		}
		for(int i=0;i<E;i++) {
			int m = edges[i][0];
			int n = edges[i][1];
			
			graph.get(m).add(n);
			graph.get(n).add(m);
		}
		
		visited = new boolean[V+1];
		for(int i=0;i<=V;i++) {
			if(visited[i]==false)
				dfs(i);
		}                                                   //                         TC = O[V+E]          SC = O[V+E]
	}
	static void dfs(int node) {
		visited[node] = true;
		for(int j=0;j<graph.get(node).size();j++) {
			int k = graph.get(node).get(j);
			if(!visited[k])
				dfs(k);
		}
		
	}
	public static void main(String[] args) {
		int V = 8;
		int E = 6;
		int [][]edges = {{1,2},{1,3},{3,4},{3,5},{6,7},{7,8}};
		
		traversal(V,E,edges);
	}
}
