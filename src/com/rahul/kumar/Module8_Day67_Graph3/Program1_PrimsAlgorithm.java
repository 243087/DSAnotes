package com.rahul.kumar.Module8_Day67_Graph3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Program1_PrimsAlgorithm {

	static int prims(HashMap<Integer,List<Pair>> graph, int N) {
		PriorityQueue<Pair> heap = new PriorityQueue<>(new Comparator<Pair>() {
			@Override
			public int compare(Pair a,Pair b) {                  // Creation of heap like that bcoz of we need to create min Heap
				return a.weight - b.weight;
			}
		});
		
		for(int i=0;i<graph.get(1).size();i++) {                  //          TC = O[V+ElogE]        SC = O[V+E]
			Pair p = graph.get(1).get(i);
			heap.add(new Pair(p.weight,p.node));
		}
		
		boolean[] visited = new boolean[N+1];
		visited[1] = true;
		int mst = 0; 
		
		while(!heap.isEmpty()) {
			Pair p = heap.remove();
			int node = p.node;
			int weight = p.weight;
			
			if(visited[node]== true)
				 continue;
			visited[node] = true;
			mst += weight;
			
			for(int i=0;i<graph.get(node).size();i++) {
				Pair np = graph.get(node).get(i);
				if(!visited[np.node])
					heap.add(np);
			}
		}
		return mst;
	}
	 public static void main(String[] args) {
	        HashMap<Integer, List<Pair>> graph = new HashMap<>();
	        int N = 5;

	        for (int i = 1; i <= N; i++) {
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

	        int result = prims(graph, N);
	        System.out.println("Minimum Spanning Tree Weight: " + result);
	    }
}
