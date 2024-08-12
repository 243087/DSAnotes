package com.rahul.kumar.scaler.Module5Day27_BitManipulation1;

public class Program4_IRCTCScenario {

	static void countFreTrain(int []arr) {
	   int maxDays = -1;
	   int maxTrainIndex = -1;
	   for(int i=0;i<arr.length;i++) {
		   int count =0;
		   while(arr[i]>0) {
			   if((arr[i]&1)==1)
				   count++;
			   arr[i] = arr[i]>>1;
		   }
		   if (count > maxDays) {
               maxDays = count;
               maxTrainIndex = i;
           }
	   }
	   System.out.println(maxTrainIndex);
	}
	public static void main(String[] args) {
		int []arr = {170,234,255};
		countFreTrain(arr);
	}
}

//170 --->010101010
//234 --->011101010
//255 --->011111111