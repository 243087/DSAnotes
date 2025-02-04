package com.rahul.kumar.Module8_Day68_TopologicalSort_InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GivenGraphFindTheInDegreeOfEveryVertixes {

	 public static int[] calculateIndegree(int V, HashMap<Integer, List<Integer>> graph) {
	        int[] indegree = new int[V];

	        for (int u : graph.keySet()) {
	            for (int v : graph.get(u)) { // u -> v
	                indegree[v] += 1;
	            }
	        }

	        return indegree;
	    }
	 public static void main(String[] args) {
	        // Input example
	        int V = 7; // Number of nodes
	        HashMap<Integer, List<Integer>> graph = new HashMap<>();
	        graph.put(0, Arrays.asList(1, 3));
	        graph.put(1, Arrays.asList(2, 3));
	        graph.put(2, Arrays.asList(4, 5));
	        graph.put(3, Arrays.asList(4));
	        graph.put(4, Arrays.asList(5));
	        graph.put(5, Arrays.asList());
	        graph.put(6, Arrays.asList(3, 5));

	        int[] indegree = calculateIndegree(V, graph);
	        System.out.println("Indegree of each node: " + Arrays.toString(indegree));
	    }
}
