/**
 * 
 */
package beans.lists;

import beans.Node;

/**
 * @author pablo
 *
 */

/*
 * TO DO:
 */
//	insertHead(Object)				DONE		
//	insertLast(Object)				DONE
//	insertAfter(Object int)
//	insertAfter(Object object)
//	contains(Object)
//	clear()							DONE

public class SinglyLinkedList {

	private int size;
	private Node head;

	public SinglyLinkedList() {
		this.size = 0;
		this.head = null;
	}

	/**
	 * Cleans all the nodes in the list.
	 */
	public void clear() {
		this.head = null;
		this.size = 0;
	}

	/**
	 * Insert a node to the end of the linkedList.
	 * 
	 * @param linkedList
	 * @param data
	 * @return
	 */
	public SinglyLinkedList add(SinglyLinkedList linkedList, Object data) {
		Node nodeToInsert = new Node(data);

		// List is empty.
		if (linkedList.getHead() == null) {
			linkedList.setHead(nodeToInsert);
			this.size = 1;
		} else {
			// Add new node to the last one.
			Node last = linkedList.getHead();

			while (last.getNext() != null) {
				last = last.getNext();
			}

			last.setNext(nodeToInsert);
			this.size++;
		}
		return linkedList;
	}

	/**
	 * Insert a node at the beginning of the linkedList.
	 * 
	 * @param linkedList
	 * @param data
	 * @return
	 */
	public SinglyLinkedList push(SinglyLinkedList linkedList, Object data) {
		Node nodeToInsert = new Node(data);

		if (size == 0) {
			linkedList.setHead(nodeToInsert);
		} else {
			nodeToInsert.setNext(head);
			linkedList.setHead(nodeToInsert);
		}
		this.size++;

		return linkedList;
	}

	/**
	 * Delete a node on the linkedList by a key.
	 * 
	 * @param linkedList
	 * @param key
	 * @return
	 */
	public SinglyLinkedList deleteByKey(SinglyLinkedList linkedList, Object key) {

		Node currentNode = linkedList.head;
		Node prevNode = null;

		// CASE 1: Key in the head
		if (currentNode != null && currentNode.getData() == key) {
			linkedList.head = currentNode.getNext();
			this.size--;
			// System.out.println(key + " found and deleted");

			return linkedList;
		}

		// CASE 2: key in the middle or end.
		// Search the key
		while (currentNode != null && currentNode.getData() != key) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		if (currentNode != null) {
			prevNode.setNext(currentNode.getNext());
			this.size--;
//			System.out.println(key + "found and deleted.");
		}

		// CASE 3: The key is not present
		if (currentNode == null) {
			// Display the message
			System.out.println(key + " not found.");
		}
		return linkedList;
	}

	/**
	 * Prints the nodes of the SinglyLinkedList in a pretty way.
	 */
	public void printListItems() {

		if (size == 0) {
			System.out.println("The linkedList is empty.");
		} else {
			Node currentNode = head;
			for (int i = 0; i < size; i++) {
				System.out.println("[" + i + "]" + currentNode.getData());
				currentNode = currentNode.getNext();
			}

		}
//		System.out.println("Size:" + size);
	}

	@Override
	public String toString() {
		return "SinglyLinkedList [size=" + size + ", head=" + head.toString() + "]";
	}

	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
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

}
