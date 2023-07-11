package Trees;

public class MyBinarySearchTree {

	private Node root;

	class Node {

		private int value;
		private Node right;
		private Node left;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public Node getRight() {
			return right;
		}

		public Node getLeft() {
			return left;
		}

	}

	public boolean insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (temp.value == newNode.value)
				return false;
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;

			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}

	}

	public boolean contains(int value) {
		Node temp = root;
		while (temp != null) {
			if (value > temp.value)
				temp = temp.right;
			else if (value < temp.value) {
				temp = temp.left;
			} else {
				return true;
			}
		}
		return false;
	}

	public Node getRoot() {
		return root;
	}

}
