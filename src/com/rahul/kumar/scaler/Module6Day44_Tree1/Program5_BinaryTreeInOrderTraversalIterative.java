package com.rahul.kumar.scaler.Module6Day44_Tree1;

import java.util.Stack;

public class Program5_BinaryTreeInOrderTraversalIterative {

    static void printInOrder(ChildTreeNode node) {
        ChildTreeNode current = node; 
        Stack<ChildTreeNode> st = new Stack<>();

        while (current != null || !st.isEmpty()) {
            // Traverse to the left subtree
            if (current != null) {
                st.push(current);  // Push current node to the stack
                current = current.left;  // Move to the left child
            } else {
                // Process the node
                current = st.pop();
                System.out.print(current.value + " ");  // Print node value
                // Move to the right subtree
                current = current.right;
            }                                                                //             TC = O[N], SC = O[H]
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
	        printInOrder(root);
	    }
}
