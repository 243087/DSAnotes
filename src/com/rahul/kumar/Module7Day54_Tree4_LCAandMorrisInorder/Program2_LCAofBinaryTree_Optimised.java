package com.rahul.kumar.Module7Day54_Tree4_LCAandMorrisInorder;

public class Program2_LCAofBinaryTree_Optimised {

	static TreeNode1 LCA(TreeNode1 root, int B, int C) {
		if(root==null)
			return null;
		if(root.val==B || root.val==C)
			return root;
		
		TreeNode1 leftNode = LCA(root.left,B,C);
		TreeNode1 rightNode = LCA(root.right,B,C);
		
		if(leftNode!=null && rightNode!=null)
			return root;
		else if(leftNode!=null)
			return leftNode;
		else
			return rightNode;                                        //            TC = O[N]          SC = O[H] 
	}
	public static void main(String[] args) {

        TreeNode1 root = new TreeNode1(3);
        root.left = new TreeNode1(7);
        root.right = new TreeNode1(4);
        root.left.left = new TreeNode1(9);
        root.left.left.left = new TreeNode1(12);
        root.left.left.right = new TreeNode1(19);
        root.right.left = new TreeNode1(14);
        root.right.right = new TreeNode1(18);
        root.right.left.left = new TreeNode1(15);
        root.right.left.right = new TreeNode1(1);
        root.right.left.left.left = new TreeNode1(21);
        root.right.left.left.right = new TreeNode1(2);
        root.right.left.right.right = new TreeNode1(6);
        root.right.right.right = new TreeNode1(25);

        int B = 21;
        int C = 6; 

        TreeNode1 result = LCA(root,B,C);  
        System.out.println(result.val);
	}
}
