package com.rahul.kumar.scaler.Module6Day44_Tree1;

public class Program1_BinaryTreePreOrderTraversal {
	
	static void printPreorder(ChildTreeNode node) {
		if (node == null)
            return;
		System.out.println(node.value);
		printPreorder(node.left);
		printPreorder(node.right);                                  //           TC = O[N]            SC = O[H]
	}
	public static void main(String[] args) {
		ChildTreeNode  root = new ChildTreeNode(1);
	//	tree.root = new ChildTreeNode(1);
		root.left = new ChildTreeNode(2);
		root.right = new ChildTreeNode(3);
		root.left.left = new ChildTreeNode(4);
		root.left.right = new ChildTreeNode(5);
		root.left.right.left = new ChildTreeNode(7);
		root.right.right = new ChildTreeNode(6);
		root.right.right.left = new ChildTreeNode(8);
		root.right.right.right = new ChildTreeNode(9);
		
		System.out.println("Preorder traversal of binary tree is: ");
        printPreorder(root);
	}
}
