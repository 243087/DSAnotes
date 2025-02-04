package com.rahul.kumar.Module8_Day65_Graph1;

public class Pair {

	int node;
	int weight;
	
	Pair(int node,int weight){
		this.node = node;
		this.weight = weight;
	}
	@Override
    public String toString() {
        return "(" + node + ", " + weight + ")";
    }
}
