package main;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.lang3.ArrayUtils;

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
		
		Fleet cuestaFleet = new Fleet("Guardia del Segundo Sector", sirCuesta)
				
		// Spaceship shipyard
		LinkedQueue shipyard = new LinkedQueue();
		for (int i = 0; i < args.length; i++) {
			shipyard.push(spaceship+i);
		}
		
	}

}
