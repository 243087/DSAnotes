package com.rahul.kumar.Module6Day44_Tree1;

public class Program7_EqualPartitionOfBinaryTree {

	static long sum(ChildTreeNode root) {
		if(root==null)
			return 0;
		
		return sum(root.left)+sum(root.right)+root.value;
	}
	static int checkEqualPartition(ChildTreeNode root) {
		long total = sum(root);
		if(total%2==1)
			return 0;
		
		long need = total/2;
		
		if(hasEqualSum(root,need)==1)
			return 1;
		
		return 0;
	}
	static int hasEqualSum(ChildTreeNode root, long need) {
		if(root==null)
			return 0;
		
		long leftSum = sum(root.left);
		if(leftSum==need)
			return 1;
		
		long rightSum = sum(root.right);
		if(rightSum==need)
			return 1;
		
		if(hasEqualSum(root.left,need)==1 || hasEqualSum(root.right,need)==1)
			return 1;
		
		return 0;
	}
	public static void main(String[] args) {
		ChildTreeNode root = new ChildTreeNode(5);
		root.left = new ChildTreeNode(3);
		root.right = new ChildTreeNode(7);
		root.left.left = new ChildTreeNode(4);
		root.left.right = new ChildTreeNode(2);
		root.right.left = new ChildTreeNode(6);
		root.right.right = new ChildTreeNode(1);
		
		System.out.println(checkEqualPartition(root));
	}
}
