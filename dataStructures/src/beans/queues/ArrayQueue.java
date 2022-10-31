package beans.queues;

public class ArrayQueue {
	
	Object[] queue;
	public int size;
	public int capacity;
	int front;
	int back;
	
	/**
	 * Empty ArrayQueue constructor. This class acts as a buffer, taking a limited number of elements to be processed.
	 * @param capacity The maximum amount of elements to be processed by the queue
	 */
	public ArrayQueue(int capacity) {
		queue = new Object[capacity];
		size = 0;
		this.capacity = capacity;
		front = -1;
		back = -1;
	}
	
	/**
	 * Method that checks if the ArrayQueue is empty
	 * @return true if the ArrayQueue is empty, false if it has elements
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * Method that checks if the ArrayQueue is full
	 * @return true if the ArrayQueue is full, false if it has remaining space
	 */
	public boolean isFull() {
		return back == capacity-1;
	}
	
	/**
	 * Method that clears the ArrayQueue
	 */
	public void clear() {
		size = 0;
		front = -1;
		back = -1;
	}
	
	/**
	 * Method that retrieves the first element without removing it from the ArrayQueue
	 * @return the front object, null if the ArrayQueue is empty
	 */
	public Object peek() {
		if(isEmpty()) {
			System.err.println("Error: no pending elements in the buffer, peek() returned null");
			return null;
		} else return queue[front];
	}
	
	/**
	 * Method that retrieves the first element in the ArrayQueue, removing it from the ArrayQueue
	 * This method resets the ArrayQueue if there are no pending elements to be processed in the ArrayQueue after the extraction
	 * @return the front object, null if the ArrayQueue is empty
	 */
	public Object poll() {
		if(isEmpty()) {
			System.err.println("Error: no pending elements in the buffer, poll() returned null");
			return null;
		}
		else {
			// Get front element
			Object aux = queue[front];
			// Move indexes
			front++;
			size--;
			// Reset the queue if queue is empty after extraction
			if(isEmpty()) clear();
			// Return the element 
			return aux;
		}
	}

	/**
	 * Method that inserts a new object in the ArrayQueue if the ArrayQueue has free spaces at its tail
	 * @param data the object that must be inserted in the ArrayQueue
	 */
	public void push(Object data) {
		if(isEmpty()) {
			front++;
			back++;
			size++;
			queue[back] = data;
		} else if(isFull()) System.err.println("Error: no free spaces, process the buffer first");
		else {
			back++;
			size++;
			queue[back] = data;
		}
	}

}
