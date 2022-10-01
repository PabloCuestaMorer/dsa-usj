package beans;

/**
 * @author pablo
 *
 */
public class DoubleNode {
	private Object data;
	private DoubleNode next;
	private DoubleNode previous;

	/**
	 * @param data
	 * @param next
	 * @param previous
	 */
	public DoubleNode(Object data, DoubleNode next, DoubleNode previous) {
		this.data = data;
		this.next = next;
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "DoubleNode [data=" + data + "]";
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public DoubleNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(DoubleNode next) {
		this.next = next;
	}

	/**
	 * @return the previous
	 */
	public DoubleNode getPrevious() {
		return previous;
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(DoubleNode previous) {
		this.previous = previous;
	}

}
