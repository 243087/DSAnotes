package com.rahul.kumar.scaler.Module6Day46_Tree3;

import java.util.ArrayList;

public class Program7_CheckIfTheGivenBinaryTreeIsBSTorNot {

	static boolean isBST(TreeNode root) {
		ArrayList<Integer>  al = new ArrayList<>();
		inOrderTraversal(root,al);
		return isSorted(al);
	}
	static void inOrderTraversal(TreeNode root, ArrayList<Integer> al) {
		if(root==null)
			return;
		inOrderTraversal(root.left,al);
		al.add(root.val);
		inOrderTraversal(root.right,al);
	}
	static boolean isSorted(ArrayList<Integer> al) {
		for(int i=1;i<al.size();i++) {
			if(al.get(i)<=al.get(i-1))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(19);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(8);
		root.left.right.right = new TreeNode(9);
		root.right.right = new TreeNode(25);
		root.right.right.left = new TreeNode(22);
		root.right.right.right = new TreeNode(30);
		
		if(isBST(root))
			System.out.println("Yes it is BST");
		else
			System.out.println("No it is not BST");
	}
}
