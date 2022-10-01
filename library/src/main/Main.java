package main;

import beans.Book;
import lists.SinglyLinkedList;

/**
 * @author pablo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Book book1 = new Book("A", 10);
		Book book2 = new Book("B", 10);
		Book book3 = new Book("C", 10);
		Book book4 = new Book("D", 10);
		Book book5 = new Book("E", 10);

		System.out.println("****List of books in the library:*****");
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		list.printListItems();
		System.out.println("Total pages:" + list.totalPages());

		System.out.println();
		System.out.println("****Test remove:*****");
		SinglyLinkedList removedBooks = new SinglyLinkedList();
		removedBooks.add(list.removeByKey(book1));
		removedBooks.add(list.removeByKey(book5));
		removedBooks.printListItems();
		System.out.println("Total pages of RemovedBooks:" + removedBooks.totalPages());
		
		System.out.println();
		System.out.println("****Test concat:*****");
		list.concat(removedBooks);
		list.printListItems();
		
		/*
		 *  TODO:
		 *  
		 *  (Intermedio)
		 *  - Clase Page {text}
		 *  - Crear lista de paginas dentro de libro.
		 *  - Crear metodo que dado un libro y numero de pagina recupere texto
		 *  
		 *  (Avanzado)
		 *  - Crear un metodo que genere un nuevo libro a partir de paginas 
		 *    aleatorias de los libros de la list (1a pag por libro.
		 *  
		 */
		

	}

}
