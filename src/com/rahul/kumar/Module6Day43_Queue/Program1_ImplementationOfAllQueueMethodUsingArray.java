package com.rahul.kumar.Module6Day43_Queue;

public class Program1_ImplementationOfAllQueueMethodUsingArray {

	static int arrSize = 5;
    static int[] arr = new int[arrSize];
    static int front = 0;
    static int rear = -1;
	
	static void enqueue(int x) {                         //           TC = O[1]       SC = O[1]  for all method
		if(rear==arrSize-1) {
			System.out.println("Queue Overflow, can't add " + x);
			return;
		}
		rear++;
        arr[rear] = x;
	}
	static int dequeue() {
		if(isEmpty()) {
			 System.out.println("Queue Underflow, no elements to remove");
	         System.exit(1);
		}
		int value = arr[front];
		front++;
		if(front>rear) {    // Reset the queue if it becomes empty
			front = 0;
			rear = -1;
		}
		return value;
	}
	static boolean isEmpty() {
		return rear<front;
	}
	static int front() {
		if(isEmpty()) {
			System.out.println("Queue is empty, no front element");
            System.exit(1);
		}
		return arr[front];
	}
	static int size() {
		if(isEmpty())
			return 0;
		return rear - front+1;
	}
	public static void main(String[] args) {
		enqueue(10);
		enqueue(20);
		enqueue(30);
		System.out.println("Front element is: " + front());
        System.out.println("Dequeued element is: " + dequeue());
        System.out.println("Queue size is: " + size());
        System.out.println("Is queue empty? " + isEmpty());
	}
}
