package com.rahul.kumar.Module8_Day68_TopologicalSort_InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Given N courses with pre-requisite of every course. Check if it is possible to finish all the courses.
public class Program1_FindThe_TopologicalOrder_KahnsAlgorithm {

	static boolean findTopologicalOrder(HashMap<Integer,List<Integer>> graph, int N){
		int []inDegree = new int[N];
		
		for(int u: graph.keySet()) {
			for(int v: graph.get(u)) {
				inDegree[v] += 1;
			}
		}
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<N;i++) {
        	if(inDegree[i]==0)                                  //         TC = O[V+E]       SC = O[V]
        		queue.add(i);
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while(!queue.isEmpty()) {
        	int node = queue.remove();
        	topo.add(node);
        	
        	for(int i=0;i<graph.get(node).size();i++) {
        		int nei = graph.get(node).get(i);
        		inDegree[nei] -= 1;
        		if(inDegree[nei]==0)
        			queue.add(nei);
        	}
        }
        if(topo.size() == N)
        	 return true;
        return false;
	}
	public static void main(String[] args) {
        int n = 7; // Number of vertices
        
        // Adjacency List
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(4));
        graph.put(4, Arrays.asList(5));
        graph.put(5, Arrays.asList());
        graph.put(6, Arrays.asList(3, 5));

        System.out.println(findTopologicalOrder(graph, n));
    }
}
