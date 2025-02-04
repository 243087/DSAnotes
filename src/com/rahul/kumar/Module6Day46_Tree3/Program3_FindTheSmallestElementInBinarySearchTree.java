package com.rahul.kumar.Module6Day46_Tree3;

public class Program3_FindTheSmallestElementInBinarySearchTree {

	static int smallestElement(TreeNode root) {
		if(root==null)
			return Integer.MAX_VALUE;
		
		TreeNode temp = root;
		while(temp.left!=null) {
			temp = temp.left;
		}
		return temp.val;                                       //           TC = O[N]       SC = O[1]
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		
		System.out.println(smallestElement(root));
	}
}
