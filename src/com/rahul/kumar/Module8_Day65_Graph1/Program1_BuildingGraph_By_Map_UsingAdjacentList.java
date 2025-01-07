package com.rahul.kumar.Module8_Day65_Graph1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program1_BuildingGraph_By_Map_UsingAdjacentList {

	static void buildGraph(int v,int e,int [][]edges) {
		 Map<Integer, List<Integer>> graphs = new HashMap<>();
		
		// Initialize the adjacency list
        for (int i = 0; i <= v; i++) { 
            graphs.put(i,new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int m = edges[i][0];                                     //        TC = O[v+e]         SC = O[v+e]
            int n = edges[i][1];

            graphs.get(m).add(n);
            graphs.get(n).add(m); // Since this is an undirected graph
        }
        
        for (int i = 0; i <= v; i++) {
            System.out.println("Vertex " + i + ": " + graphs.get(i));
        }
	}
	public static void main(String[] args) {
		int  v = 6;
		int  e = 8;
		int [][]edges = {{1,3},{1,2},{2,5},{5,6},{4,6},{3,4},{2,4},{3,5}};
		
		buildGraph(v,e,edges);
	}
}
