package beans.stacks;

public class ArrayStack {

	int peak;
	public int size;
	public int capacity;
	Object[] stack;

	/**
	 * Empty ArrayStack constructor
	 * 
	 * @param capacity Maximum allowed elements in the ArrayStack
	 */
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.peak = -1;
		this.stack = new Object[capacity];
	}

	/**
	 * Method that checks if the ArrayStack is empty
	 * 
	 * @return true if the ArrayStack is empty, false if it contains elements
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Method that checks if the ArrayStack is full
	 * 
	 * @return true if the stack is full, false if there are free spots
	 */
	public boolean isFull() {
		return size == capacity;
	}

	/**
	 * Method that clears the ArrayStack
	 */
	public void clear() {
		peak = -1;
		size = 0;
	}

	/**
	 * Method used to retrieve the peak element of the ArrayStack without removing
	 * it
	 * 
	 * @return El objeto en la cima de la PilaArray, null si est� vac�a
	 */
	public Object peek() {
		if (!isEmpty()) {
			return stack[peak];
		} else {
			System.err.println("Error: the stack is empty");
			return null;
		}
	}

	/**
	 * Method that inserts a new object in the ArrayStack if the ArrayStack is not
	 * full
	 * 
	 * @param data the new object that must be inserted in the ArrayStack
	 */
	public void push(Object data) {
		if (!isFull()) {
			peak++;
			size++;
			stack[peak] = data;
		} else {
			System.err.println("Error: cannot insert, the stack is full");
		}
	}

	/**
	 * Method that extracts the peak element of the ArrayStack, removing it from the
	 * ArrayStack
	 * 
	 * @return The peak object of the ArrayStack, null if the ArrayStack is empty
	 */
	public Object pop() {
		if (!isEmpty()) {
			Object data = stack[peak];
			peak--;
			size--;
			return data;
		} else {
			System.err.println("Error: the stack is empty");
			return null;
		}
	}

}
