package beans;

/**
 * The ShellSort class provides an implementation of the Shell sort algorithm
 * for sorting integer arrays. This algorithm is an efficient variation of the
 * Insertion Sort algorithm, it works by dividing the array into smaller
 * sublists and sorting these sublists using a specific gap sequence.
 * 
 * The time complexity of this algorithm is generally considered to be
 * O(n^(3/2)) which is better than O(n^2) of insertion and bubble sort but still
 * not as good as O(n log n) of quicksort in average case.
 * 
 * @author Pablo Cuesta Morer
 * @date 2023-01-21
 */
public class ShellSortV2 {

	/**
	 * Sort an integer array using Shell sort algorithm
	 *
	 * @param arr the array to be sorted
	 */
	public void sort(Student arr[]) {
		int n = arr.length;

		int[] gaps = { 701, 301, 132, 57, 23, 10, 4, 1 }; // Ciura gap sequence

		// Iterate through all gap values down to a gap of 1
		// Similar to insertion sort but instead of 1, gap is being used in each step
		for (int gap : gaps) {
			// Iterate the gap
			for (int i = gap; i < n; i++) {
				// save a[i] in temp and make a hole at position i
				Student temp = arr[i];

				// Insertion sort for each gap
				// DESCENDING version (<)
				int j = i;
				while (j >= gap && arr[j - gap].getAverageGrade() < temp.getAverageGrade()) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				// put temp (the original a[i]) in its correct location
				arr[j] = temp;
			}
		}

	}
}
