package com.rahul.kumar.Module7Day52_LinkedList_SortingAndDetectingLoops;

public class Program2_MergeTwoSortedLinkedListBruteForce {

	static Node1 mergeLL(Node1 head, Node1 head1) {
		Node1 dummy = new Node1(-1);
		Node1 temp = dummy;
		
		while(head!=null && head1!=null) {
			if(head.value<=head1.value) {
				temp.next = new Node1(head.value);
				head = head.next;
			}
			else {
				temp.next = new Node1(head1.value);
				head1 = head1.next;
			}
			temp = temp.next;
		}
		while(head!=null) {
			temp.next = new Node1(head.value);
			head = head.next;
			temp = temp.next;
		}
		while(head1!=null) {
			temp.next = new Node1(head1.value);
			head1 = head1.next;
			temp = temp.next;
		}
		return dummy.next;                                     //    TC O[N+M]       SC= O[N+M]
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
