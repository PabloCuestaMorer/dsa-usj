package beans;

/**
 * @author pablo
 *
 */
public class Extra {

	private String type;
	/*
	 * Navigation: 6450; Matrix LEDs: 850; AWD: 12500
	 */
	private int cost;

	/**
	 * @param type
	 * @param cost
	 */
	public Extra(String type, int cost) {
		this.type = type;
		this.cost = cost;
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
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

}
