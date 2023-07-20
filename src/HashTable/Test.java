package HashTable;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		MyHashTable table = new MyHashTable();

		List<Integer> duplicates2 = new ArrayList<>();
		duplicates2.add(1);
		duplicates2.add(1);
		duplicates2.add(2);
		duplicates2.add(3);
		duplicates2.add(4);
		duplicates2.add(4);
		System.out.println(duplicates2);

		List<Integer> newList = table.removeDuplicates(duplicates2);

		System.out.println(newList);

		String string = "hello";
		String string2 = "abcdefg";
		System.out.println(table.hasUniqueChars(string2));

		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };
		List<int[]> myList = table.findPairs(arr1, arr2, 7);

		for (int[] array : myList) {
		    System.out.print("[");
		    for (int i = 0; i < array.length; i++) {
		        System.out.print(array[i]);
		        if (i != array.length - 1) {
		            System.out.print(", ");
		        }
		    }
		    System.out.println("]");
		}
	}

}
