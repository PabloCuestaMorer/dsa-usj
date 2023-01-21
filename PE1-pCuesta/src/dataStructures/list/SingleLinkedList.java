package dataStructures.list;

import dataStructures.nodes.SimpleNode;

public class SingleLinkedList {

	public SimpleNode first;
	public int size;
	
	/**
	 * Constructor that builds an empty single linked list
	 */
	public SingleLinkedList() {
		first = null;
		size = 0;
	}
	
	/**
	 * Method that checks whether the list is empty
	 * @return True if the list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return size == 0;		
	}
	
	/**
	 * Method that clears the list
	 */
	public void clear() {
		first = null;
		size = 0;
	}
	
	/**
	 * Method that inserts a new element at the head of the list	
	 * @param data The data that must be inserted
	 */
	public void insertHead(Object data) {
		SimpleNode newNode = new SimpleNode(data);
		newNode.next = first;
		first = newNode;
		size++;
	}
	
	/**
	 * Method that inserts a new element at the end of the list
	 * @param data The element that must be inserted
	 */
	public void insertLast(Object data) {
		if(isEmpty()) insertHead(data); 
		else {
			// Position ourselves at the end of the list 
			SimpleNode current = first;
			while(current.next != null) current = current.next;
			current.next = new SimpleNode(data);
			size++;
		}
	}	
	
	/**
	 * Method that inserts a new element after a particular position in the list
	 * Note: 0 is the first index, as an example, position (5) will reference the 6th element of the list:
	 * 		 (0) --> (1) --> (2) --> (3) --> (4) --> {(5)} --> (6) --> ... --> null
	 * @param data The data that must be inserted
	 * @param position The position after which we want to insert the new data
	 */
	public void insertAfterPosition(Object data, int position) {
		
		if(isEmpty()) System.err.println("Error: the list is empty, insertAfter(Object data, int position) could not insert the new data in the list.");
		else if (position < 0 || position >= size) System.err.println("Error: index out of bounds, insertAfter(Object data, int position) could not insert the new data in the list.");
		else {
		
			// Traverse list until desired position
			SimpleNode current = first;
			for (int i = 0; i < position; i++) current = current.next;
	
			// Create the new node with the link
			SimpleNode newNode = new SimpleNode(data);
			newNode.next = current.next;
	
			// Update the link for the current node
			current.next = newNode;
			
			// Increase size of the list
			size++;

		}
	}
	
	/**
	 * Method that inserts a new element after another element in the list
	 * @param data The new element that must be inserted
	 * @param reference The reference element
	 */
	public void insertAfterReference(Object data, Object reference){
		if(isEmpty()) System.err.println("Error: the list is empty, "
				+ "insertAfter(Object data, Object reference) could not insert the new data in the list.");
		else if(!contains(reference)) System.err.println("Error: the reference object is not in the list, "
				+ "insertAfter(Object data, Object reference) could not insert the new data in the list.");
		else {
			SimpleNode ref = get(reference);
			SimpleNode newNode = new SimpleNode(data);
			newNode.next = ref.next;
			ref.next = newNode;	
			size++;
		}
	}
	
	/**
	 * Method that checks whether the list contains a particular element
	 * @param data The element that we want to check
	 * @return True if the list contains the element, false otherwise
	 */
	public boolean contains(Object data) {
		if(isEmpty()) return false;
		else {
			// Traverse the list until we reach the end or until the reference element is found 
			SimpleNode aux = first;
			while(aux != null && aux.data != data) aux = aux.next;
			return aux != null;
		}
	}
	
	/**
	 * Method that retrieves a particular node from the list
	 * @param data The data that the node must contain
	 * @return The node that contains the data, null if the list is empty or the node is not in the list
	 */
	private SimpleNode get(Object data) {
		
		if(isEmpty()) {
			System.err.println("Error: the list is empty, find(Object data) returned null");
			return null;
		} else if(!contains(data)) {
			System.err.println("Error: the list does not contain the element, find(Object data) returned null");
			return null;
		}
		else {
			// Traverse the list until we find the element
			SimpleNode current = first;
			while(current.data != data) current = current.next;
			return current;
		}
		
	}
	
	/**
	 * Method that retrieves the node in a particular index on the list
	 * @param index The index for retrieving the node
	 * @return The node at the index, null if the list is empty or the index is invalid
	 */
	public Object get(int index) {
		
		if(isEmpty()) {
			System.err.println("Error: the list is empty, find(int index) returned null");
			return null;
		} else if(index < 0 || index >= size) {
			System.err.println("Error: the index is out of bounds, find(int index) returned null");
			return null;
		}
		else {
			// Traverse the list until we get to the desired index
			SimpleNode current = first;
			for(int i = 0; i < index; i++) current = current.next;
			return current.data;
		}
		
	}
	
	/**
	 * Method that retrieves and removes a particular element from the list
	 * @param data The element that must be removed from the list
	 * @return The data of the removed node
	 */
	public Object remove(Object data) {
		
		if(isEmpty()) {
			System.err.println("Error: the list is empty, remove(Object data) returned null");
			return null;
		}
		else if(!contains(data)) {
			System.err.println("Error: the list does not contain the element, remove(Object data) returned null");
			return null;
		}
		else if(first.data == data && size == 1) {
			Object aux = first.data;
			clear();
			return aux;
		}
		else if(first.data == data && size != 1) {
			Object aux = first.data;
			first = first.next;
			size--;
			return aux;
		}
		else {
			// Get the previous node and the one that must be removed
			SimpleNode previousNode = previous(data);
			SimpleNode removedNode = get(data);
			// Update the link and size, return the data in the removed node
			previousNode.next = removedNode.next;
			size--;
			return removedNode.data;
		}
	}
	
	/**
	 * Method that finds the previous node to a node that has a particular data
	 * Private, used only to simplify the remove(Object data) method 
	 * @param data The data of the node whose previous node we want to find
	 * @return The previous node to the one with the data
	 */
	private SimpleNode previous(Object data) {
		
		if(isEmpty())
		{
			System.err.println("Error: empty list, previous(Object data) returned null");
			return null;
		}
		else if(!contains(data)) {
			System.err.println("Error: the list does not contain a node with the input data, previous(Object data) returned null");
			return null;
		}
		else if(first.data == data){
			System.err.println("Error: the input data refers to the first node, which does not have a previous"
					+ "element in a SingleLinkedList, so previous(Object data) returned null");
			return null;
		}
		else {
			SimpleNode previous = first;
			SimpleNode current = first;
			// Traverse the list, find and return the previous element
			while(current.data != data) {
					previous = current;
					current = current.next;
			}			
			return previous;
		}		
	}
	
	public int indexOf(Object data) {
		if(isEmpty()) return -1;
		else {
			SimpleNode aux = first;
			int i = 0;
			while(aux != null && aux.data != data) {
				aux = aux.next;
				i++;
			}
			return aux==null ? -1 : i;
			
		}
	}
	
	
	public boolean replace(Object oldData, Object newData) {
		
		if(!contains(oldData)) return false;
		else {
			get(oldData).data = newData;
			return true;
		}

	}
	
	
}
