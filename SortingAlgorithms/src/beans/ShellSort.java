package beans;

/**
 * @author pablo
 *
 *         Shell sort is mainly a variation of Insertion Sort. In insertion
 *         sort, we move elements only one position ahead. When an element has
 *         to be moved far ahead, many movements are involved. The idea of
 *         ShellSort is to allow the exchange of far items. In Shell sort, we
 *         make the array h-sorted for a large value of h. We keep reducing the
 *         value of h until it becomes 1. An array is said to be h-sorted if all
 *         sublists of every h’th element are sorted.
 */
public class ShellSort {

	public void sort(int arr[]) {
		int n = arr.length;

		// Iterate until gap = 1
		for (int gap = n / 2; gap > 0; gap /= 2) {
			// Iterate the gap
			for (int i = gap; i < n; i++) {

				int temp = arr[i];

				// insertion sort for each gap (check InsertionSort.java)
				int j = i;
				while (j >= gap && arr[j - gap] > temp) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				// put temp
				arr[j] = temp;
			}
		}
	}
}
