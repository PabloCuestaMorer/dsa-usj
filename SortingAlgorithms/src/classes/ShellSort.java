package classes;

/**
 * @author pablo
 *
 */
public class ShellSort {

	public int sort(int arr[]) {
		int n = arr.length;

		// Iterate until gap = 1
		for (int gap = n / 2; gap > 0; gap /= 2) {
			// Iterate the gap
			for (int i = gap; i < n; i++) {

				int temp = arr[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];

				// put temp (the original a[i]) in its correct
				// location
				arr[j] = temp;
			}
		}
		return 0;
	}
}
