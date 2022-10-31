package beans.queues;

import beans.nodes.Node;

public class DoubleEndedQueue extends LinkedQueue {

	/**
	 * Constructor that creates an empty DoubleEndedQueue The class extends from
	 * LinkedQueue, also allowing to push elements to the front and poll/peek
	 * elements from the back
	 */
	public DoubleEndedQueue() {
		// Calls the parent constructor, since it has to be built exactly in the same
		// way
		super();
	}

	/**
	 * Method that inserts new data at the front of the queue
	 * 
	 * @param data The new data that must be inserted
	 */
	public void pushFront(Object data) {
		Node a = new Node(data);
		if (isEmpty())
			back = a;
		a.setNext(front);
		front = a;
		size++;
	}

	/**
	 * Method that retrieves and removes the tail element of the queue
	 * 
	 * @return The last element of the queue, null if the queue is empty
	 */
	public Object pollEnd() {
		if (isEmpty()) {
			System.err.println("Error: the queue is empty, pollEnd() returned null");
			return null;
		} else {

			Object aux;
			if (front == back)
				aux = poll();
			else {
				// Traverse the queue to get to the prior-to-last element
				Node current = front;
				while (current.getNext() != back)
					current = current.getNext();

				// Get the data at the last element
				aux = back.getData();

				// Remove the last element and update tail element
				current.setNext(null);
				back = current;
			}
			size--;
			return aux;
		}
	}

	/**
	 * Method that retrieves the tail element of the queue without removing it
	 * 
	 * @return The element at the tail of the queue, null if the queue is empty
	 */
	public Object peekEnd() {
		if (isEmpty()) {
			System.err.println("Error: the queue is empty, peek() returned null");
			return null;
		} else {
			return back.getData();
		}

	}

}
