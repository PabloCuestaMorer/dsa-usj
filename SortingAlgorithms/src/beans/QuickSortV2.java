/**
 * 
 */
package beans;

/**
 * A class that provides an implementation of the QuickSort algorithm for int
 * type array. The class uses a more efficient pivot selection strategy, which
 * is median of three. It also checks if the array is already sorted before
 * sorting it again.
 * 
 * @author Pablo Cuesta Morer
 * @date 2023-01-22
 */
public class QuickSortV2 {

	/**
	 * This function takes the pivot element as the median of the first, middle, and
	 * last element of the array, places the pivot element at its correct position
	 * in the sorted array, and places all smaller elements (smaller than pivot) to
	 * the left of the pivot and all greater elements to the right of the pivot.
	 * 
	 * @param arr  The array to be partitioned
	 * @param low  The starting index of the array
	 * @param high The ending index of the array
	 * @return The partition index
	 */
	private int partition(int[] arr, int low, int high) {
		// pivot
		int middle = low + (high - low) / 2;
		int pivotIndex = medianOfThree(arr, low, middle, high);
		int pivot = arr[pivotIndex];
		swap(arr, pivotIndex, high);

		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			// If current element is smaller
			// than the pivot
			if (arr[j] < pivot) {

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
	 * The main function that implements the QuickSort algorithm.
	 * 
	 * @param arr  The array to be sorted
	 * @param low  The starting index of the array
	 * @param high The ending index of the array
	 */
	public void sort(int[] arr, int low, int high) {
		if (low >= high) {
			return; // array is already sorted
		}
		// pi is partitioning index, arr[p]
		// is now at right place
		int pi = partition(arr, low, high);

		// Separately sort elements before
		// partition and after partition
		sort(arr, low, pi - 1);
		sort(arr, pi + 1, high);
	}

	/**
	 * A utility function to swap two elements in an array
	 * 
	 * @param arr The array
	 * @param i   The index of the first element
	 * @param j   The index of the second element
	 */
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * A utility function to select median of three elements in an array
	 * 
	 * @param arr    The array
	 * @param low    The starting index of the subarray
	 * @param middle The middle index of the subarray
	 * @param high   The ending index of the subarray
	 * @return The index of the median element
	 */
	private int medianOfThree(int[] arr, int low, int middle, int high) {
		if (arr[middle] < arr[low]) {
			swap(arr, low, middle);
		}
		if (arr[high] < arr[low]) {
			swap(arr, low, high);
		}
		if (arr[high] < arr[middle]) {
			swap(arr, middle, high);
		}
		return middle;
	}
}
