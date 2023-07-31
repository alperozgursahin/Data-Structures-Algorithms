package Trees;

public class Test {

	public static void main(String[] args) {
		MyBinarySearchTree tree = new MyBinarySearchTree();
		/*tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(65);
		// System.out.println(tree.getRoot().getRight().getLeft().getValue());
		System.out.println(tree.getRoot().getValue());
		System.out.println(tree.rContains(65));
		tree.deleteNode(65);
		System.out.println(tree.rContains(65));*/
		tree.insert(15);
		tree.insert(25);
		tree.insert(10);
		tree.insert(5);
		tree.insert(75);
		tree.insert(20);
		tree.insert(12);
		tree.insert(3);
		tree.insert(6);
		tree.insert(11);
		tree.insert(13);
		
		System.out.println(tree.DFSPreOrder());
		System.out.println(tree.DFSPostOrder());
		System.out.println(tree.DFSInOrder());
		
		}

}
