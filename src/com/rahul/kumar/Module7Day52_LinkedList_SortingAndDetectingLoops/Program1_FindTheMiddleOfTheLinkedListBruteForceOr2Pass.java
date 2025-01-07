package com.rahul.kumar.Module7Day52_LinkedList_SortingAndDetectingLoops;



public class Program1_FindTheMiddleOfTheLinkedListBruteForceOr2Pass {

	static Node1 findMiddle(Node1 head) {
		if(head==null)
			return null;
		int count = 0;
		Node1 temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		
		int middleIndex = (count-1)/2;
		temp = head;
		for(int i=1;i<=middleIndex;i++) {
			temp = temp.next;
		}
		return temp;                                             //           TC = O[N]         SC = O[1]
	}
	public static void main(String[] args) {
		Node1 head = new Node1(10);
		head.next = new Node1(3);
		head.next.next = new Node1(7);
		head.next.next.next = new Node1(9);
		head.next.next.next.next = new Node1(5);
		head.next.next.next.next.next = new Node1(4);
		head.next.next.next.next.next.next = new Node1(11);
		head.next.next.next.next.next.next.next = new Node1(16);
		
		Node1 result = findMiddle(head);
		System.out.println("Middle node value is : "+ result.value);
		
	}
}
