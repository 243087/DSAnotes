package com.rahul.kumar.Module7Day53_LinkedListProblemAndDoublyLL;

import java.util.ArrayList;

public class Program2_CheckIfTheLinkedListIsPalindromeOrNot {

	static boolean checkPalindrome(Node2 head) {
		ArrayList<Integer> al = new ArrayList<>();
		
		Node2 temp = head;
		while(temp!=null) {
			al.add(temp.value);
			temp = temp.next;
		}
		int l = 0;
		int r = al.size()-1;
		while(l<r) {
			if(al.get(l)!=al.get(r))
				return false;
			l++;
			r--;
		}
		return true;                                          //          TC = O[N]          SC = O[N]
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
