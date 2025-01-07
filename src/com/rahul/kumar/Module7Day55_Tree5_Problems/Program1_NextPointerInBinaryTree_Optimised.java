package com.rahul.kumar.Module7Day55_Tree5_Problems;

// Given a binary tree initially with all next pointers set to NULL.
// Modify the tree in-place to connect each node's next pointer to the next node in the same level from left to right
public class Program1_NextPointerInBinaryTree_Optimised {

	 public static void connect(TreeNode2 root) {
	        TreeNode2 curr = root;
	        TreeNode2 dummy = new TreeNode2(-1);
	        TreeNode2 temp = dummy;

	        while(curr!=null){
	            if(curr.left!=null){
	                temp.next = curr.left;
	                temp = temp.next;
	            }
	            if(curr.right!=null){
	                temp.next = curr.right;
	                temp = temp.next;
	            }
	            curr = curr.next;
	            if(curr==null){
	                curr = dummy.next;
	                dummy.next = null;
	                temp = dummy;
	            }                                                          //           TC = O[N]         SC = O[1]
	        }
	    }
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.right = new TreeNode2(3);
        root.left.left = new TreeNode2(4);
        root.left.right = new TreeNode2(5);
        root.right.left = new TreeNode2(6);
        root.right.right = new TreeNode2(7);
        
        connect(root);

    }
}
