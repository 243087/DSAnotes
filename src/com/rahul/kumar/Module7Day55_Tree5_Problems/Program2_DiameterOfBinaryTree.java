package com.rahul.kumar.Module7Day55_Tree5_Problems;

public class Program2_DiameterOfBinaryTree {

	static int diameter = 0;
	static int findDiameter(TreeNode2 root) {
		getHeight(root);
		return diameter;
	}
	static int getHeight(TreeNode2 root) {
		if(root==null)
			return -1;
		int leftHeight = getHeight(root.left);
		int rghtHeight = getHeight(root.right);
		
		diameter = Math.max(diameter,leftHeight+rghtHeight+2);
		return Math.max(leftHeight,rghtHeight)+1;                 //         TC = O[N]      SC = O[H]
	}
	public static void main(String[] args) {
		TreeNode2 root = new TreeNode2(1);
		root.left = new TreeNode2(2);
		root.left.left = new TreeNode2(4);
		root.left.right = new TreeNode2(5);
		root.left.left.left = new TreeNode2(6);
		root.left.left.right = new TreeNode2(7);
		root.left.right.right = new TreeNode2(3);
		
		System.out.println(findDiameter(root));
	}
}
