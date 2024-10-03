package com.rahul.kumar.scaler.Module6Day46_Tree3;

// Search an element K in Binary Search Tree.
public class Program1_SearchElementKInBinarySearchTree {
	static boolean searchK(TreeNode root,int value) {
		if(root==null)
			return false;
		if(root.val==value)
			return true;
		
		if(root.val<value)
			return searchK(root.right,value);
		else
			return searchK(root.left,value);
	}
                                                       //           TC = O[H]          SC = O[H]
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		 root.left = new TreeNode(0);
		 root.right = new TreeNode(10);
		 root.left.left = new TreeNode(-1);
		 root.left.right = new TreeNode(3);
		 root.right.left = new TreeNode(7);
		 root.right.right = new TreeNode(15);
		 root.right.left.left = new TreeNode(6);
		 root.right.left.right = new TreeNode(9);
		 
		 int value = 9;
		 
		 System.out.println(searchK(root,value));
	}
}
