package com.rahul.kumar.Module6Day41_Stack1;

public class Program2_ImplementationOfAllStackMethodUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the stack
    static Node top = null;

    static void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top; // Point newNode to the current top
        top = newNode; // Update the top to newNode
        System.out.println(x + " pushed to stack");
    }

    // Pop method to remove the top element from the stack
    static int pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            System.exit(1); // Exit the program in case of underflow
        }
        int poppedElement = top.data;
        top = top.next; // Update the top to the next node
        return poppedElement;
    }

    // Peek method to get the top element of the stack
    static int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            System.exit(1); // Exit the program if the stack is empty
        }
        return top.data;
    }

    // Method to check if the stack is empty
    static boolean isEmpty() {
        return top == null;
    }
	 public static void main(String[] args) {
	        push(10);
	        push(20);
	        push(30);
	        push(40);
	        push(50);
	        int resultPeek = peek();
	        int resultPop = pop();
	        boolean resultEmpty = isEmpty();
	        System.out.println("Peeked element is " + resultPeek);
	        System.out.println("Popped element is " + resultPop);
	        System.out.println("isEmpty check: " + resultEmpty);
	    }
}
