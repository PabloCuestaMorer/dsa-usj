package beans;

/**
 * @author pablo
 *
 */
public class Component {
	private String type;
	private int techLevel;

	/**
	 * @param type
	 * @param techLevel
	 */
	public Component(String type, int techLevel) {
		this.type = type;
		this.techLevel = techLevel;
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
	 * @return the techLevel
	 */
	public int getTechLevel() {
		return techLevel;
	}

	/**
	 * @param techLevel the techLevel to set
	 */
	public void setTechLevel(int techLevel) {
		this.techLevel = techLevel;
	}

}
