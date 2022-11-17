package beans;

import beans.dataStructures.SinglyLinkedList;

/**
 * @author pablo
 *
 */
public class Fleet {
	private String name;
	private Admiral admiral;
	private SinglyLinkedList spaceShips;

	/**
	 * @param name
	 * @param admiral
	 * @param spaceShips
	 */
	public Fleet(String name, Admiral admiral) {
		this.name = name;
		this.admiral = admiral;
		this.spaceShips = new SinglyLinkedList();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the admiral
	 */
	public Admiral getAdmiral() {
		return admiral;
	}

	/**
	 * @param admiral the admiral to set
	 */
	public void setAdmiral(Admiral admiral) {
		this.admiral = admiral;
	}

	/**
	 * @return the spaceShips
	 */
	public SinglyLinkedList getSpaceShips() {
		return spaceShips;
	}

	/**
	 * @param spaceShips the spaceShips to set
	 */
	public void setSpaceShips(SinglyLinkedList spaceShips) {
		this.spaceShips = spaceShips;
	}

}
