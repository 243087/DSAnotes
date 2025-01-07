package com.rahul.kumar.Module7Day53_LinkedListProblemAndDoublyLL;

import com.rahul.kumar.Module7Day52_LinkedList_SortingAndDetectingLoops.Program1_FindTheMiddleOfTheLinkedListBy1Pass;

public class Program2_CheckIfTheLinkedListIsPalindromeOrNot_Optimised {

	static boolean checkPalindrome(Node2 head) {
		if(head==null || head.next==null)           // if LL is null or having 1 element it is always palindrome
			 return true;
		
		Node2 slow = head;
		Node2 fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;                                     
			fast = fast.next.next;
		}
		Node2 middle = slow;
		Node2 head2 = middle.next;
		middle.next = null;
		
		Node2 revHead = reverse(head2);
		
		Node2 firHalf = head;
		Node2 sndHalf = revHead;
		
		return compare(firHalf,sndHalf);                                 //      TC = O[N]          SC = O[1]
		
	}
	static Node2 reverse(Node2 head) {
		Node2 prev = null;
		Node2 curr = head;
		while(curr!=null){
			Node2 temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	static boolean compare(Node2 head1, Node2 head2) {
		if(head1==null && head2==null)
			return true;
		while(head1!=null && head2!=null) {
			if(head1.value!=head2.value)
				return false;
			
			head1 = head1.next;
			head2 = head2.next;
		}
		return true;
	}
	public static void main(String[] args) {
		Node2 head = new Node2(2);
		head.next = new Node2(5);
		head.next.next = new Node2(8);
		head.next.next.next = new Node2(8);
		head.next.next.next.next = new Node2(5);
		head.next.next.next.next.next = new Node2(2);
		
		System.out.println(checkPalindrome(head));
	}
}
