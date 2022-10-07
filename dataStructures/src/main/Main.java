/**
 * 
 */
package main;

import beans.lists.SinglyLinkedList;

/**
 * @author pablo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();
		// Test print empty list.
		list.printListItems();

		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		System.out.println("Test: insert");
		list.printListItems();

		System.out.println("\nTest: deleteByKey");
		list.deleteByKey('B');
		list.printListItems();

//		System.out.println("\nTest: push");
//		list.push('B');
//		list.printListItems();
//
		// Test clear the list.
//		list.clear();
//		list.printListItems();

//		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
//
//		doubleLinkedList.add("B");
//		doubleLinkedList.add("C");
//		doubleLinkedList.add("D");
//		doubleLinkedList.push("A");
//		doubleLinkedList.add("E");
//		doubleLinkedList.printListForwards();
//		doubleLinkedList.printListBackwards();
//		doubleLinkedList.insertAfter(3, "F");
//		doubleLinkedList.printListForward();
//		doubleLinkedList.insertAfter("C", "X");
//		doubleLinkedList.printListForwards();
//		doubleLinkedList.clear();
//		doubleLinkedList.remove("B");
//		doubleLinkedList.printListForwards();
//		System.out.println(doubleLinkedList.contains("A"));
		
//		CircularSinglyLinkedList list = new CircularSinglyLinkedList();
//		list.insert("A");
//		list.insert("B");
//		list.insert("C");
//		list.insert("D");
//		
//		list.insertAfter("x", "A");
//		
//		list.printList();
		
	}

}
