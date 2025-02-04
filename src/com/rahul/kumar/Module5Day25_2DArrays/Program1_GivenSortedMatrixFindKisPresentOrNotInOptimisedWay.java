package com.rahul.kumar.Module5Day25_2DArrays;

import java.util.Scanner;
//  <Question> : Given a now wise and cal wise sorted matrix.Find out whether k is present or not
public class Program1_GivenSortedMatrixFindKisPresentOrNotInOptimisedWay {

	static boolean findElement(int [][]arr,int k) {
		int row = arr.length;
		int col = arr[0].length;
		int r=0;
		int c= col-1;
		
		while(r<row && c>=0) {
			if(arr[r][c] ==k)
				return true;
			if(k>arr[r][c])
				r +=1;
			else
				c -=1;                                                  //        TC = O[N]        SC = O[1]
		}
		return false;
	}
	public static void main(String[] args) {
		int [][]arr = {{-5,-2,1,13},
				       {-4,0,3,14},
				       {-3,2,6,18}};
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean ans = findElement(arr,num);
		System.out.println(ans);
	}
}
