package com.rahul.kumar.Module7Day52_LinkedList_SortingAndDetectingLoops;

public class Program1_FindTheMiddleOfTheLinkedListBy1Pass {

	static Node1 findMiddle(Node1 head) {
		if(head==null)
			return null;
		Node1 slow = head;
		Node1 fast = head;
		
		while(fast.next!=null && fast.next.next!=null) {           // here fast.next is for the odd no of elements and fast.next.next 
			slow = slow.next;                                      // is for the even no of elements
			fast = fast.next.next;
		}
		return slow;                                          //    TC = O[N]            SC = O[1]
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
