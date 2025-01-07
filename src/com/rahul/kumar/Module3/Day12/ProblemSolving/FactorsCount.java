package com.rahul.kumar.Module3.Day12.ProblemSolving;

import java.util.Scanner;

public class FactorsCount {
	static int countFactor(int num) {
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				 count++;
		}
		return count;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number");
        int num = sc.nextInt();
        System.out.println(countFactor(num));
    }
}
