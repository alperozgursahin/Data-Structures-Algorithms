package LinkedList;

public class Main {

	public static void main(String[] args) {
		MyDoublyLinkedList myList = new MyDoublyLinkedList(0);

		myList.append(1);
		myList.append(2);
		myList.append(3);
		
		
		myList.swapPairs();	
		
		myList.printList();

		System.out.println("\nHead: " + myList.getHead().getValue());
		System.out.println("Tail: " + myList.getTail().getValue());
		System.out.println("Length: " + myList.getLength());

	}

}
