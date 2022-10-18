package beans.lists;

/**
 * @author pablo
 *
 */
public class Stack {
	private Object[] arr;
	// Top index of the stack
	private int top;
	private int capacity;

	public Stack(int size) {
		arr = new Object[size];
		capacity = size;
		top = -1;
	}

	/**
	 * Add an element on the top of stack.
	 * 
	 * @param x
	 */
	public void add(Object data) {
		if (isFull()) {
			System.err.println("ERROR: The stack is full!");
		}

		// System.out.println("add " + data);
		arr[++top] = data;
	}

	/**
	 * Pop a top element from the stack.
	 * 
	 * @return Object the pop element
	 */
	public Object pop() {
		Object out = null;
		if (isEmpty()) {
			System.err.println("ERROR: The stack is empty!");
			return out;
		} else {
			// System.out.println("Pop: " + peek());
			out = arr[top--];
		}

		return out;
	}

	/**
	 * Check if the stack is empty.
	 * 
	 * @return boolean is empty or not
	 */
	public boolean isEmpty() {
		return top == -1; // or return size() == 0;
	}

	/**
	 * Check if the stack is full.
	 * 
	 * @return boolean is full or not
	 */
	public boolean isFull() {
		return top == capacity - 1;
	}

	/**
	 * Peeks the top element of the stack.
	 * 
	 * @return Object top element
	 */
	public Object peek() {
		Object out = null;
		if (!isEmpty()) {
			out = arr[top];
		}

		return out;
	}

	/**
	 * @return the arr
	 */
	public Object[] getArr() {
		return arr;
	}

	/**
	 * @param arr the arr to set
	 */
	public void setArr(Object[] arr) {
		this.arr = arr;
	}

	/**
	 * @return the top
	 */
	public int getTop() {
		return top;
	}

	/**
	 * @param top the top to set
	 */
	public void setTop(int top) {
		this.top = top;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
