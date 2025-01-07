package com.rahul.kumar.Module7Day52_LinkedList_SortingAndDetectingLoops;

public class Program2_MergeTwoSortedLinkedListOptimisedWay {

	static Node1 mergeLL(Node1 head1, Node1 head2) {
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		Node1 head = null;
		Node1 t1 = head1;
		Node1 t2 = head2;
		
		if(t1.value<=t2.value) {
			head = t1;
			t1 = t1.next;
		}
		else {
			head = t2;
			t2 = t2.next;
		}
		Node1 temp = head;
		while(t1!=null && t2!=null) {
			if(t1.value<=t2.value) {
				temp.next = t1;
				t1 = t1.next;
			}
			else {
				temp.next = t2;
				t2 = t2.next;
			}
			temp = temp.next;
		}
		if(t1!=null)
			temp.next = t1;
		else
			temp.next = t2;
		
		return head;                                       //               TC O[N+M]            SC = O[1]
	}
	public static void main(String[] args) {
		Node1 head = new Node1(2);
		head.next = new Node1(6);
		head.next.next = new Node1(10);
		head.next.next.next = new Node1(14);
		head.next.next.next.next = new Node1(19);
		
		Node1 head1 = new Node1(3);
		head1.next = new Node1(5);
		head1.next.next = new Node1(9);
		head1.next.next.next = new Node1(11);
		
		Node1 result = mergeLL(head,head1);
		
		Node1 temp = result;
		while(temp!=null) {
			System.out.print(temp.value+"-->");
			temp = temp.next;
		}
		
	}
}
