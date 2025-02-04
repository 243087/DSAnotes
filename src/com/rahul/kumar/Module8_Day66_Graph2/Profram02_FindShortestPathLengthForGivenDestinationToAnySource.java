package com.rahul.kumar.Module8_Day66_Graph2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Profram02_FindShortestPathLengthForGivenDestinationToAnySource {

	static void traversal(int v, int e, int [][]edges, int []source, int destination) {
		Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[v+1];
        
        for(int i=0;i<=v;i++) {
        	graph.put(i,new ArrayList<>());
        }
        for(int i=0;i<e;i++) {
        	int m = edges[i][0];
        	int n = edges[i][1];
        	
        	graph.get(m).add(n);
        	graph.get(n).add(m);
        }
        int result = bfs(graph,visited,source,destination);
        System.out.println("Shortest path length: "+result);
	}
	static int bfs(Map<Integer, List<Integer>> graph,boolean[] visited,int []source, int destination) {
		Queue<Pair1> queue = new LinkedList<>();
		for(int i=0;i<source.length;i++) {
			queue.add(new Pair1(0,source[i]));
			visited[source[i]] = true;
		}
		while(!queue.isEmpty()) {
			Pair1 p = queue.remove();
			int level = p.level;
			int node = p.node;
			
			if(node==destination)
				return level;
			
			for(int i=0;i<graph.get(node).size();i++) {
				int neighbour = graph.get(node).get(i);
				if(visited[neighbour]==false) {
					visited[neighbour]=true;
					queue.add(new Pair1(level+1,neighbour));
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
        int V = 8;
        int E = 6;
        int[][] edges = {{0, 1}, {1, 2}, {1, 4}, {2, 3}, {5, 6}, {6, 7}};
        int[] sources = {0, 5};                       // Multisource nodes
        int destination = 3;                          // Given destination

        traversal(V, E, edges, sources, destination);
    }
}
