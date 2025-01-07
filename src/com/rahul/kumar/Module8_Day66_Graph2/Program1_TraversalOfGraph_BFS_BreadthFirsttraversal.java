package com.rahul.kumar.Module8_Day66_Graph2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Program1_TraversalOfGraph_BFS_BreadthFirsttraversal {
	
	static void traversal(int V,int E,int [][]edges) {
		Map<Integer,List<Integer>> graph = new HashMap<>();
		boolean []visited = new boolean[V+1];
		for(int i=0;i<=V;i++) {
			graph.put(i,new ArrayList<>());
		}
		for(int i=0;i<E;i++) {
			int m = edges[i][0];
			int n = edges[i][1];
			                                                //                TC = O[V+E]        SC = O[V+E]
			graph.get(m).add(n);
		}
		for(int i=0;i<=V;i++) {
			if(visited[i]==false)
				bfs(i,graph,visited);
		}
	}
	static void bfs(int startNode,Map<Integer,List<Integer>> graph,boolean []visited) {
		Queue<Pair1> queue = new LinkedList<>(); 
		queue.add(new Pair1(0,startNode));
		visited[startNode] = true;
		
		while(!queue.isEmpty()) {
			Pair1 p = queue.remove();
			int level = p.level;
			int node = p.node;
			
			 System.out.println("Node: " + node + ", Level: " + level);
			 
			for(int i=0;i<graph.get(node).size();i++) {
				int neighbour = graph.get(node).get(i);
				if(visited[neighbour]==false) {
					visited[neighbour] = true;
					queue.add(new Pair1(level+1,neighbour));
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int V = 5; 
        int E = 6; 
        int[][] edges = {{0, 1},{0, 2},{1, 2},{1, 3},{2, 4},{3, 4}};
            
        traversal(V,E,edges);
	}
}
