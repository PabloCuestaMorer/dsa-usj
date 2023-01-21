package beans.dataStructures;

/**
 * @author pablo
 *
 */

public class SinglyLinkedList {

	private int size;
	private Node head;

	/**
	 * Constructor that builds an empty single linked list
	 */
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
	 * @return boolean if the list is empty
	 */
	public boolean isEmpty() {
		return (this.size == 0) ? true : false;
	}

	/**
	 * Insert a node to the end of the linkedList.
	 * 
	 * @param data
	 */
	public void add(Object data) {
		Node nodeToInsert = new Node(data);

		// List is empty.
		if (isEmpty()) {
			head = nodeToInsert;
			this.size = 1;
		} else {
			// Add new node to the last one.
			Node last = head;

			while (last.getNext() != null) {
				last = last.getNext();
			}

			last.setNext(nodeToInsert);
			this.size++;
		}
	}

	/**
	 * Insert a node at the beginning of the linkedList.
	 * 
	 * @param data
	 */
	public void push(Object data) {
		Node nodeToInsert = new Node(data);

		if (isEmpty()) {
			head = nodeToInsert;
		} else {
			nodeToInsert.setNext(head);
			head = nodeToInsert;
		}
		this.size++;
	}

	/**
	 * Delete a node on the linkedList by a key.
	 * 
	 * @param key
	 */
	public void deleteByKey(Object key) {

		Node currentNode = head;
		Node prevNode = null;

		// CASE 1: Key in the head
		if (currentNode != null && currentNode.getData() == key) {
			head = currentNode.getNext();
			this.size--;
			// System.out.println(key + " found and deleted");
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
	}

	/**
	 * Prints the nodes of the SinglyLinkedList in a pretty way.
	 */
	public void printListItems() {

		if (isEmpty()) {
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
