/**
 * 
 */
package beans;

import java.util.Comparator;

/**
 * @author Pablo Cuesta Morer
 * @date 2023-01-22
 *
 */
public class QuickSort<T> {

	/*
	 * This function takes the first element as pivot (LL), places the pivot element
	 * at its correct position in sorted array, and places all smaller (smaller than
	 * pivot) to left of pivot and all greater elements to right of pivot
	 */
	private int partition(T[] arr, int low, int high, Comparator<T> comparator) {
		// pivot
		T pivot = arr[high];

		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			// If current element is smaller
			// than the pivot
			if (comparator.compare(arr[j], pivot) < 0) {

				// Increment index of
				// smaller element
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	/**
	 * The main function that implements QuickSort
	 * 
	 * @param arr  Array to be sorted
	 * @param low  Starting index
	 * @param high Ending index
	 */
	public void sort(T[] arr, int low, int high, Comparator<T> comparator) {
		if (low >= high) {
			return; // array is already sorted
		}
		// pi is partitioning index, arr[p]
		// is now at right place
		int pi = partition(arr, low, high, comparator);

		// Separately sort elements before
		// partition and after partition
		sort(arr, low, pi - 1, comparator);
		sort(arr, pi + 1, high, comparator);
	}

	// A utility function to swap two elements
	private void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
