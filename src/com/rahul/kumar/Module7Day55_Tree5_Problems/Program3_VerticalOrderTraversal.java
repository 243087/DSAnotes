package com.rahul.kumar.Module7Day55_Tree5_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import com.rahul.kumar.Module6Day45_Tree2.Pair;

public class Program3_VerticalOrderTraversal {

	static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode2 A) {
		int minCol = Integer.MAX_VALUE;
        int maxCol = -Integer.MAX_VALUE;

        HashMap<Integer, ArrayList<Integer>> levels = new HashMap<>();
        Queue<Pair1> queue = new LinkedList<>();
        queue.add(new Pair1(A,0));
        
        while(!queue.isEmpty()){
            Pair1 p = queue.remove();
            TreeNode2 node = p.node;
            int col = p.col;

            if (!levels.containsKey(col)) {
                levels.put(col, new ArrayList<>()); 
            }
            levels.get(col).add(node.val);

            minCol = Math.min(minCol,col);
            maxCol = Math.max(maxCol,col);

            if(node.left!=null)
               queue.add(new Pair1(node.left,col-1));

            if(node.right!=null)
               queue.add(new Pair1(node.right,col+1));   

        }
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         for(int i=minCol;i<=maxCol;i++){
             ans.add(levels.get(i));
         }
         return ans;                                        //              TC = O[N]           SC = O[N]

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
		root.left.right = new TreeNode2(8);
		root.right.left = new TreeNode2(10);
		root.right.left.left = new TreeNode2(9);
		root.right.left.right = new TreeNode2(7);
		root.right.left.right.right = new TreeNode2(11);
		root.right.right = new TreeNode2(13);
		root.right.right.left = new TreeNode2(4);
		root.right.right.left.left = new TreeNode2(12);
		
		ArrayList<ArrayList<Integer>> result = verticalOrderTraversal(root);
		System.out.println(result);
	}
}
