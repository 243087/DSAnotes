package com.rahul.kumar.Module8_Day59_InterviewProblem;

public class Triplet implements Comparable<Triplet> {

	int value;
	int arrIndex;
	int valueIndex;
	
	public Triplet(int value,  int arrindex, int valueindex) {
	     this.value = value;
	     this.arrIndex = arrindex;
	     this.valueIndex = valueindex;
	}
	
	@Override
	public int compareTo(Triplet t) {
        return this.value - t.value;            // Min-heap based on value
    }
}
