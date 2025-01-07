package com.rahul.kumar.Module7Day54_Tree4_LCAandMorrisInorder;

public class Program1_FindTheKthSmallestElementInBST_MorrisTraversal {

	static int kthSmallestElement(TreeNode1 root, int k) {
		int ans = -1;
		int count = 0;
		TreeNode1 curr = root;
		while(curr!=null) {
			if(curr.left==null) {
				count++;
				if(count==k)
					ans = curr.val;
				curr = curr.right;
			}
			else {
				TreeNode1 temp = curr.left;
				while(temp.right!=null && temp.right!=curr) {
					temp = temp.right;
				}
				if(temp.right==null) {
					temp.right = curr;
					curr = curr.left;
				}
				else {
					temp.right = null;
					count++;
					if(count==k)
						ans = curr.val;
					curr = curr.right;                                    //    TC = O[N]         SC = O[1]
				}
			}
		}
		return ans;
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
        
        int k = 3;
        System.out.println(kthSmallestElement(root,k));
        
	}
}
