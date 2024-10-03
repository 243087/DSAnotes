package com.rahul.kumar.scaler.Module6Day40_LinkedList;

//Insertion in linked-list at Kth index
public class Program3_InsertionInLinkedListAtKthIndex {

	static Node insertElement(Node head,int value,int index) {
		// if LinkedList is empty
		Node newNode = new Node(value);
		if(head == null)
			return newNode;
		if(index==0) {
			newNode.next = head;
			return newNode;
		}
		Node temp = head;
		for(int i=1;i<index && temp.next != null;i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
		return head;
	}
	 public static void printList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.value + " ");
	            temp = temp.next;
	        }
	        System.out.println();                                   //          TC = O[K]                SC= O[1]
	    }
	public static void main(String[] args) {
	       Node head = new Node(23);
	       head.next = new Node(14);
	       head.next.next = new Node(27);
	       head.next.next.next = new Node(9);
	       head.next.next.next.next = new Node(8);
	       head.next.next.next.next.next = new Node(3);
	       
	       int index = 9;
	       int value = 87;
	       Node element = insertElement(head,value,index);
	       printList(element);
	}
}
