package HashTable;

public class Test {

	public static void main(String[] args) {
		MyHashTable table = new MyHashTable();
		table.set("bmw", 1);
		table.set("audi", 2);
		table.set("dodge", 3);
		table.set("nissan", 4);

		System.out.println(table.keys());

	}

}
