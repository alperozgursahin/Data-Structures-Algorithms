package LinkedList;

public class MyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public MyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;

	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;

		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		length++;

	}

	public void removeLast() {
		if (length <= 0) {
			System.out.println("There is no item in list!");
		} else if (length == 1) {
			head = null;
			tail = null;
			length--;
		} else {
			Node temp = head;
			Node pre = null;
			while (temp.getNext() != null) {
				pre = temp;
				temp = temp.getNext();

			}
			tail = pre;
			pre.setNext(null);
			length--;
		}

	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		length++;
	}

	public void removeFirst() {
		Node temp = head;
		if (length == 0) {
			System.out.println("The List is already empty!");

		} else {
			head = head.getNext();
			temp.setNext(null);
			length--;
		}
		if (length == 0) {
			head = null;
			tail = null;
		}

	}

	public Node get(int index) {
		if (index < 0 || index >= length) {
			System.err.println("Wrong Index");
			return null;
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;

	}

	public void insert(int index, int value) {
		if (index < 0 || index > length) {
			System.err.println("Wrong Index Given");
		} else if (index == length) {
			append(value);
		} else if (index == 0) {
			prepend(value);
		} else {
			Node temp = get(index - 1); // previous node
			Node newNode = new Node(value);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			length++;
		}
	}

	public void set(int index, int value) {
		if (index < 0 || index > length) {
			System.err.println("Wrong Index Given");
		} else {
			Node temp = get(index);
			temp.setValue(value);
		}
	}

	public void remove(int index) {
		if (index < 0 || index >= length) {
			System.err.println("Wrong Index Given");
		} else if (index == 0) {
			removeFirst();
		} else if (index == length - 1) {
			removeLast();
		} else {
			Node temp = get(index);
			Node pre = get(index - 1);
			pre.setNext(temp.getNext());
			temp.setNext(null);
			length--;
		}
	}

	public void reverseList() {
		Node before = null;
		Node current = head;
		Node after = current.getNext();

		head = tail;
		tail = current;

		current.setNext(null);

		for (int i = 1; i < length; i++) {
			before = current;
			current = after;
			after = after.getNext();
			current.setNext(before);
		}

	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getValue() + " ");
			temp = temp.getNext();
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
