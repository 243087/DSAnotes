package com.rahul.kumar.Module7Day52_LinkedList_SortingAndDetectingLoops;

public class Program4_GivenLinkedListCheckIfThereIsAloopOptimisedWay {

	static boolean checkLoop(Node1 head) {
		Node1 slow = head;
		Node1 fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;                                       //          TC = O[N]           SC = O[1]
	}
	public static void main(String[] args) {

		Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(4);
        head.next.next.next = new Node1(9);
        head.next.next.next.next = new Node1(8);
        head.next.next.next.next.next = new Node1(16);
        head.next.next.next.next.next.next = new Node1(25);
        head.next.next.next.next.next.next.next = new Node1(30);
        
        head.next.next.next.next.next.next.next.next = new Node1(17);
        head.next.next.next.next.next.next.next.next.next = new Node1(500);
        head.next.next.next.next.next.next.next.next.next.next = new Node1(98);
        head.next.next.next.next.next.next.next.next.next.next.next = new Node1(48);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new Node1(100);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next = new Node1(200);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new Node1(7);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new Node1(300);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new Node1(400);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new Node1(27);
        
        // Creating the loop (node 27 points back to node 17 to create a cycle)
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = head.next.next.next.next.next.next.next.next;
        
        Boolean result = checkLoop(head);
        if(result)
        	System.out.println("Loop is there");
        else
        	System.out.println("Loop is not there");
        
	
	}
}
