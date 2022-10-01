/**
 * 
 */
package beans;

/**
 * @author pablo
 *
 */
public class Node {
	private Book book;
	private Node next;

	/**
	 * @param book
	 * @param next
	 */
	public Node(Book book, Node next) {
		this.book = book;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [book=" + book + ", next=" + next + "]";
	}

	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

}
