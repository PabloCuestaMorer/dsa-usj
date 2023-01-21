package dataStructures.queues;

public class PriorityQueue {
	
	public LinkedQueue[] prioQueue;
	
	/**
	 * Constructor that creates an empty PriorityQueue
	 * @param priorities The number of available priorities in the queue
	 */
	public PriorityQueue(int priorities) {
		prioQueue = new LinkedQueue[priorities];
		for(int i = 0; i < priorities; i++) {
			prioQueue[i] = new LinkedQueue();
		}
	}
	
	/**
	 * Method that checks whether the priority queue is empty (that is, if all of its queues are empty)
	 * @return True if the priority queue is empty, false otherwise
	 */
	public boolean isEmpty() {
		
		for(LinkedQueue queue : prioQueue) {
			if(!queue.isEmpty()) return false;
		}
		
		return true;
		
	}
	
	/**
	 * Method that clears the priority queue (by clearing all of its queues)
	 */
	public void clear() {
		for(LinkedQueue queue : prioQueue) {
			queue.clear();
		}
	}
	
	/**
	 * Method that calculates the size of the priority queue 
	 * @return The size of the priority queue (combined sum of the size of all of its queues)
	 */
	public int size() {
		int size = 0;
		for(LinkedQueue queue : prioQueue) {
			size += queue.size;
		}
		return size;
	}
	
	/**
	 * Inserts an element to the priority queue according to its priority
	 * @param data The element that must be inserted
	 * @param priority The priority of the element
	 */
	public void push(Object data, int priority) {
		prioQueue[priority].push(data);
	}
	
	/**
	 * Method that retrieves and removes the front element in the priority queue
	 * @return The front element if the priority queue is not empty, null otherwise
	 */
	public Object poll() {

		// Traverse all the queues, and if there is at least one that is not empty, return the first element (with removal)
		for(LinkedQueue queue : prioQueue)
				if(!queue.isEmpty()) return queue.poll();
		
		// If all the queues are empty we will arrive at this code
		System.err.println("Error: the priority queue is empty, poll() returned null");
		return null;
	}
	
	/**
	 * Method that retrieves the front element in the priority queue without removing it
	 * @return The front element if the priority queue is not empty, null otherwise
	 */
	public Object peek() {

		// Traverse all the queues, and if there is at least one that is not empty, return the first element
		for(LinkedQueue queue : prioQueue)
				if(!queue.isEmpty()) return queue.peek();
		
		// If all the queues are empty we will arrive at this code
		System.err.println("Error: the priority queue is empty, poll() returned null");
		return null;
	}

}