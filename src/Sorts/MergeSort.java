package Sorts;

import java.util.Arrays;

public class MergeSort {

	public static int[] merge(int[] array1, int[] array2) {
		int[] combined = new int[array1.length + array2.length];
		int index = 0;
		int i = 0;
		int j = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j])
				combined[index++] = array1[i++];
			else
				combined[index++] = array2[j++];

		}
		while (i < array1.length)
			combined[index++] = array1[i++];

		while (j < array2.length)
			combined[index++] = array2[j++];

		return combined;
	}

	public static int[] mergeSort(int[] array) {
		if (array.length == 1)
			return array;
		int midIndex = array.length / 2;
		int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
		int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
		return merge(left, right);
	}

}
