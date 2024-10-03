package com.rahul.kumar.scaler.Module6Day41_Stack1;


public class Program1_ImplementationOfAllStackMethodUsingArray {

	static int arrSize = 5;
	static int []arr = new int[arrSize];
	static int top = -1;
	static void push(int x) {
		if(top==arrSize-1) {
			System.out.println("Stack overFlow can't add "+x);
			return;
		}
		top = top+1;
		arr[top] = x;
	}
	static int pop() {
		if(isEmpty()) {
			System.out.println("Stack under flow");
			System.exit(1);
		}
		int throwEle = arr[top];
		top = top - 1;
		return throwEle;
	}
	static int peek() {
		if(isEmpty()) {
			System.out.println("Stack doesnot have any element");
			System.exit(1);
		}
		return arr[top];
	}
	static boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		int resultpeek = peek();
		int resultPop = pop();
		boolean resultEmpty = isEmpty();
		System.out.println("Peeked element is "+resultpeek);
		System.out.println("Popped element is "+resultPop);
		System.out.println("isEmpty check "+resultEmpty);
		
	}
}
