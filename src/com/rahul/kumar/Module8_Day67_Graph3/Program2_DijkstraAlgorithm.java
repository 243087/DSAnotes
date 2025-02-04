package com.rahul.kumar.Module8_Day67_Graph3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Program2_DijkstraAlgorithm {

	static int []dijkstra(HashMap<Integer,List<Pair>> graph, int N, int source){
		PriorityQueue<Pair> heap = new PriorityQueue<>(new Comparator<Pair>() {
			@Override
			public int compare(Pair a,Pair b) {                  // Creation of heap like that bcoz of we need to create min Heap
				return a.weight - b.weight;
			}
		});
		int []distanceArray = new int[N+1];
		boolean visited[] = new boolean[N+1];
		for(int i=0;i<distanceArray.length;i++) {
			distanceArray[i] = Integer.MAX_VALUE;             //        TC = O[V+ElogE]            SC = O[E]
		}
		distanceArray[source] = 0;
		heap.add(new Pair(0,source));
		
		while(!heap.isEmpty()) {
			Pair p = heap.remove();
			int weight = p.weight;
			int node = p.node;
			
			if(visited[node])
				continue;
			visited[node] = true;
			
			 // Traverse neighbors of the current node
			for(int i=0;i<graph.get(node).size();i++) {
				Pair neighbour = graph.get(node).get(i);
				int newDistance = distanceArray[node] + neighbour.weight;
				
				if(newDistance<distanceArray[neighbour.node]) {
					distanceArray[neighbour.node] = newDistance;
					heap.add(new Pair(newDistance,neighbour.node));
				}
			}		
		}
		return distanceArray;
	}
	public static void main(String[] args) {
		 HashMap<Integer, List<Pair>> graph = new HashMap<>();
	        int N = 5; 
	        
	        for (int i = 1; i <= N; i++) {                   // Build the graph (adjacency list)
	            graph.put(i, new ArrayList<>());
	        }

	        graph.get(1).add(new Pair(2, 2));
	        graph.get(1).add(new Pair(3, 3));
	        graph.get(2).add(new Pair(2, 1));
	        graph.get(2).add(new Pair(4, 4));
	        graph.get(3).add(new Pair(3, 1));
	        graph.get(3).add(new Pair(5, 5));
	        graph.get(4).add(new Pair(4, 2));
	        graph.get(4).add(new Pair(6, 5));
	        graph.get(5).add(new Pair(5, 3));
	        graph.get(5).add(new Pair(6, 4));

	        // Run Dijkstra's algorithm from source node 1
	        int source = 1;
	        int[] result = dijkstra(graph,N,source);

	        // Print shortest distances from source to all nodes
	        System.out.println("Shortest distances from node " + source + ":");
	        for (int i = 1; i <= N; i++) {
	            System.out.println("Node " + i + ": " + (result[i] == Integer.MAX_VALUE ? "Infinity" : result[i]));
	        }
	    }
}
