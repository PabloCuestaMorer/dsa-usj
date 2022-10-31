package beans.queues;

import beans.nodes.Node;

public class LinkedQueue {

	public Node front;
	public Node back;

	public int size;

	/**
	 * Empty LinkedQueue constructor. This class acts as an infinite queue, so there
	 * is no need for a maximum capacity.
	 */
	public LinkedQueue() {
		front = null;
		back = null;
		size = 0;
	}

	/**
	 * Method to insert new data in the queue.
	 * 
	 * @param data The data to be inserted.
	 */
	public void push(Object data) {
		Node a = new Node(data);
		if (isEmpty())
			front = a;
		else
			back.setNext(a);;
		back = a;
		size++;
	}

	/**
	 * Method that checks whether the queue is empty.
	 * 
	 * @return True if the queue is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Method that extracts and returns the front data in the queue.
	 * 
	 * @return The data in the front of the queue, null if the queue is empty.
	 */
	public Object poll() {
		if (isEmpty()) {
			System.err.println("Error: the queue is empty, poll() returned null");
			return null;
		} else {
			Object aux = front.getData();
			front = front.getNext();
			size--;
			return aux;
		}
	}

	/**
	 * Method that returns the front data in the queue without extracting it from
	 * the queue.
	 * 
	 * @return
	 */
	public Object peek() {
		if (isEmpty()) {
			System.err.println("Error: the queue is empty, peek() returned null");
			return null;
		} else
			return front.getData();
	}

	/**
	 * Method that clears the queue, removing all elements
	 */
	public void clear() {
		front = null;
		size = 0;
	}

}
