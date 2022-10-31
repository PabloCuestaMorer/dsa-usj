package beans.stacks;

import beans.nodes.Node;

public class LinkedStack {

	public Node peak;
	public int size;

	/**
	 * Constructor of an empty stack
	 */
	public LinkedStack() {
		peak = null;
		size = 0;
	}

	/**
	 * Method that checks whether the stack is empty
	 * 
	 * @return True if the stack is empty, false otherwise
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Method that inserts a new element on the stack
	 * 
	 * @param data The data that must be inserted
	 */
	public void push(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(peak);
		peak = newNode;
		size++;
	}

	/**
	 * Method that extracts the peak element of the stack, removing it from the
	 * stack
	 * 
	 * @return The element on top of the stack, null if the stack is empty
	 */
	public Object pop() {
		if (isEmpty()) {
			System.err.println("Error: the stack is empty, pop() returned null");
			return null;
		} else {
			Object aux = peak.getData();
			peak = peak.getNext();
			size--;
			return aux;
		}
	}

	/**
	 * Method that extracts the peak element of the stack without removing it from
	 * the stack
	 * 
	 * @return the peak data
	 */
	public Object peek() {
		if (isEmpty()) {
			System.err.println("Error: the stack is empty, peek() returned null");
			return null;
		} else
			return peak.getData();
	}

	/**
	 * Method that clears the stack
	 */
	public void clear() {
		peak = null;
		size = 0;
	}

}
