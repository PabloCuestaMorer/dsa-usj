package main;

import beans.Admiral;
import beans.Fleet;
import beans.Spaceship;
import beans.dataStructures.LinkedQueue;
import beans.dataStructures.SinglyLinkedList;

/**
 * @author pablo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Spaceship spaceship0 = new Spaceship("Corazón de Léon", "Acorazado", 50);
		Spaceship spaceship1 = new Spaceship("Torbellino de Fuego", "Crucero", 30);
		Spaceship spaceship2 = new Spaceship("Dragón de Hierro", "Crucero", 30);
		Spaceship spaceship3 = new Spaceship("Gato de las Nieves", "Corbeta", 16);
		Spaceship spaceship4 = new Spaceship("Monte Olimpo", "Corbeta", 16);
		Spaceship spaceship5 = new Spaceship("Salamandra Cristalina", "Corbeta", 16);
		Spaceship spaceship6 = new Spaceship("Viento del Sur", "Corbeta", 16);

		Admiral sirCuesta = new Admiral("Sir. Cuesta II", 5);

		Fleet cuestaFleet = new Fleet("Guardia del Segundo Sector", sirCuesta);

		// Spaceship shipyard
		LinkedQueue shipyard = new LinkedQueue();
		shipyard.push(spaceship0);
		shipyard.push(spaceship1);
		shipyard.push(spaceship2);
		shipyard.push(spaceship3);
		shipyard.push(spaceship4);
		shipyard.push(spaceship5);
		shipyard.push(spaceship6);
		
		// Fleet creation
       fillFleet(cuestaFleet, shipyard);
	}
	
	/**
	 * Method that fill a fleet
	 * 
	 * @param fleet to be filled
	 * @param shipyard
	 * @return Fleet the filled fleet, null if the shipyard is empty
	 */
	public static Fleet fillFleet(Fleet fleet, LinkedQueue shipyard) {
		// Iterate the shipyard
		for (int i = 0; i < shipyard.size; i++) {
			// Get each spaceship
			Spaceship spaceship = (Spaceship) shipyard.poll();
			// Add components to the spaceship
			spaceship.addComponent("casco", 3);
			spaceship.addComponent("navegación", 2);
			spaceship.addComponent("escudos", 4);
			spaceship.addComponent("casco", 3);
			// Assign state ready to the spaceship
			spaceship.setState(2);
			// Create spaceships list for the fleet
			SinglyLinkedList spaceships = new SinglyLinkedList();
			spaceships.add(spaceship);
			// Once is ready, add the list to the fleet
			fleet.setSpaceShips(spaceships);
			
			return fleet;
		}
		return null;
	}

}
