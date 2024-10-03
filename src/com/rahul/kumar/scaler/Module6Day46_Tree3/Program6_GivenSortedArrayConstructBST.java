package com.rahul.kumar.scaler.Module6Day46_Tree3;

public class Program6_GivenSortedArrayConstructBST {

	static TreeNode formBST(int []arr) {
		TreeNode root = null;
		for(int i=0;i<arr.length;i++) {
			root = insertElement(root,arr[i]);
		}
		return root;                                   //             TC = O[N^2]
	}
	static TreeNode insertElement(TreeNode root, int num) {
		if(root==null)
			return new TreeNode(num);
		if(root.val<num)
			root.right = insertElement(root.right,num);
		else
			root.left = insertElement(root.left,num);
		return root;
	}
	public static void main(String[] args) {
		int []arr = {-1,3,4,6,7,8,10,13,14};
		TreeNode result = formBST(arr);
		printTree(result);
	}
	static void printTree(TreeNode node) {
		if(node==null)
			return;

		printTree(node.left);
		System.out.println(node.val);
		printTree(node.right);
	}
}
