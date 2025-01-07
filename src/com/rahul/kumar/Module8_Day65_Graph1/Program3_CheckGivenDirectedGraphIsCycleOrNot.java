package com.rahul.kumar.Module8_Day65_Graph1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Program3_CheckGivenDirectedGraphIsCycleOrNot {

	static Map<Integer,List<Integer>> graph = new HashMap<>();
	static HashSet<Integer> path = new HashSet<>();
	static boolean []visited;
	static boolean checkCycle(int V,int E,int [][]edges) {
		for(int i=0;i<=V;i++) {
			graph.put(i,new ArrayList<>());
		}
		for(int i=0;i<E;i++) {
			int m = edges[i][0];
			int n = edges[i][1];
			
			graph.get(m).add(n);
		}
		visited = new boolean[V+1];                     //                         TC = O[V+E]          SC = O[V+E]

		for(int i=0;i<=V;i++) {
			if(!visited[i]) {
				if(dfs(i)==true)
					return true;
			}
		}
		return false;
	}
	static boolean dfs(int node) {
		visited[node] = true;
		path.add(node);
		for(int i=0;i<graph.get(node).size();i++) {
			int neighbor = graph.get(node).get(i);
			if(path.contains(neighbor))
				return true;
			if(!visited[neighbor]) {
				if(dfs(neighbor)==true)
					return true;
			}
		}
		path.remove(node);
		return false;
	}
	public static void main(String[] args) {
		int V = 5;
		int E = 5;
		int [][]edges = {{1,2},{2,3},{3,4},{4,2},{5,4}};
		
		System.out.println(checkCycle(V,E,edges));
	}
}
