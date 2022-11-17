package dataStructures.queues;

import dataStructures.nodes.SimpleNode;

public class LinkedQueue {

	public SimpleNode front;
	public SimpleNode back;

	public int size;

	/**
	 * Empty LinkedQueue constructor. This class acts as an infinite queue, so there is no need for a maximum capacity.
	 */
	public LinkedQueue()
	{
		front=null;
		back=null;
		size = 0;
	}

	/**
	 * Method to insert new data in the queue.
	 * @param data The data to be inserted.
	 */
	public void push(Object data)
	{
		SimpleNode a=new SimpleNode(data);
		if(isEmpty()) front = a;
		else back.next = a;
		back=a;
		size++;
	}

	/**
	 * Method that checks whether the queue is empty.
	 * @return True if the queue is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Method that extracts and returns the front data in the queue.
	 * @return The data in the front of the queue, null if the queue is empty.
	 */
	public Object poll()
	{
		if(isEmpty()) {
			System.err.println("Error: the queue is empty, poll() returned null");
			return null;
		}
		else
		{
			Object aux = front.data;
			front = front.next;
			size--;
			return aux;
		}
	}
	
	/**
	 * Method that returns the front data in the queue without extracting it from the queue.
	 * @return
	 */
	public Object peek()
	{
		if(isEmpty()) {
			System.err.println("Error: the queue is empty, peek() returned null");
			return null;
		}
		else return front.data;
	}

	/**
	 * Method that clears the queue, removing all elements
	 */
	public void clear()
	{
		front=null;
		size = 0;
	}

	

}
