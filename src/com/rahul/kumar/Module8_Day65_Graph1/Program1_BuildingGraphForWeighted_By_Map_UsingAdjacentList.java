package com.rahul.kumar.Module8_Day65_Graph1;

import java.util.ArrayList;
import java.util.HashMap;

public class Program1_BuildingGraphForWeighted_By_Map_UsingAdjacentList {

	static void buildWeightedGraph(int v, int e, int [][]edges) {
		HashMap<Integer,ArrayList<Pair>> graph = new HashMap<>();
		
		for(int i=0;i<=v;i++) {
			graph.put(i,new ArrayList<>());
		}
		for(int i=0;i<e;i++) {
			int mV = edges[i][0];
			int mE = edges[i][1];
			int weight = edges[i][2];
			
			graph.get(mV).add(new Pair(mE,weight));
			graph.get(mE).add(new Pair(mV,weight));
		}
		for(int i=0;i<=v;i++) {
			System.out.print("Vertex " + i + ": ");
			 for (Pair neighbor : graph.get(i)) {
	                System.out.print(neighbor + " ");
	         }
	        System.out.println();
		}
	}
	public static void main(String[] args) {
		 int v = 5; // Number of vertices
	     int e = 6; // Number of edges
	     int[][] edges = {
	                      {1, 2, 5}, 
	                      {2, 5, 6}, 
	                      {1, 3, 7}, 
	                      {3, 4, 9}, 
	                      {2, 4, 8}, 
	                      {4, 5, 4}
	                                };
	      buildWeightedGraph(v, e, edges);
	}
}
