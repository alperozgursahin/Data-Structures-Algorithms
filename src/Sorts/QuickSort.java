package Sorts;

public class QuickSort {

	private static void swap(int[] array, int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

	private static int pivot(int[] array, int pivotIndex, int endIndex) {
		int swapIndex = pivotIndex;
		for (int i = pivotIndex + 1; i <= endIndex; i++) {
			if (array[i] < array[pivotIndex]) {
				swapIndex++;
				swap(array, swapIndex, i);
			}
		}
		swap(array, pivotIndex, swapIndex);
		return swapIndex;
	}

	private static void quickSortHelper(int[] array, int left, int right) {
		if (left < right) {
			int pivotIndex = pivot(array, left, right);
			quickSortHelper(array, left, pivotIndex - 1);
			quickSortHelper(array, pivotIndex + 1, right);
		}
	}

	public static void quickSort(int[] array) {
		quickSortHelper(array, 0, array.length - 1);
	}

}
