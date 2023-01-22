package beans;

import java.util.Comparator;

/**
 * @author Pablo Cuesta Morer
 * @date 2023-01-22
 */
public class District {

	private String id;
	private String city;
	private int numPackages;
	private boolean isActive = true;

	/**
	 * Empty constructor.
	 */
	public District() {
	}

	/**
	 * Constructor with params.
	 * 
	 * @param id
	 * @param city
	 * @param numPackages
	 */
	public District(String id, String city, int numPackages) {
		this.id = id;
		this.city = city;
		this.numPackages = numPackages;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the numPackages
	 */
	public int getNumPackages() {
		return numPackages;
	}

	/**
	 * @param numPackages the numPackages to set
	 */
	public void setNumPackages(int numPackages) {
		this.numPackages = numPackages;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public static final Comparator<District> BY_NUM_PACKAGES = new ByNumPackages();

	private static class ByNumPackages implements Comparator<District> {
		public int compare(District s1, District s2) {
			return Integer.compare(s1.getNumPackages(), s2.getNumPackages());
		}
	}

	@Override
	public String toString() {
		return "District [id=" + id + ", city=" + city + ", numPackages=" + numPackages + ", isActive=" + isActive
				+ "]";
	}

}
