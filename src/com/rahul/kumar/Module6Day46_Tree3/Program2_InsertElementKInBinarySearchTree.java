package com.rahul.kumar.Module6Day46_Tree3;

public class Program2_InsertElementKInBinarySearchTree {

	static TreeNode insertElement(TreeNode root, int value) {
		if(root==null)
			return new TreeNode(value);
		
		if(root.val<value)
			 root.right = insertElement(root.right,value);
		else
			root.left = insertElement(root.left,value);
		
		return root;                                            //           TC = O[H]          SC = O[H]
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		
		int value = 7;
		TreeNode node =insertElement(root,value);
		 System.out.print("In-order traversal of the updated BST: ");
	     printNode(node);
	}
	static void printNode(TreeNode node) {
        if (node == null)
            return;
        
        printNode(node.left);
        System.out.print(node.val + " ");
        printNode(node.right);
    }
}
