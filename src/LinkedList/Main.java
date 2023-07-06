package LinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList(0);

		myList.append(1);
		myList.append(2);
		myList.append(3);
		myList.append(4);
		myList.insert(0, -35);
		myList.remove(1);
		myList.printList();

		System.out.println("\nHead: " + myList.getHead().getValue());
		System.out.println("Tail: " + myList.getTail().getValue());
		System.out.println("Length: " + myList.getLength());
		System.out.println("VALUE: " + myList.get(4).getValue());

	}

}
