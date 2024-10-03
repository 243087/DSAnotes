package com.rahul.kumar.scaler.Module6Day45_Tree2;

public class Program4_FindTheMaxHeightOfTree {

	static int getMaxHeightOfTree(TreeNode root) {
		if(root==null)
			return -1;
		
		int leftHeight = getMaxHeightOfTree(root.left);
		int rightHeight = getMaxHeightOfTree(root.right);
		
		return Math.max(leftHeight, rightHeight) +1;
	}
	  public static void main(String[] args) {
	        // Creating the binary tree shown in the image
	    	TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
            root.right.left = new TreeNode(5);
            root.right.right = new TreeNode(6);
            root.left.left.left = new TreeNode(9);
            root.left.left.right = new TreeNode(10);
            root.right.left.left = new TreeNode(7);
            root.right.left.right = new TreeNode(8);
            root.right.left.left.left = new TreeNode(11);
            root.right.left.left.right = new TreeNode(12);

	        System.out.println(getMaxHeightOfTree(root));
	    }
}
