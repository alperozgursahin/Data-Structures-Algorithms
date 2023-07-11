package Trees;

public class Test {

	public static void main(String[] args) {
		MyBinarySearchTree tree = new MyBinarySearchTree();
		tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(65);
		//System.out.println(tree.getRoot().getRight().getLeft().getValue());
		System.out.println(tree.getRoot().getValue());
		System.out.println(tree.contains(65));

	}

}
