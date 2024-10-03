package com.rahul.kumar.Module6Day44_Tree1;

public class Program7_Assignment3 {

	static int printPath(ChildTreeNode root, int sum) {
		if(root==null)
			return 0;
		sum = sum - root.value;
		
		if(root.left==null && root.right==null) {
			if(sum==0)
				return 1;
			else
				return 0;
		}
		if(printPath(root.left,sum)==1)
			return 1;
		if(printPath(root.right,sum)==1)
			return 1;
		
		return 0;
	}
	public static void main(String[] args) {

		ChildTreeNode root = new ChildTreeNode(5);
		root.left = new ChildTreeNode(4);
		root.right = new ChildTreeNode(8);
		root.left.left = new ChildTreeNode(11);
		root.left.left.left = new ChildTreeNode(7);
		root.left.left.right = new ChildTreeNode(2);
		root.right.left = new ChildTreeNode(13);
		root.right.right = new ChildTreeNode(4);
		root.right.right.right = new ChildTreeNode(1);
		
		
		int sum = 22;
        System.out.println(printPath(root,sum));
	}
}
