package StackQueue;

public class MyQueue {

	private Node first;
	private Node last;
	private int length;

	class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.setValue(value);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	public MyQueue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
	}

	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		length++;
	}

	public void dequeue() {
		if (length == 0)
			return;
		if (length == 1) {
			first = null;
			last = null;
		} else {
			Node temp = first;
			first = first.next;
			temp.next = null;

		}
		length--;	
	}

	public void printQueue() {
		Node current = first;

		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
