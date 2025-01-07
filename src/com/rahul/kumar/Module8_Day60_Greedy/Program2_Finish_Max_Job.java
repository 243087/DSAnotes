package com.rahul.kumar.Module8_Day60_Greedy;

import java.util.Arrays;
import java.util.Comparator;

// Given N jobs with their start and end-time. Find the max jobs that can be completed if only one job can be done at a time.

public class Program2_Finish_Max_Job {

	static int maxJob(int []s, int []e) {
		int [][]jobs = new int[s.length][2];
		for(int i=0;i<s.length;i++) {
			jobs[i][0] = s[i];
			jobs[i][1] = e[i];
		}                                                     //Hint:   Sort start and end on the basis of ending time
		Arrays.sort(jobs, new Comparator<int[]>() {
			@Override
			public int compare(int[]a, int[]b) {
				return a[1] - b[1];
			}                                                 //        TC = O[NlogN]      SC = O[N]
		});
		for(int i=0;i<jobs.length;i++) {
			System.out.println("...."+Arrays.toString(jobs[i]));
		}
		int maxJobs = 0;
		int lastEndTime = 0;
		
		for(int i=0;i<jobs.length;i++) {
			if(jobs[i][0]>=lastEndTime) {
				maxJobs++;
				lastEndTime = jobs[i][1];
			}
		}
		return maxJobs;
	}
	public static void main(String[] args) {
		int []startTime = {1,5,8,7,12,13};
		int []endTime = {2,10,10,11,20,19};
		System.out.println(maxJob(startTime,endTime));
	}
}
