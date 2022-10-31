package beans.lists;

import beans.nodes.DoubleNode;

/**
 * @author pablo
 *
 */
public class DoubleLinkedList {

	private int size;
	private DoubleNode head;
	private DoubleNode tail;

	public DoubleLinkedList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	/**
	 * Check if the list is empty.
	 * 
	 * @return if the list is empty
	 */
	public boolean isEmpty() {
		return (this.size == 0) ? true : false;
	}

	/**
	 * Empty the list.
	 */
	public void clear() {
		System.out.println("The list was emptied. Total items removed: " + size);
		head = tail = null;
		size = 0;
	}

	/**
	 * Adds a node to the end of the list.
	 * 
	 * @param data
	 */
	public void add(Object data) {
		DoubleNode nodeToInsert = new DoubleNode(data, null, null);
		if (isEmpty()) {
			tail = nodeToInsert;
			head = tail;
		} else {
			nodeToInsert = new DoubleNode(data, null, tail);
			tail.setNext(nodeToInsert);
			tail = nodeToInsert;
		}
		this.size++;
	}

	/**
	 * Push a node to the beginning of the list.
	 * 
	 * @param data
	 */
	public void push(Object data) {
		DoubleNode nodeToInsert = new DoubleNode(data, null, null);
		if (isEmpty()) {
			head = nodeToInsert;
			tail = head;
		} else {
			nodeToInsert = new DoubleNode(data, head, null);
			head.setPrevious(nodeToInsert);
			head = nodeToInsert;
		}
		this.size++;
	}

	/**
	 * Insert a node after the given index.
	 * 
	 * @param index (starts at 0)
	 * @param data
	 */
	public void insertAfter(int index, Object data) {
		if ((index >= 0 && index < size)) {
			if (!isEmpty()) {
				DoubleNode nodeToInsert = new DoubleNode(data, null, null);
				DoubleNode currentNode = head;

				// Enter through the tail/head depending on the index
				if (index > (size / 2)) {
					currentNode = tail;
					for (int i = size - 1; i > index; i--) {
						currentNode = currentNode.getPrevious();
					}
				} else {
					currentNode = head;
					for (int i = 0; i < index; i++) {
						currentNode = currentNode.getNext();
					}
				}

				nodeToInsert.setNext(currentNode.getNext());
				nodeToInsert.setPrevious(currentNode);
				currentNode.getNext().setPrevious(nodeToInsert);
				currentNode.setNext(nodeToInsert);

				size++;
			} else
				System.err.println("ERROR: The list is empty.");
		} else {
			System.err.println("ERROR: Index out of range.");
		}
	}

	/**
	 * Insert a node after the given key.
	 * 
	 * @param key
	 * @param data to insert
	 */
	public void insertAfter(Object key, Object data) {
		if (key != null) {
			if (!isEmpty()) {
				DoubleNode nodeToInsert = new DoubleNode(data, null, null);
				DoubleNode currentNode = head;

				while (currentNode != null && currentNode.getData() != key) {
					currentNode = currentNode.getNext();
				}

				if (currentNode != null) {
					nodeToInsert.setNext(currentNode.getNext());
					nodeToInsert.setPrevious(currentNode);
					currentNode.setNext(nodeToInsert);
					currentNode.getNext().setPrevious(currentNode);

					size++;
				} else {
					System.err.println("ERROR: The key is not in the list, none node was removed.");
				}

			} else
				System.err.println("ERROR: The list is empty.");
		} else {
			System.err.println("ERROR: parameter key.");
		}
	}

	/**
	 * Removes a node by key.
	 * 
	 * @param key
	 * @return removed node
	 */
	public DoubleNode remove(Object key) {
		DoubleNode currentNode = null;
		boolean removed = false;
		if (!isEmpty()) {
			currentNode = head;

			// If the node to remove is the head
			if (head.getData().equals(key)) {
				currentNode.getNext().setPrevious(null);
				head = currentNode.getNext();
				System.out.println("Head: " + currentNode.toString());
				size--;
				removed = true;
				return currentNode;
			}

			// Iterate the list.
			while (!currentNode.getData().equals(key)) {
				currentNode = currentNode.getNext();
			}
			// If the node is between head and the tail.
			if (currentNode != null && currentNode.getData().equals(key)) {
				currentNode.getPrevious().setNext(currentNode.getNext());
				currentNode.getNext().setPrevious(currentNode.getPrevious());
				System.out.println("Node removed: " + currentNode.toString());
				size--;
				removed = true;
				return currentNode;
			}

			// If the node to remove is the tail.
			if (currentNode.getData().equals(tail.getData())) {
				currentNode.getPrevious().setNext(null);
				tail = currentNode.getPrevious();
				System.out.println("Tail removed: " + currentNode.toString());
				size--;
				removed = true;
				return currentNode;
			}

			// If there is not in the list.
			if (!removed) {
				System.out.println("The node with key " + key + " is not in the list.");
			}

		} else {
			System.err.println("The list is empty.");
		}
		return currentNode;

	}

	/**
	 * Check if the list contains the data.
	 * 
	 * @param data
	 * @return boolean is/is not in the list
	 */
	public boolean contains(Object data) {
		boolean contains = false;
		DoubleNode currentNode = null;

		if (!isEmpty()) {
			currentNode = head;
			for (int i = 0; i < size; i++) {
				if (currentNode != null && currentNode.getData().equals(data)) {
					contains = true;
				}
				currentNode = currentNode.getNext();
			}
		} else {
			System.err.println("The list is empty.");
		}
		return contains;

	}

	/**
	 * Prints the nodes of the SinglyLinkedList in a pretty way.
	 */
	public void printListForwards() {

		if (isEmpty()) {
			System.err.println("The list is empty.");
		} else {
			DoubleNode currentNode = this.head;
			for (int i = 0; i < this.size; i++) {
				System.out.println("[" + i + "]" + currentNode.getData());
				currentNode = currentNode.getNext();
			}
			System.out.println("Size:" + size);
			System.out.println("---------------------------------");
		}
	}

	/**
	 * Prints the nodes of the SinglyLinkedList in a pretty way.
	 */
	public void printListBackwards() {

		if (isEmpty()) {
			System.err.println("The list is empty.");
		} else {
			DoubleNode currentNode = tail;
			for (int i = size - 1; i > -1; i--) {
				System.out.println("[" + i + "]" + currentNode.getData());
				currentNode = currentNode.getPrevious();
			}
			System.out.println("Size:" + size);
			System.out.println("---------------------------------");
		}
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the head
	 */
	public DoubleNode getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(DoubleNode head) {
		this.head = head;
	}

	/**
	 * @return the tail
	 */
	public DoubleNode getTail() {
		return tail;
	}

	/**
	 * @param tail the tail to set
	 */
	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}

}
