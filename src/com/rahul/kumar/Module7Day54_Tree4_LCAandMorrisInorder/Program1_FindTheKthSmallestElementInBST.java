package com.rahul.kumar.Module7Day54_Tree4_LCAandMorrisInorder;

import java.util.ArrayList;

public class Program1_FindTheKthSmallestElementInBST {

	static int kthSmallestElement(TreeNode1 root, int k) {
		ArrayList<Integer> al = new ArrayList<>();
		inOrderTraversal(root,al);
		return al.get(k-1);                                           //            TC = O[N]        SC = O[N]
	}
	static void inOrderTraversal(TreeNode1 root, ArrayList<Integer> al) {
		if(root==null)
			return;
		inOrderTraversal(root.left,al);
		al.add(root.val);
		inOrderTraversal(root.right,al);
	}
	public static void main(String[] args) {
        // Creating the BST as shown in the image

        TreeNode1 root = new TreeNode1(4);
        root.left = new TreeNode1(0);
        root.right = new TreeNode1(10);
        root.left.left = new TreeNode1(-1);
        root.left.right = new TreeNode1(3);
        root.right.left = new TreeNode1(7);
        root.right.right = new TreeNode1(15);
        root.right.left.left = new TreeNode1(6);
        root.right.left.right = new TreeNode1(9);
        root.right.right.right = new TreeNode1(20);
        root.right.right.right.left = new TreeNode1(19);
        root.right.right.right.right = new TreeNode1(25);
        
        int k = 5;
        System.out.println(kthSmallestElement(root,k));
        
	}
}
