package main;

import beans.EV;
import beans.EVOrder;
import dataStructures.list.SingleLinkedList;
import dataStructures.nodes.SimpleNode;
import dataStructures.queues.LinkedQueue;
import dataStructures.queues.PriorityQueue;

/**
 * @author pablo
 *
 */
public class Main {
	private final static String TYPE_NAVI = "enhancedNavigation";
	private final static String TYPE_LED = "matrixLedLights";
	private final static String TYPE_AWD = "allWheelDrive";
	private final static int COST_NAVI = 6450;
	private final static int COST_LED = 850;
	private final static int COST_AWD = 12500;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SingleLinkedList evOrders = new SingleLinkedList();

		EVOrder p1 = new EVOrder(1, true, false, "G", false, false, false);
		EVOrder p2 = new EVOrder(2, false, true, "A", true, true, false);
		EVOrder p3 = new EVOrder(3, false, false, "T", false, false, true);
		EVOrder p4 = new EVOrder(4, false, true, "T", true, false, false);
		EVOrder p5 = new EVOrder(5, true, true, "O", false, true, false);
		EVOrder p6 = new EVOrder(6, true, false, "O", false, false, false);
		EVOrder p7 = new EVOrder(7, false, true, "G", false, true, true);
		EVOrder p8 = new EVOrder(8, false, false, "T", true, true, true);

		evOrders.insertLast(p1);
		evOrders.insertLast(p2);
		evOrders.insertLast(p3);
		evOrders.insertLast(p4);
		evOrders.insertLast(p5);
		evOrders.insertLast(p6);
		evOrders.insertLast(p7);
		evOrders.insertLast(p8);

//		System.out.println(evoOrders.size);

		// CADENA DE MONTAJE
		LinkedQueue garaje = new LinkedQueue();

		SimpleNode current = evOrders.first;
		while (current.next != null) {
			EVOrder evOrder = (EVOrder) current.data;
			EV ev = new EV();
			ev.setOrderId(evOrder.getId());
			ev.setCarModel(evOrder.getCarModel());
			// Set the priority
			if (evOrder.isRecurrentClient() && evOrder.isFastDelivery()) {
				// Priority 0 (MAX)
				ev.setDeliveryPriority(0);
			} else if (evOrder.isFastDelivery()) {
				// Prio.1
				ev.setDeliveryPriority(1);
			} else if (evOrder.isRecurrentClient()) {
				// Prio.2
				ev.setDeliveryPriority(2);
			} else {
				// Prio.3
				ev.setDeliveryPriority(3);
			}
			// Set the extra/s
			if (evOrder.isEnhancedNavigation()) {
				ev.addExtra(TYPE_NAVI, COST_NAVI);
			} else if (evOrder.isMatrixLedLights()) {
				ev.addExtra(TYPE_LED, COST_LED);
			} else if (evOrder.isAllWheelDrive()) {
				ev.addExtra(TYPE_AWD, COST_AWD);
			}

			// Add to the queue
			garaje.push(ev);

			current = current.next;
		}

		// COLA DE PRIORIDAD DE ENVIO
		PriorityQueue priorityQueue = new PriorityQueue(4);
		for (int i = 0; i < garaje.size; i++) {
			EV ev = (EV) garaje.poll();
			priorityQueue.push(ev, ev.getDeliveryPriority());
		}

		//
		for (int i = 0; i < priorityQueue.size(); i++) {
			for (int j = 0; j < priorityQueue.prioQueue[i].size; j++) {
				EV ev = ((EV) priorityQueue.prioQueue[i].poll());
				System.out.println(
						"Modelo " + ev.getCarModel() + " correspondiente a pedido " + ev.getOrderId() + " enviado.");
			}
		}
	}

}
