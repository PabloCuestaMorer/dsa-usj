/**
 * 
 */
package beans.nodes;

/**
 * @author pablo
 *
 */
public class Node {
	private Object data;
	private Node next;

	/**
	 * @param data
	 */
	public Node(Object data) {
		this.data = data;
		//next null by default
	}

	/**
	 * @param data
	 * @param next
	 */
	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the next Node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next node to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

}
