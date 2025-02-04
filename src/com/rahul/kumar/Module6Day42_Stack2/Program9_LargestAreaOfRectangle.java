package com.rahul.kumar.Module6Day42_Stack2;

//<Question> : Find the largest area of rectangle ( formed by continuous bars ) in histogram.
public class Program9_LargestAreaOfRectangle {

	static int maxArea(int []arr) {
		int area = 0;
		for(int l=0;l<arr.length;l++) {
			for(int r=l;r<arr.length;r++) {
				int height = Integer.MAX_VALUE;
				for(int i=l;i<=r;i++) {
					height = Math.min(height,arr[i]);
				}
				int width = r-l+1;
				area = Math.max(area,height*width);            //       TC = O[N^3]         SC = O[1]
			}
		}
		return area;
	}
	public static void main(String[] args) {
		int []arr = {8,6,2,5,6,5,7,4};
		System.out.println(maxArea(arr));
	}
}
