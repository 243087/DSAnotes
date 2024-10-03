package com.rahul.kumar.Module6Day40_LinkedList;

public class Program5_ReverseTheLinkedList {

	static Node reverseList(Node head) {
		Node pre = null;
		Node curr = head;
		while(curr!=null) {
			Node next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		return pre;
	}
	static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println();                                              //              TC = O[N]           SC= O[1]
	}
	public static void main(String[] args) {
	       Node head = new Node(23);
	       head.next = new Node(14);
	       head.next.next = new Node(27);
	       head.next.next.next = new Node(9);
	       head.next.next.next.next = new Node(8);
	       head.next.next.next.next.next = new Node(3);

	       Node element = reverseList(head);
	       printList(element);
	}
}
