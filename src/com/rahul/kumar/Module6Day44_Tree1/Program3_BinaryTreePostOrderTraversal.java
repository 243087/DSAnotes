package com.rahul.kumar.Module6Day44_Tree1;

public class Program3_BinaryTreePostOrderTraversal {

	ChildTreeNode root;
	Program3_BinaryTreePostOrderTraversal(){
		root = null;
	}
	
	static void printInOrder(ChildTreeNode node) {
		if (node == null)
            return;
		printInOrder(node.left);
		printInOrder(node.right);
		System.out.print(node.value+" ");                            //           TC = O[N]            SC = O[H]
	}
	public static void main(String[] args) {
		Program3_BinaryTreePostOrderTraversal  tree = new Program3_BinaryTreePostOrderTraversal();
		tree.root = new ChildTreeNode(1);
		tree.root.left = new ChildTreeNode(2);
		tree.root.right = new ChildTreeNode(3);
		tree.root.left.left = new ChildTreeNode(4);
		tree.root.left.right = new ChildTreeNode(5);
		tree.root.left.right.left = new ChildTreeNode(7);
		tree.root.right.right = new ChildTreeNode(6);
		tree.root.right.right.left = new ChildTreeNode(8);
		tree.root.right.right.right = new ChildTreeNode(9);
		
		System.out.println("Preorder traversal of binary tree is: ");
        tree.printInOrder(tree.root);
	}
}
