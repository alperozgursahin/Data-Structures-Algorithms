package StackQueue;

import java.util.Stack;

public class MyStack {

	private Node top;
	private int height;

	class Node {
		private int value;
		private Node next;

		public Node(int value) {

			this.setValue(value);

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

	public MyStack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
	}

	public void printStack() {
		Node current = top;
		while (current != null) {
			System.out.println(current.value + " ");
			current = current.next;
		}
	}

	public void push(int value) {
		Node newNode = new Node(value);
		if (height == 0) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		height++;
	}

	public Node pop() {
		if (height <= 1)
			return null;
		Node temp = top;
		top = top.next;
		temp.next = null;
		height--;
		return temp;
	}

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
