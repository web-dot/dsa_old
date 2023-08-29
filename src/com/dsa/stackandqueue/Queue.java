package com.dsa.stackandqueue;

public class Queue {
	int arr[]; 
	int front; 
	int rear; 
	int cap; 
	int n1;
	
	//queue constructor
	public Queue(int n) {
		arr = new int[n];
		cap = n;
		front = 0;
		rear = -1;
		n1 = 0;
	}
	
	//dequeue function for removing the front element
	public void dequeue() {
		
		//check for queue underflow
		if(isEmpty()) {
			System.out.println("No items in the queue, cannot delete");
			System.exit(1);
		}
		
		System.out.println("Deleting " + arr[front]);
		
		front = (front + 1) % cap;
		n1--;
	}
	
	
	//enqueu function for adding an item to the rear
	public void enqueu(int val) {
		
		//check for queue overflow
		if(isFull()) {
			System.out.println("Overflow, cannot add more values");
			System.exit(1);
		}
		
		System.out.println("Adding " + val);
		rear = (rear + 1) % cap;
		arr[rear] = val;
		n1++;
	}
	
	//peek function to return front element of the queue
	public int peek() {
		
		if(isEmpty()) {
			System.out.println("Queue Empty, cannot delete");
			System.exit(1);
		}
		return arr[front];
	}
	
	//returns size of the queue
	public int size() {
		return n1;
	}
	
	//to check if the queue is empty or not
	public boolean isEmpty() {
		return (size()==0);
	}
	
	//to check if the queue is full or not 
	public boolean isFull() {
		return (size() == cap);
	}
	
	public static void main(String[] args) {
		
		Queue q = new Queue(5);
		
		
		q.enqueu(10);
		q.enqueu(20);
		q.enqueu(30);
		
		System.out.println("front element is: " + q.peek());
		q.dequeue();
		System.out.println("front element is: " + q.peek());
		
		System.out.println("queue size is: " + q.size());
		
		q.dequeue();
		q.dequeue();
		
		if(q.isEmpty())
			System.out.println("empty");
		else
			System.out.println("not empty");
		
	}
}
