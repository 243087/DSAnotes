package com.rahul.kumar.Module6Day40_LinkedList;

import java.util.HashMap;


public class Program6_DeepCopyOfNormalLinkedListUsingSinglePointer {

	static Node deepCopyOfList(Node head) {
		if (head == null) {
            return null; // If the list is empty, return null
        }
		Node temp = head;
		HashMap<Node,Node> hm = new HashMap<>();
		
		// this while loop will create all the new node but mapping of node with each other not happen here
		while(temp!=null) {
			Node newTemp = new Node(temp.value);
			hm.put(temp,newTemp);
			temp = temp.next;
		}
		// this while loop will map all the node with each other
		temp = head;
		while(temp!=null) {
			Node nTemp = hm.get(temp);
			Node nNext = hm.get(temp.next);
			nTemp.next = nNext;
			temp = temp.next;
		}
		return hm.get(head);
	}
	
	static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println();                                       //                 TC = O[N]            SC= O[N]
	}
	public static void main(String[] args) {
	       Node head = new Node(23);
	       head.next = new Node(14);
	       head.next.next = new Node(27);
	       head.next.next.next = new Node(9);
	       head.next.next.next.next = new Node(8);
	       head.next.next.next.next.next = new Node(3);
	       

	       Node element = deepCopyOfList(head);
	       printList(element);
	}
}
