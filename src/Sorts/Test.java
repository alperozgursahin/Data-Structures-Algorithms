package Sorts;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		/*
		 * int[] array1 = { 1, 3, 7, 8 }; int[] array2 = { 2, 4, 5, 6 }; int[] array3 =
		 * { 3 , 1 ,2 ,3,6,7,1,2,3,7,0,4,5,3,234,342,234,586,67 };
		 * 
		 * System.out.println(Arrays.toString(MergeSort.merge(array1, array2)));
		 * 
		 * int[] sorted = MergeSort.mergeSort(array3);
		 * System.out.println(Arrays.toString(sorted));
		 */

		int[] array = { 4, 6, 1, 7, 3, 2, 5 };

		QuickSort.quickSort(array);
		System.out.println(Arrays.toString(array));

	}

}
