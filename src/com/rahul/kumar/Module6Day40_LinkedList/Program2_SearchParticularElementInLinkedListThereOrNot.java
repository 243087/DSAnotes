package com.rahul.kumar.Module6Day40_LinkedList;


public class Program2_SearchParticularElementInLinkedListThereOrNot {

	static boolean checkElement(Node head, int target) {
		if(head == null)
			return false;
		
		Node temp = head;
		while(temp!=null) {
			if(temp.value==target)
				return true;
			
			temp = temp.next;
		}
		return false;                                    //               TC = O[N]        SC = O[1]
		
	}
	public static void main(String[] args) {
	       Node head = new Node(23);
	       head.next = new Node(14);
	       head.next.next = new Node(27); 
	       head.next.next.next = new Node(9);
	       head.next.next.next.next = new Node(8);
	       head.next.next.next.next.next = new Node(3);
	       
	       int target = 8;
	       boolean element = checkElement(head,target);
	       System.out.println(element);
	}
}
