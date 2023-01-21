package beans;

import dataStructures.list.SingleLinkedList;

/**
 * @author pablo
 *
 */
public class EV {

	private int orderId;
	private String carModel;
	private int deliveryPriority;
	private SingleLinkedList extras;

	/**
	 * @param orderId
	 * @param carModel
	 * @param deliveryPriority
	 * @param extras
	 */
	public EV() {
		this.extras = new SingleLinkedList();
	}

	public Extra addExtra(String type, int cost) {
		Extra extra = new Extra(type, cost);
		extras.insertLast(extra);

		return extra;
	}

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
	 * @return the deliveryPriority
	 */
	public int getDeliveryPriority() {
		return deliveryPriority;
	}

	/**
	 * @param deliveryPriority the deliveryPriority to set
	 */
	public void setDeliveryPriority(int deliveryPriority) {
		this.deliveryPriority = deliveryPriority;
	}

	/**
	 * @return the extras
	 */
	public SingleLinkedList getExtras() {
		return extras;
	}

	/**
	 * @param extras the extras to set
	 */
	public void setExtras(SingleLinkedList extras) {
		this.extras = extras;
	}

}
