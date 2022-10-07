/**
 * 
 */
package beans.lists;

import beans.Node;

/**
 * @author pablo
 *
 */
public class CircularSinglyLinkedList {

	private Node head;
	private int size;

	/**
	 * 
	 * @param head
	 * @param size
	 */
	public CircularSinglyLinkedList() {
		head = null;
		size = 0;
	}

	/**
	 * Checks if the list is empty.
	 * 
	 * @return boolean empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Clears all the nodes in the list.
	 */
	public void clear() {
		head = null;
		size = 0;
	}

	/**
	 * Insert a new node at the head/end of the list. (Substitutes the add() and
	 * push() methods present in non-circular lists.
	 * 
	 * @param data
	 */
	public void insert(Object data) {
		Node nodeToInsert = new Node(data);
		if (isEmpty()) {
			nodeToInsert.setNext(nodeToInsert);
			head = nodeToInsert;
		} else {
			Node current = head;
			// Iterate the list until the last node.
			while (current.getNext() != head) {
				current = current.getNext();
			}
			nodeToInsert.setNext(current.getNext());
			current.setNext(nodeToInsert);
		}
		size++;
	}

	/**
	 * Inserts a node after a given index.
	 * 
	 * @param data
	 * @param index
	 */
	public void insertAfter(Object data, int index) {
		if (isEmpty()) {
			System.err.println("ERROR: the list is empty.");
		} else if (index < 0 || index >= size) {

		} else {
			Node current = head;
			for (int i = 0; i < index; i++) {
				current = current.getNext();
			}

			Node nodeToInsert = new Node(data);
			nodeToInsert.setNext(current.getNext());

			current.setNext(nodeToInsert);

			head = nodeToInsert;

			size++;
		}
	}

	/**
	 * Inserts a node after a given key.
	 * 
	 * @param data
	 * @param index
	 */
	public void insertAfter(Object data, Object key) {
		if (isEmpty()) {
			System.err.println("ERROR: the list is empty.");
		} else {
			boolean keyExist = false;
			Node current = head;
			for (int i = 0; i < size; i++) {
				if (current.getData().equals(current.getData())) {
					keyExist = true;
					Node nodeToInsert = new Node(data);
					nodeToInsert.setNext(current.getNext());
					current.setNext(nodeToInsert);
					size++;
					break;
				}
				current = current.getNext();
			}

			if (!keyExist) {
				System.out.println("The key is not in the list.");
			}
		}
	}

	/**
	 * Prints the nodes of the list in a pretty way.
	 */
	public void printList() {

		if (isEmpty()) {
			System.out.println("The list has not elements.");
		} else {
			Node currentNode = head;
			for (int i = 0; i < size; i++) {
				System.out.println("[" + i + "]" + currentNode.getData());
				currentNode = currentNode.getNext();
			}

		}
		System.out.println("Size:" + size);
	}

}
