package com.dsa.stackandqueue;


/**
 * Queue implementation in Java: Approach and problems
 * 
 * Approach:
 * >trying to implement the queue using a linear array
 * >i have defined three instance variables :
 * >>the first variable is of type array
 * >>the second variable is FRONT, of type int, this variable stores the index of the array from which only removal will happen
 * >>the third variable is REAR, of type int, this variable stores the index of the array to which items will be added
 * >a constructor is defined that will initialize a array of the input size, and FRONT and REAR will be initialized to 0, as array is empty at first
 * 
 * >enQueue method: to add methods to the queue, i have defined a method enQueue, that accepts a number as parameter and adds the number to the arr[REAR]
 * >after adding the item, the REAR is incremented to allow adding the next item in the next index of the queue
 * 
 * >printQueue method: to print all the items in the queue from FRONT to the array length.
 * 
 * Problems:
 * >once the queue is full, attempt to add item, throws a exception(AIOOB)
 * Solution:
 * >to resolve this issue, REAR % SIZE is assigned to the REAR and then the REAR variable is incremented, which resets REAR to 0 once REAR reaches array bounds.  
 * 
 * */
public class ANewQueue {
	
	int[] arr;
	int FRONT;	//items are removed from here
	int REAR;	//items are added here
	int SIZE;
	
	public ANewQueue(int size) {
		this.arr = new int[size];
		this.FRONT = 0;
		this.REAR = 0;
		this.SIZE = size;
	}
	
	public void enQueue(int item) {
		arr[REAR] = item;
		REAR++;
		REAR = REAR % SIZE;
	}
	
	public int deQueue() {
		FRONT++;
		FRONT = FRONT % SIZE;
		return arr[FRONT];
	}
	
	public void printQueue() {
		
			System.out.println("FRONT:" + FRONT + " : " + "REAR:"+REAR);
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
//			System.out.println();
//			for(int i=FRONT; i<=REAR; i++) {
//				System.out.print(arr[i] + " ");
//			}
	}
	
	
	public static void main(String[] args) {
		
		ANewQueue q = new ANewQueue(5);
		
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.deQueue();
		q.deQueue();
		q.enQueue(40);
		q.enQueue(50);
//		
//		q.enQueue(60); //
//		q.enQueue(70);
//		
//		q.deQueue();
//		q.deQueue();
//		
		q.printQueue();
//		System.out.println();
	}
	
}
