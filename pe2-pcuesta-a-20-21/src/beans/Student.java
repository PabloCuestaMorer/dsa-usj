package beans;

/**
 * @author Pablo Cuesta Morer
 * @date 2023-01-21
 */
public class Student {

	private String id;
	private String name;
	private String surname;
	private double averageGrade;
	private boolean isActive;

	/**
	 * Empty constructor
	 */
	public Student() {
	}

	/**
	 * Constructor with params
	 * 
	 * @param id
	 * @param name
	 * @param surname
	 * @param averageGrade
	 */
	public Student(String id, String name, String surname,
			double averageGrade) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.averageGrade = averageGrade;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the averageGrade
	 */
	public double getAverageGrade() {
		return averageGrade;
	}

	/**
	 * @param averageGrade
	 *            the averageGrade to set
	 */
	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname
				+ ", averageGrade=" + averageGrade + "]";
	}

}
