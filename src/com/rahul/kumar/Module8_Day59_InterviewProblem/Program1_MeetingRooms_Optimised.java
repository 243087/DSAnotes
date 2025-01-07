package com.rahul.kumar.Module8_Day59_InterviewProblem;

public class Program1_MeetingRooms_Optimised {

	static int meetingRoom(int [][]arr) {
		int maxTime =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i][1]>maxTime)
				maxTime = arr[i][1];
		}
		int []time = new int[maxTime+1];              //   this has TC = O[maxTime]
		
		for(int i=0;i<arr.length;i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			time[start] += 1;                        //     this for loop has TC = O[N]
			time[end] -= 1;
		}
		for(int i=1;i<=maxTime;i++) {                 //     this prefix sum calculation has also   TC = O[maxTime]
			time[i] += time[i-1];
		}
		int maxRoom = 0;
		for(int i=0;i<time.length;i++) {
			if(time[i]>maxRoom)
				maxRoom = time[i];
		}
		return maxRoom;                             //        TC = O[N+maxTime]        SC = O[maxTime]
	}
	public static void main(String[] args) {
		int [][]arr = {{0,30},{5,10},{15,20}};
		System.out.println(meetingRoom(arr));
	}
}
