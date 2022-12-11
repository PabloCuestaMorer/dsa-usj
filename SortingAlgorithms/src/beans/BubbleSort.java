/**
 * 
 */
package beans;

/**
 * @author pablo
 *
 *         Bubble Sort is the simplest sorting algorithm that works by
 *         repeatedly swapping the adjacent elements if they are in the wrong
 *         order. This algorithm is not suitable for large data sets as its
 *         average and worst-case time complexity is quite high.
 */
public class BubbleSort {

	/**
	 * Recursive version BubbleSort algorithm.
	 * @param arr array
	 * @param n array length
	 */
	public void recursiveSort(int arr[], int n) {
		// base condition for recursion (at least two elements)
		if (n < 2) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			// if arr[i] (current) > arr[i+1] (next one) <--> swap them
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
				swapped = true;
			}
			// no swapped <--> the arr is sorted
			if (!swapped) {
				return;
			}
		}
		
		/*
		 * For each iteration at least one element has been sorted. Then, we must
		 * iterate one less time (or the array to be considered is their size minus
		 * one).
		 */
		// Here is the recursion.
		recursiveSort(arr, n - 1);
	}

	/**
	 * Function that swaps two elements of an array.
	 * 
	 * @param arr
	 * @param i   current
	 * @param j   next one
	 */
	/**
	 * @param arr
	 * @param i
	 * @param j
	 */
	private void swap(int[] arr, int i, int j) {
		// Save the current element
		int temp = arr[i];
		// Current element = next element
		arr[i] = arr[j];
		// Next element = current element (saved one)
		arr[j] = temp;
	}

}
