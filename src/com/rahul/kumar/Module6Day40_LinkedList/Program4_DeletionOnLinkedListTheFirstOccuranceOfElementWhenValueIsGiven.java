package com.rahul.kumar.Module6Day40_LinkedList;


// Delete the first occurrence of value X in the given lined-list. If element is not present,leave as is.
public class Program4_DeletionOnLinkedListTheFirstOccuranceOfElementWhenValueIsGiven {

	static Node deleteElement(Node head,int delValue) {
		if(head==null)
			return null;
		if(head.value == delValue)    // This is for when  we have to delete the 1st element itself
			return head.next;
		
		Node temp = head;
		while(temp.next!=null) {
			if(temp.next.value==delValue) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
		}
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

	       int delValue = 27;
	       Node element = deleteElement(head,delValue);
	       printList(element);
	}
}
