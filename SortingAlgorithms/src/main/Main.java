package main;

/**
 * @author pablo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 12, 9, 1, 3, 8, 6 };
		System.out.println("Array before sorting: ");
		printArray(arr);

//		**** BUBBLE ****
//		BubbleSort bubbleSort = new BubbleSort();
//		bubbleSort.recursiveSort(arr, arr.length);

//		**** INSERTION ****
//		InsertionSort algorithm = new InsertionSort();
//		algorithm.sort(arr);

//		**** SHELL ****
//		ShellSort algorithm = new ShellSort();
//		algorithm.sort(arr);

		System.out.println("Array after sorting: ");
		printArray(arr);

	}

	// Print the array
	public static void printArray(int arr[]) {
		System.out.print("| ");
		for (int i : arr) {

			System.out.print(i + " | ");
		}
		System.out.println();
		System.out.println();
	}

}