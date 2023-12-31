package LinkedList;

public class MyDoublyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		private int value;

		private Node next;
		private Node prev;

		public Node(int value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}

	public MyDoublyLinkedList(int value) {
		Node newNode = new Node(value);
		setHead(newNode);
		setTail(newNode);
		setLength(1);
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}

		length++;
	}

	public void removeLast() {
		if (length == 0) {
			throw new NullPointerException("There Is No Item In List");
		} else if (length == 1) {
			head = null;
			tail = null;
			length--;
		} else {
			Node temp = tail.prev;
			tail.prev = null;
			temp.next = null;
			tail = temp;
			length--;
		}
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public void removeFirst() {
		if (length == 0) {
			throw new NullPointerException("There Is No Item In List");
		} else if (length == 1) {
			head = null;
			tail = null;
			length--;
		} else {
			Node temp = head;
			head = head.next;
			head.prev = null;
			temp.next = null;
			length--;
		}
	}

	public Node get(int index) {
		Node temp = null;
		if (index < 0 || index >= length)
			return null;
		if (index <= length / 2) {
			temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.prev;
			}
		}
		return temp;
	}

	public void set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
		}
	}

	public void insert(int index, int value) {
		if (index < 0 || index > length) {
			throw new NullPointerException("Wrong Index Given");
		} else if (index == 0) {
			prepend(value);
		} else if (index == length) {
			append(value);
		} else {
			Node newNode = new Node(value);
			Node before = get(index - 1);
			Node after = before.next;
			newNode.prev = before;
			newNode.next = after;
			before.next = newNode;
			after.prev = newNode;
			length++;

		}
	}

	public void remove(int index) {
		if (index < 0 || index >= length) {
			throw new NullPointerException("Wrong Index Given");
		} else if (index == 0) {
			removeFirst();
		} else if (index == length - 1) {
			removeLast();
		} else {
			Node current = get(index);
			Node before = current.prev;
			Node after = current.next;
			current.next = null;
			current.prev = null;
			before.next = after;
			after.prev = before;
			length--;
		}
	}

	public void swapFirstLastNodes() {
		if (length < 2)
			return;
		else if (length == 2) {
			tail.next = head;
			head.prev = tail;
			head.next = null;
			tail.prev = null;
			Node temp = tail;
			tail = head;
			head = temp;
		} else {
			Node prevTail = tail.prev;
			Node temp = tail;
			tail.next = head.next;
			tail.next.prev = tail;
			tail.prev = null;

			prevTail.next = head;
			head.prev = prevTail;
			head.next = null;

			tail = head;
			head = temp;
		}
	}

	public void swapFirstLastValues() {
		if (length < 2)
			return;
		int temp = head.value;
		head.value = tail.value;
		tail.value = temp;
	}

	public void reverse() {
		Node current = head;
		Node temp = null;

		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}

		temp = head;
		head = tail;
		tail = temp;
	}

	public void swapPairs() {
		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;
		Node secondNode = null;

		while (head != null && head.next != null) {
			Node firstNode = head;
			secondNode = head.next;

			prev.next = secondNode;
			firstNode.next = secondNode.next;
			secondNode.next = firstNode;

			secondNode.prev = prev;
			firstNode.prev = secondNode;
			if (firstNode.next != null) {
				firstNode.next.prev = firstNode;
			}

			head = firstNode.next;
			prev = firstNode;
		}

		head = dummy.next;
		if (head != null)
			head.prev = null;
		if (length % 2 == 0)
			tail = secondNode.next;
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
