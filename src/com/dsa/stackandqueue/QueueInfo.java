package com.dsa.stackandqueue;

public class QueueInfo {
	
	
	/**
	 * Quesues:  (source: Data Structures: Seymour Lipschutz(page: 5.59))
	 * 
	 * A queue is a Linear List in which items may be added only at one end and items may 
	 * be removed only at the other end. The name "queue" likely comes from the everyday use
	 * of the term. Consider a queue of people waiting at a bus stop. Each new person who 
	 * comes takes his or her place at the end of the line, and when the bus comes, the 
	 * people at the front of the line board first. Clearly the  first person in the line 
	 * is the first person to leave. Thus queues are also called first-in first-out(FIFO) lists.
	 * 
	 * */
	
	
	/**
	 * Representation of Queues:
	 * 
	 * Queues may be represented in the computer in various ways, usually by means at
	 * one-way lists or linear arrays. Unless otherwise stated or implied, each of our
	 * queues will be maintained by a linear array QUEUE and two pointer variables: FRONT,
	 * containing the location of the front element of the queue; and REAR, containing the
	 * location of the rear element of the queue. The condition FRONT = NULL will indicate
	 * that the queue is empty.
	 * 
	 * 
	 * Whenever an element is deleted from the queue, the value of FRONT is increased by 1;
	 * this can be implemented by the assignment 
	 * 
	 * 			FRONT = FRONT + 1;
	 * 
	 * Whenever an element is added to the queue, the value of the REAR is increased by 1;
	 * this can be implemented by the assignment 
	 * 			
	 * 			REAR = REAR + 1;
	 * 
	 *  
	 * This means that after N insertions, the rear element of the queue will occupy QUEUE[N]
	 * or, in other words; eventually the queue will occupy the last part of the array. This
	 * occurs even though the queue itself may not contain many elements.
	 * 
	 * Suppose we want to insert an element ITEM into a queue at the time the queue does 
	 * occupy the last part of the array, i.e when REAR = N. One way to do this is to simply
	 * move the entire queue to the beginning of the array, changing the FRONT and REAR accor
	 * -dingly, and then inserting ITEM as above. This procedure may be expensive. The procedure
	 *  we adopt is to assume that the array QUEUE is circular, that is, that QUEUE[1] comes
	 *  after QUEUE[N] in the array. With this assumption, we insert ITEM into the queue by 
	 *  assigning ITEM to QUEUE[N] in the array. With this assumption, we insert ITEM into 
	 *  the queue by assigning ITEM to QUEUE[1]. Specifically, instead of increasing REAR to
	 *  N + 1, we reset REAR = 1 and then assign 
	 *  					QUEUE[REAR] = ITEM
	 *  
	 *  Similarly, if FRONT = N and an element of QUEUE is deleted, we reset FRONT = 1 instead
	 *  of increasing FRONT to N + 1.
	 * 
	 * 
	 * 
	 * */
}
