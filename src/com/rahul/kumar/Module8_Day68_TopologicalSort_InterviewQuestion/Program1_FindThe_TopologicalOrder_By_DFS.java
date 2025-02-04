package com.rahul.kumar.Module8_Day68_TopologicalSort_InterviewQuestion;

import java.util.*;

public class Program1_FindThe_TopologicalOrder_By_DFS {
  
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static boolean[] visited;
    static ArrayList<Integer> result; // To store topological order
    
    static ArrayList<Integer> topologicalSort(int v, int e, int[][] edges) {
        result = new ArrayList<>();
        
        // Initialize graph
        for (int i = 0; i <= v; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Build graph
        for (int i = 0; i < e; i++) {
            int m = edges[i][0];
            int n = edges[i][1];
            graph.get(m).add(n);
        }

        // Initialize visited array
        visited = new boolean[v + 1];

        // Perform DFS for each unvisited node
        for (int i = 0; i <= v; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }

        // Reverse the result to get correct topological order
        Collections.reverse(result);
        return result;
    }

    static void dfs(int node) {
        visited[node] = true;
        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                dfs(nei);
            }
        }
        result.add(node); // Add node AFTER visiting all children
    }

    public static void main(String[] args) {
        int V = 8;
        int E = 6;
        int[][] edges = {{1, 2}, {1, 3}, {3, 4}, {3, 5}, {6, 7}, {7, 8}};
        
        ArrayList<Integer> sortedOrder = topologicalSort(V, E, edges);
        System.out.println(sortedOrder);
    }
}
