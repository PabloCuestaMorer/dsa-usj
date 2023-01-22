package main;

import beans.QuickSort;
import beans.QuickSortV2;
import beans.ShellSort;
import beans.ShellSortV2;

/**
 * @author pablo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int arr[] = { 12, 9, 1, 3, 8, 6, };
		int arr[] = { 959, 827, 789, 895, 810, 964, 875, 966, 986, 564, 778, 835, 889, 924, 849, 921, 926, 596, 691,
				977, 869, 953, 891, 998, 972, 574, 907, 826, 848, 981, 839, 922, 876, 865, 856, 874, 863, 909, 896, 709,
				923, 851, 968, 812, 899, 908, 830, 905, 902, 897, 917, 854, 872, 903, 890, 919, 913, 881, 982, 901, 985,
				880, 916, 915, 935, 912, 906, 971, 910, 904, 955, 952, 947, 930, 942, 929, 925, 918, 914, 940, 934, 927,
				933, 931, 928, 932, 937, 936, 939, 938, 941, 943, 946, 948, 950, 951, 954, 956, 957, 958, 961, 962, 963,
				965, 967, 970, 973, 974, 975, 976, 979, 980, 983, 984, 987, 989, 990, 991, 992, 993, 994, 995, 996, 997,
				999, 1000 };
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
//		ShellSortV2 algorithm = new ShellSortV2();
//		algorithm.sort(arr);

//		**** MERGE SORT ****
//		MergeSort algorithm = new MergeSort();
//		algorithm.sort(arr, arr.length);

//		**** QUICK SORT LL ****
//		QuickSort quickSort = new QuickSort();
		QuickSortV2 quickSort = new QuickSortV2();
		long startTime = System.nanoTime();
		quickSort.sort(arr, 0, arr.length - 1);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;

		System.out.println("Array after sorting: ");
		printArray(arr);
		System.out.println("Sorting time: " + totalTime / 1000000.0 + " miliseconds");

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
