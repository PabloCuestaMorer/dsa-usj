/**
 * 
 */
package main;

import beans.lists.DoubleLinkedList;

/**
 * @author pablo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		SinglyLinkedList list = new SinglyLinkedList();
		// Test print empty list.
//		list.printListItems();

//		list.add(list, 'A');
//		list.add(list, 'B');
//		list.add(list, 'C');
//		list.add(list, 'D');
//		System.out.println("Test: insert");
//		list.printListItems();
//
//		System.out.println("\nTest: deleteByKey");
//		list.deleteByKey(list, 'B');
//		list.printListItems();
//
//		System.out.println("\nTest: push");
//		list.push(list, 'B');
//		list.printListItems();

		// Test clear the list.
//		list.clear();
//		list.printListItems();

		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

		doubleLinkedList.add("B");
		doubleLinkedList.add("C");
		doubleLinkedList.add("D");
		doubleLinkedList.push("A");
		doubleLinkedList.add("E");
		doubleLinkedList.printListForwards();
//		doubleLinkedList.printListBackwards();
//		doubleLinkedList.insertAfter(3, "F");
//		doubleLinkedList.printListForward();
		doubleLinkedList.insertAfter("C", "X");
		doubleLinkedList.printListForwards();
//		doubleLinkedList.clear();
//		doubleLinkedList.remove("B");
//		doubleLinkedList.printListForwards();
//		System.out.println(doubleLinkedList.contains("A"));

	}

}
