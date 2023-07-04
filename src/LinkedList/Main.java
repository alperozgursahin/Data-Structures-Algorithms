package LinkedList;

public class Main {

	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList(0);

		myList.append(1);
		myList.append(2);
		myList.append(3);
		

		System.out.println("Head: " + myList.getHead().getValue());
		System.out.println("List Length: " + myList.getLength());
		System.out.println("Tail: " + myList.getTail().getValue());
		System.out.println("LIST: ");
		myList.printList();

		myList.reverseList();
		System.out.println("\n************");

		myList.printList();

		System.out.println("\nHead: " + myList.getHead().getValue());
		System.out.println("List Length: " + myList.getLength());
		System.out.println("Tail: " + myList.getTail().getValue());

	}

}
