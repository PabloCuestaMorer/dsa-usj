package beans;

/**
 * @author pablo
 *
 */
public class Admiral {
	
	private String name;
	private int experience;
	
	/**
	 * @param name
	 * @param experience
	 */
	public Admiral(String name, int experience) {
		this.name = name;
		this.experience = experience;
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
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
	
	

}
