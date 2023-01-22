package main;

import beans.District;
import beans.HashMap;
import beans.QuickSort;

/**
 * Main class to demonstrate the usage of the QuickSort class for sorting an
 * array of Districts. The class creates a few District objects, adds them to a
 * HashMap and an array, and sorts the array using the District.BY_AVERAGE_GRADE
 * comparator.
 * 
 * @author Pablo Cuesta Morer
 * @date 2023-01-22
 */
public class Main {

	private static final int PRIORITY_THRESHOLD = 60; // added a constant variable for priority threshold

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a HashMap to store the District objects
		HashMap hashMap = new HashMap();
		// Create District objects
		District district1 = new District("ZGZ0004", "Zaragoza", 52);
		District district2 = new District("MAD4811", "Madrid", 94);
		District district3 = new District("BCN1225", "Barcelona", 67);
		District district4 = new District("BIL3372", "Bilbao", 36);
		// Add the District objects to the HashMap
		hashMap.put(district1);
		hashMap.put(district2);
		hashMap.put(district3);
		hashMap.put(district4);
		// Create an array of Districts
		District[] districts = { district1, district2, district3, district4 };
		// Sort the array of Districts ASC
		QuickSort<District> quickSort = new QuickSort<>();
		long startTime = System.nanoTime();
		quickSort.sort(districts, 0, districts.length - 1, District.BY_NUM_PACKAGES);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		// Iterate through the sorted array of Districts and print out information
		for (int i = 0; i < districts.length; i++) {
			District district = districts[i];
			String priority = i == districts.length - 1 && district.getNumPackages() > PRIORITY_THRESHOLD ? "Y" : "N";
			// If is the last one and exceeds the threshold
			System.out.println("(" + district.getId() + ") " + district.getCity() + ": número de paquetes ["
					+ district.getNumPackages() + "], prioritario [" + priority + "]");
		}
		System.out.println("Sorting time: " + totalTime / 1000.0 + " microseconds");
	}

}
