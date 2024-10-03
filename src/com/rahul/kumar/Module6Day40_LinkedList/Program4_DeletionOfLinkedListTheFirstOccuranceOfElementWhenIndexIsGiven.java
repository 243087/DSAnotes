package com.rahul.kumar.Module6Day40_LinkedList;

public class Program4_DeletionOfLinkedListTheFirstOccuranceOfElementWhenIndexIsGiven {

	static Node deleteElement(Node head,int delIndex) {
		if(head==null)
			return null;
		if(delIndex == 0)    // This is for when  we have to delete the 1st element itself
			return head.next;
		
		Node temp = head;
		for(int i=1;i<delIndex;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
	}
	 public static void printList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.value + " ");
	            temp = temp.next;
	        }
	        System.out.println();                                   //          TC = O[N]                SC= O[1]
	    }
	public static void main(String[] args) {
	       Node head = new Node(23);
	       head.next = new Node(14);
	       head.next.next = new Node(27);
	       head.next.next.next = new Node(9);
	       head.next.next.next.next = new Node(8);
	       head.next.next.next.next.next = new Node(3);

	       int delIndex = 0;
	       Node element = deleteElement(head,delIndex);
	       printList(element);
	}
}
