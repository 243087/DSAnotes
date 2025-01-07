package com.rahul.kumar.Module8_Day61_DP3_Knapsack;

import java.util.Arrays;

class Item {
    int happiness;
    int weight;
    double ratio;

    Item(int happiness, int weight, double ratio) {
        this.happiness = happiness;
        this.weight = weight;
        this.ratio = ratio;
    }
}
public class Program2_FractionalKnapsack_Cakes {

	static int findMaxHappiness(int []happiness, int []weight, int quantity) {
		int n = happiness.length;
	       Item [] items = new Item[n];

	       for(int i=0;i<n;i++){
	           items[i] = new Item(happiness[i],weight[i],(double)happiness[i]/weight[i]);
	       }
	       Arrays.sort(items,(it1, it2) -> Double.compare(it2.ratio, it1.ratio));
	       double ans = 0;

	       for(int i=0;i<n;i++){
	           if(items[i].weight<=quantity){
	        	   quantity = quantity - items[i].weight;
	               ans += items[i].happiness;
	           }
	           else{
	               ans = ans + quantity*items[i].ratio;
	               break;
	           }
	       }
	       return (int)ans;
	}
	public static void main(String[] args) {
		int []happiness = {3,8,10,2,5};
		int []weight    = {10,4,20,8,15};
		
		int quantity = 40;
		System.out.println(findMaxHappiness(happiness,weight,quantity));
	}
}
