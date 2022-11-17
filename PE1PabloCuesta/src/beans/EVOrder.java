package beans;

/**
 * @author pablo
 *
 */
public class EVOrder {

	private int id;
	private boolean fastDelivery;
	private boolean recurrentClient;
	private String carModel;
	private boolean enhancedNavigation;
	private boolean matrixLedLights;
	private boolean allWheelDrive;

	/**
	 * @param id
	 * @param fastDelivery
	 * @param recurrentClient
	 * @param carModel
	 * @param enhancedNavigation
	 * @param matrixLedLights
	 * @param allWheelDrive
	 */
	public EVOrder(int id, boolean fastDelivery, boolean recurrentClient, String carModel, boolean enhancedNavigation,
			boolean matrixLedLights, boolean allWheelDrive) {
		this.id = id;
		this.fastDelivery = fastDelivery;
		this.recurrentClient = recurrentClient;
		this.carModel = carModel;
		this.enhancedNavigation = enhancedNavigation;
		this.matrixLedLights = matrixLedLights;
		this.allWheelDrive = allWheelDrive;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fastDelivery
	 */
	public boolean isFastDelivery() {
		return fastDelivery;
	}

	/**
	 * @param fastDelivery the fastDelivery to set
	 */
	public void setFastDelivery(boolean fastDelivery) {
		this.fastDelivery = fastDelivery;
	}

	/**
	 * @return the recurrentClient
	 */
	public boolean isRecurrentClient() {
		return recurrentClient;
	}

	/**
	 * @param recurrentClient the recurrentClient to set
	 */
	public void setRecurrentClient(boolean recurrentClient) {
		this.recurrentClient = recurrentClient;
	}

	/**
	 * @return the carModel
	 */
	public String getCarModel() {
		return carModel;
	}

	/**
	 * @param carModel the carModel to set
	 */
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	/**
	 * @return the enhancedNavigation
	 */
	public boolean isEnhancedNavigation() {
		return enhancedNavigation;
	}

	/**
	 * @param enhancedNavigation the enhancedNavigation to set
	 */
	public void setEnhancedNavigation(boolean enhancedNavigation) {
		this.enhancedNavigation = enhancedNavigation;
	}

	/**
	 * @return the matrixLedLights
	 */
	public boolean isMatrixLedLights() {
		return matrixLedLights;
	}

	/**
	 * @param matrixLedLights the matrixLedLights to set
	 */
	public void setMatrixLedLights(boolean matrixLedLights) {
		this.matrixLedLights = matrixLedLights;
	}

	/**
	 * @return the allWheelDrive
	 */
	public boolean isAllWheelDrive() {
		return allWheelDrive;
	}

	/**
	 * @param allWheelDrive the allWheelDrive to set
	 */
	public void setAllWheelDrive(boolean allWheelDrive) {
		this.allWheelDrive = allWheelDrive;
	}

}
