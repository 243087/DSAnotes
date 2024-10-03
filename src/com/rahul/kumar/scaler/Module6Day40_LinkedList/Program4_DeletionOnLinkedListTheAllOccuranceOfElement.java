package com.rahul.kumar.scaler.Module6Day40_LinkedList;


//Problem: You are given a linked list A of N nodes where each node represents a specific model type of a OnePlus mobile phone in the manufacturing line.
//Each node contains an integer representing the model number of the phone. You will also be given an integer B which represents the modelnumber of
//the defective phone that needs to be removed.Your goal is to remove all nodes (phones) from the linked list that have the model number B and return
//the modified linked list representing the updated manufacturing line.
public class Program4_DeletionOnLinkedListTheAllOccuranceOfElement {

	static Node deleteElement(Node head,int value) {
		if(head==null)
			return null;
		while(head.value == value && head!=null) {  // this while basically checks if the first element is delvalue then move to 
			head = head.next;                       // next element, Suppose all the elements are delVaue then this loop will remove
		}                                           // all the elements thats why again we are checking null head after this loop
		if (head == null) {
            return null;
        }
		Node temp = head;
		while(temp.next!=null) {
			if(temp.next.value==value) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
		return head;
	}
	static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
	       Node head = new Node(10);
	       head.next = new Node(1);
	       head.next.next = new Node(2);
	       head.next.next.next = new Node(1);
	       head.next.next.next.next = new Node(2);
	       head.next.next.next.next.next = new Node(10);

	       int delValue = 2;
	       Node element = deleteElement(head,delValue);
	       printList(element);
	}
}
