package com.rahul.kumar.Module6Day43_Queue;

public class Program1_ImplementationOfAllQueueMethodUsingLinkedList {

	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = next;
		}
	}
	static Node front = null;
	static Node rear = null;
	
	static void enqueue(int x) {
		 Node newNode = new Node(x);
		 if (rear == null) {                                         // If the queue is empty
	            front = rear = newNode;
	            System.out.println(x + " enqueued to queue");
	            return;
	        }
		 rear.next = newNode;
	     rear = newNode;
	}
	static int dequeue() {
        if (front == null) {                                 // If the queue is empty
            System.out.println("Queue underflow");
            System.exit(1); 
        }

        int dequeuedElement = front.data;
        front = front.next; 

        if (front == null) { // If the queue becomes empty, reset rear
            rear = null;
        }
        return dequeuedElement;
    }
	static int front() {
        if (front == null) {
            System.out.println("Queue is empty");
            System.exit(1); // Exit the program if the queue is empty
        }
        return front.data;
    }
	static boolean isEmpty() {
        return front == null;
    }
	public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        int resultFront = front();
        int resultDequeue = dequeue();
        boolean resultEmpty = isEmpty();

        System.out.println("Front element is " + resultFront);
        System.out.println("Dequeued element is " + resultDequeue);
        System.out.println("isEmpty check: " + resultEmpty);
    }
}
