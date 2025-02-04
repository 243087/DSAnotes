package com.rahul.kumar.Module6Day43_Queue;

import java.util.Stack;

public class Program1_ImplementationOfAllQueueMethodUsingStack {

	 static Stack<Integer> st1 = new Stack<>();
	 static Stack<Integer> st2 = new Stack<>();
	 
	 static void enqueue(int x) {
	        st2.push(x);
	 }
	 static boolean isEmpty() {
	        return st1.isEmpty() && st2.isEmpty();
	 }
	 static int dequeue() {
	        if (st1.isEmpty()) {
	            move();
	        }
	        if (st1.isEmpty()) {
	            System.out.println("Queue is empty");
	            return -1; // Or throw an exception
	        }
	        return st1.pop();
	 }
	 static void move() {                           //  this method will move all the element of stack2 and push to stack1
	        while (!st2.isEmpty()) {
	            int x = st2.pop();
	            st1.push(x);
	        }
	 }
	 static int front() {
	        if (st1.isEmpty()) {
	            move();
	        }
	        if (st1.isEmpty()) {
	            System.out.println("Queue is empty");
	            return -1; // Or throw an exception
	        }
	        return st1.peek();
	 }
	public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        System.out.println("Front element is: " + front()); 
        System.out.println("Dequeued element is: " + dequeue());
        System.out.println("Dequeued element is: " + dequeue()); 
        System.out.println("Queue is empty: " + isEmpty());

	}
}
