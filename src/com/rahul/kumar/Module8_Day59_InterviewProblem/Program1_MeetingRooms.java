package com.rahul.kumar.Module8_Day59_InterviewProblem;

// < Question > : You are given an array of meeting time intervals where each interval is represented as [start, end] (start time is 
//                less than the end time). Your task is to find the minimum number of conference rooms required to schedule all meetings
//                without overlap.

public class Program1_MeetingRooms {

	static int meetingRoom(int [][]arr) {

		int maxElement = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i][1]>maxElement)
				maxElement = arr[i][1];
		}
		int []time = new int[maxElement+1];
		
		for(int i=0;i<arr.length;i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			for(int j=start;j<end;j++) {
				time[j] += 1;
			}
		}
		int maxRoom = 0;
		for(int i=0;i<time.length;i++) {
			if(time[i]>maxRoom)
				maxRoom = time[i];
		}
		return maxRoom;                                  //            TC = O[N*maxTime]     SC = O[maxTime]   
	}
	public static void main(String[] args) {
		int [][]arr = {{0,30},{5,10},{15,20}};
		System.out.println(meetingRoom(arr));
	}
}
