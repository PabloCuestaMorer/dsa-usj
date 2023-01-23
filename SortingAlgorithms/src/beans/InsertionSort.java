package beans;

/**
 * @author pablo
 *
 */
public class InsertionSort {

	public void sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			// previous element
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key (left side of the
			 * key), to one position ahead of their current position.
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			// Put the key on their position
			arr[j + 1] = key;
		}
	}
}
