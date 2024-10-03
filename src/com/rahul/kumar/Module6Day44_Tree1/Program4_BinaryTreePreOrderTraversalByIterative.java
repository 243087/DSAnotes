package com.rahul.kumar.Module6Day44_Tree1;

import java.util.Stack;

public class Program4_BinaryTreePreOrderTraversalByIterative {

	static void printPreOrder(ChildTreeNode node) {
		ChildTreeNode current = node;                                 //           TC = O[N]            SC = O[H]
		Stack<ChildTreeNode> st = new Stack<>();
		
		while(current!=null || !st.isEmpty()) {
			if(current!=null) {
				System.out.println(current.value);
				st.push(current);
				current = current.left;
			}
			else {
				current = st.pop();
				current = current.right;
			}
		}
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
        printPreOrder(root);
	}
}
