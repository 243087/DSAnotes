package com.rahul.kumar.Module6Day46_Tree3;

public class Program7_CheckIfTheGivenBinaryTreeIsBSTorNot_Optimised {

      
      static boolean checkBST(TreeNode root,int minValue, int maxValue) {
    	  if(root==null)
    		   return true;
    	  if(root.val<=minValue || root.val>=maxValue) 
    		  return false;                                            //        TC = O[N]          SC = O[H]

    	  return checkBST(root.left,minValue,root.val) && checkBST(root.right,root.val,maxValue);
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
		
		System.out.println(checkBST(root,-Integer.MIN_VALUE,Integer.MAX_VALUE));
		
	}
}
