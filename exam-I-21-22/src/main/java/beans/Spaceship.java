package beans;

import beans.dataStructures.ArrayStack;

/**
 * @author pablo
 *
 */
public class Spaceship {

	private String name;
	private String type;
	private int baseForce;
	/**
	 * 0: fixeable 1: improvable 2: ready
	 */
	private int state;
	private ArrayStack components;

	/**
	 * @param name
	 * @param type
	 * @param baseForce
	 * @param state
	 */
	public Spaceship(String name, String type, int baseForce) {
		this.name = name;
		this.type = type;
		this.baseForce = baseForce;
		this.components = new ArrayStack(4);
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the baseForce
	 */
	public int getBaseForce() {
		return baseForce;
	}

	/**
	 * @param baseForce the baseForce to set
	 */
	public void setBaseForce(int baseForce) {
		this.baseForce = baseForce;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return the components
	 */
	public ArrayStack getComponents() {
		return components;
	}

	/**
	 * @param components the components to set
	 */
	public void setComponents(ArrayStack components) {
		this.components = components;
	}

}
