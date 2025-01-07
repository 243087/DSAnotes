package com.rahul.kumar.Module7Day55_Tree5_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Program4_FindTheTopViewOfBinaryTree {

	 public static ArrayList<Integer> topView(TreeNode2 A) {
	        int minCol = Integer.MAX_VALUE;
	        int maxCol = -Integer.MAX_VALUE;

	        HashMap<Integer,Integer> levels = new HashMap<>();
	        Queue<Pair1> queue = new LinkedList<>();
	        queue.add(new Pair1(A,0));
	        
	        while(!queue.isEmpty()){
	            Pair1 p = queue.remove();
	            TreeNode2 node = p.node;
	            int col = p.col;

	            if (!levels.containsKey(col)) {
	                levels.put(col,node.val); 
	            }

	            minCol = Math.min(minCol,col);
	            maxCol = Math.max(maxCol,col);

	            if(node.left!=null)
	               queue.add(new Pair1(node.left,col-1));

	            if(node.right!=null)
	               queue.add(new Pair1(node.right,col+1));   

	        }
	         ArrayList<Integer> ans = new ArrayList<>();
	         for(int i=minCol;i<=maxCol;i++){
	             ans.add(levels.get(i));
	         }
	         return ans;
	    }
	public static void main(String[] args) {
		TreeNode2 root = new TreeNode2(1);
		root.left = new TreeNode2(2);
		root.right = new TreeNode2(3);
		root.left.left = new TreeNode2(5);
		root.left.left.left = new TreeNode2(6);
		root.left.left.left.right = new TreeNode2(14);
		root.left.left.left.right.right = new TreeNode2(15);
		root.left.left.left.right.right.right = new TreeNode2(16);
		root.left.left.left.right.left = new TreeNode2(30);
		root.left.right = new TreeNode2(8);
		root.right.left = new TreeNode2(10);
		root.right.left.left = new TreeNode2(9);
		root.right.left.right = new TreeNode2(7);
		root.right.left.right.right = new TreeNode2(11);
		root.right.left.right.right.right = new TreeNode2(20);
		root.right.right = new TreeNode2(13);
		root.right.right.left = new TreeNode2(4);
		root.right.right.left.left = new TreeNode2(12);
		
		ArrayList<Integer> result = topView(root);
		System.out.println(result);
	}
}
