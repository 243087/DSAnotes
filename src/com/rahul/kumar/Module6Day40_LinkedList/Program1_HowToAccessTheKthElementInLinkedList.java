package com.rahul.kumar.Module6Day40_LinkedList;

//   How to access the element at kth index in a linked-list
public class Program1_HowToAccessTheKthElementInLinkedList {
	static int kthElement(Node head,int k) {
		if(head == null)
			return -1;
		Node temp = head;
		for(int i=1;i<=k;i++) {
			temp = temp.next;
			if(temp==null)
				return -1;                       // Return -1 if k is out of bounds
		}
		return temp.value;                                  //                   TC = O[K]         SC=O[1]
	}

    public static void main(String[] args) {
       Node head = new Node(23);
       head.next = new Node(14);
       head.next.next = new Node(27);
       head.next.next.next = new Node(9);
       head.next.next.next.next = new Node(8);
       head.next.next.next.next.next = new Node(3);
       
       int k = 8;
       int element = kthElement(head,k);
       System.out.println("Element at index "+k+" is "+element);
    }
}
