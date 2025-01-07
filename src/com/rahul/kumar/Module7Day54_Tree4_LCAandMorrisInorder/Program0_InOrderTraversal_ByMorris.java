package com.rahul.kumar.Module7Day54_Tree4_LCAandMorrisInorder;

public class Program0_InOrderTraversal_ByMorris {

	static void morrisTraversal(TreeNode1 root) {
		TreeNode1 curr = root;
		while(curr!=null) {
			if(curr.left==null) {
				System.out.print(curr.val+" ");
				curr = curr.right;
			}
			else {
				TreeNode1 temp = curr.left;
				while(temp.right!=null && temp.right!=curr)
					temp = temp.right;
				if(temp.right==null) {
					temp.right=curr;
					curr = curr.left;
				}
				else {
					temp.right = null;
					System.out.print(curr.val+" ");
					curr = curr.right;                                //            TC = O[N]          SC = O[1]
				}
			}
		}
	}
	public static void main(String[] args) {
		 TreeNode1 root = new TreeNode1(6);
		 root.right = new TreeNode1(8);
		 root.right.right = new TreeNode1(29);
		 root.right.right.left = new TreeNode1(20);
		 root.right.right.right = new TreeNode1(32);
		 root.right.right.left.left = new TreeNode1(47);
		 root.right.right.left.right = new TreeNode1(13);
		 root.right.right.left.left.left = new TreeNode1(9);
		 root.right.right.left.left.right = new TreeNode1(17);
		 root.right.right.left.left.left.right = new TreeNode1(10);
		 root.right.right.left.left.right.right = new TreeNode1(19);
		 root.right.right.left.left.right.right.left = new TreeNode1(100);
		 root.right.right.left.right.right = new TreeNode1(25);
		 root.right.right.right.left = new TreeNode1(30);
		 root.right.right.right.right = new TreeNode1(35);
		 
		 morrisTraversal(root);
	}
}
