package com.rahul.kumar.Module7Day54_Tree4_LCAandMorrisInorder;

public class Program3_LCAofBinarySearchTree {

	static TreeNode1 LCAofBST(TreeNode1 root,int B,int C) {
		if(root==null)
			return null;
		while(root!=null) {
			int val = root.val;
			if(val>B && val>C)
				root = root.left;
			else if(val<B && val<C)
				root = root.right;
			else
				return root;                                          //          TC = O[H]      SC = O[1]
		}
		return null;
	}
	public static void main(String[] args) {
		TreeNode1 root = new TreeNode1(8);
		root.left = new TreeNode1(3);
		root.right = new TreeNode1(10);
		root.left.left = new TreeNode1(1);
		root.left.right = new TreeNode1(6);
		root.left.right.left = new TreeNode1(4);
		root.left.right.right = new TreeNode1(7);
		root.right.right = new TreeNode1(14);
		root.right.right.left = new TreeNode1(13);
		
		int B = 14;
		int C = 1;
		TreeNode1 result = LCAofBST(root,B,C);
		System.out.println(result.val);
	}
}
