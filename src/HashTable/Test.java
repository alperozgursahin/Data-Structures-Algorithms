package HashTable;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		MyHashTable table = new MyHashTable();
		table.set("bmw", 1);
		table.set("audi", 2);
		table.set("dodge", 3);
		table.set("nissan", 4);

		System.out.println(table.keys());
		
		int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = table.findDuplicates(nums);
        System.out.println(duplicates); 

	}

}
