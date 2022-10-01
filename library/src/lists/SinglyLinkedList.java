/**
 * 
 */
package lists;

import beans.Book;
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
	 * Check if the list is empty.
	 * 
	 * @return if the list is empty
	 */
	public boolean isEmpty() {
		return (this.size == 0) ? true : false;
	}

	/**
	 * Insert a node to the end of the linkedList.
	 * 
	 * @param linkedList
	 * @param data
	 * @return
	 */
	public void add(Book book) {
		Node node = new Node(book, null);
		// List is empty.
		if (isEmpty()) {
			head = node;
			size = 1;
		} else {
			// Add new node to the last one.
			Node last = head;

			while (last.getNext() != null) {
				last = last.getNext();
			}

			last.setNext(node);
			this.size++;
		}
	}

	/**
	 * Insert a node at the beginning of the linkedList.
	 * 
	 * @param linkedList
	 * @param data
	 * @return
	 */
	public void push(Book book) {
		Node node = new Node(book, head);
		if (size == 0) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		this.size++;
	}

	/**
	 * Delete a node on the linkedList by a key.
	 * 
	 * @param linkedList
	 * @param key
	 * @return
	 */
	public Book removeByKey(Book key) {

		Node currentNode = head;
		Node prevNode = null;

		// CASE 1: Key in the head
		if (currentNode != null && currentNode.getBook().equals(key)) {
			head = currentNode.getNext();
			this.size--;
//			System.out.println(key + " found and deleted");

			return currentNode.getBook();
		}

		// Search the key
		while (currentNode != null && !currentNode.getBook().equals(key)) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}

		// CASE 2: key in the middle or end.
		if (currentNode != null && currentNode.getBook().equals(key)) {
			prevNode.setNext(currentNode.getNext());
			this.size--;
//			System.out.println(key + "found and deleted.");
		} else {
			// CASE 3: The key is not present
//			System.err.println(key + " not found.");
		}

		return currentNode.getBook();
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
				System.out.println("[" + i + "]" + currentNode.getBook().toString());
				currentNode = currentNode.getNext();
			}

		}
		System.out.println("Size:" + size);
		System.out.println("--------------------------------");
	}

	/**
	 * Method that returns the sum of number of pages of the books in the list.
	 * 
	 * @return int number of pages
	 */
	public int totalPages() {
		int pages = 0;

		if (!isEmpty()) {
			Node current = head;
			while (current != null) {
				pages += current.getBook().getPages();
				current = current.getNext();
			}
		} else {
			System.out.println("There are not any books in the list.");
		}

		return pages;
	}

	/**
	 * Concat the current list to the given one.
	 * 
	 * @param listToConcat
	 */
	public void concat(SinglyLinkedList listToConcat) {

		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(listToConcat.head);
		size += listToConcat.getSize();
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
