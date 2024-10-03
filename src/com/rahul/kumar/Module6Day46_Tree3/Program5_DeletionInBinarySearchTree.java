package com.rahul.kumar.Module6Day46_Tree3;

public class Program5_DeletionInBinarySearchTree {

	static TreeNode deleteKNode(TreeNode root, int value) {
		if(root==null)
			return null;
		if(root.val<value)
			root.right = deleteKNode(root.right,value);
		else if(root.val>value)
			root.left = deleteKNode(root.left,value);
		else {
			// this case occurs when root.val == value
			if(root.left==null && root.right==null)
				return null;
			if(root.right==null)
				return root.left;
			if(root.left==null)
				return root.right;
			
			// find largest node on the left of BST
			TreeNode largestNode = findLargestElement(root.left);
	//  once we get th	e largest node replace the value to the root node of BST		
			root.val = largestNode.val;
			root.left = deleteKNode(root.left,root.val);
		}
		return root;
	}
	static TreeNode findLargestElement(TreeNode root) {
		if(root==null)
			return root;
		TreeNode temp = root;
		while(temp.right!=null) {
			temp = temp.right;
		}
		return temp;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(4);
		root.right = new TreeNode(12);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(7);
		root.left.right.left = new TreeNode(6);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(15);
		root.right.right.left = new TreeNode(13);
		root.right.right.right = new TreeNode(17);
		
		int value = 8;
		
		TreeNode result = deleteKNode(root,value);
		System.out.println("Printing tree in form of preOrder");
		printNode(result);
	}
	static void printNode(TreeNode node) {
        if (node == null)
            return;
        
        System.out.print(node.val + " ");
        printNode(node.left);
        printNode(node.right);
    }
}
