package com.rahul.kumar.Module7Day54_Tree4_LCAandMorrisInorder;

public class Program1_FindTheKthSmallestElementInBST_Optimised {

    static int count =0;
    static int ans = -1;
     
     static int kthSmallestElement(TreeNode1 root, int k) {
    	 inOrder(root,k);
         return ans;  	                                    //         TC = O[N]           General --> SC = O[H] 
     }                                                      //                        Best case when tree is balanced : O[logN]
     public static void inOrder(TreeNode1 A, int B){        //                        Worst case when tree is skewed : O[N]
         if(A==null)
             return;
         inOrder(A.left,B);
         count +=1;
         if(count==B)
            ans = A.val;
         inOrder(A.right,B);       
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
