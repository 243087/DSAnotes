package com.rahul.kumar.Module7Day52_LinkedList_SortingAndDetectingLoops;

public class Program3_MergeSortLinkedList {

	static Node1 sortLinkedList(Node1 head1) {
		if(head1==null || head1.next==null)     //  hear head.next==null is must bcoz suppose if head has only one element then that 
			return head1;                      //   LinkedList is always sorted, so just return the head.
		
		Node1 middle = Program1_FindTheMiddleOfTheLinkedListBy1Pass.findMiddle(head1);
		Node1 head2 = middle.next;
		middle.next = null;
		
		head1 = sortLinkedList(head1);
		head2 = sortLinkedList(head2);                 //     TC = O[NlogN]              SC = O[logN]
		
		return Program2_MergeTwoSortedLinkedListOptimisedWay.mergeLL(head1, head2);
	}
	public static void main(String[] args) {
		Node1 head = new Node1(10);
		head.next = new Node1(3);
		head.next.next = new Node1(7);
		head.next.next.next = new Node1(9);
		head.next.next.next.next = new Node1(5);
		head.next.next.next.next.next = new Node1(4);
		head.next.next.next.next.next.next = new Node1(11);
		
		Node1 result = sortLinkedList(head);

		Node1 temp = result;
		while (temp != null) {
			System.out.print(temp.value + "-->");
			temp = temp.next;
		}
	}
}
