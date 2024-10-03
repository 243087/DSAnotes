package com.rahul.kumar.scaler.Module6Day44_Tree1;

import java.util.Stack;

public class Program6_BinaryTreePostOrderTraversalByIterative {

	  ChildTreeNode root;
	  Program6_BinaryTreePostOrderTraversalByIterative() {
	        root = null;
	    }
    static void printInOrder(ChildTreeNode node) {
        ChildTreeNode current = node; 
        Stack<ChildTreeNode> st = new Stack<>();

        while (current != null || !st.isEmpty()) {
            // Traverse to the left subtree
            if (current != null) {
                st.push(current);  // Push current node to the stack
                current = current.left;  // Move to the left child
            } else {
                current = st.pop();
                // Move to the right subtree
                current = current.right;
                System.out.print(current.value + " ");
            }                                                                //             TC = O[N], SC = O[H]
        }
    }
	  public static void main(String[] args) {
		  Program6_BinaryTreePostOrderTraversalByIterative tree = new Program6_BinaryTreePostOrderTraversalByIterative();
	        tree.root = new ChildTreeNode(1);
	        tree.root.left = new ChildTreeNode(2);
	        tree.root.right = new ChildTreeNode(3);
	        tree.root.left.left = new ChildTreeNode(4);
	        tree.root.left.right = new ChildTreeNode(5);
	        tree.root.left.right.left = new ChildTreeNode(7);
	        tree.root.right.right = new ChildTreeNode(6);
	        tree.root.right.right.left = new ChildTreeNode(8);
	        tree.root.right.right.right = new ChildTreeNode(9);

	        System.out.println("In-order traversal of binary tree is: ");
	        printInOrder(tree.root);
	    }
}
