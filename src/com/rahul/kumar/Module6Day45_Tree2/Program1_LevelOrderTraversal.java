package com.rahul.kumar.Module6Day45_Tree2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class Program1_LevelOrderTraversal {                                //          TC = O[N]        SC = O[N]
	public static void levelOrder(TreeNode root) {
        // HashMap to store nodes at each depth level
        HashMap<Integer, ArrayList<Integer>> levels = new HashMap<>();
        
        // Initialize queue to store node and its depth
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root,0));

        int maxDepth = 0;
        
        while (!queue.isEmpty()) {
            Pair p = queue.remove();
            TreeNode node = p.node;
            int depth = p.depth;

            // Update max depth encountered
            maxDepth =depth;
            
            if (!levels.containsKey(depth)) {
                levels.put(depth, new ArrayList<>()); 
            }
            levels.get(depth).add(node.val);

            // Enqueue left child
            if (node.left != null) {
                queue.add(new Pair(node.left, depth + 1));
            }

            // Enqueue right child
            if (node.right != null) {
                queue.add(new Pair(node.right, depth + 1));
            }
        }

        // Print out the nodes level by level
        for (int i = 0; i <= maxDepth; i++) {
            ArrayList<Integer> al = levels.get(i);
            System.out.println(al);                                  //            TC = O[N]      SC = O[N]
        }
    }

    public static void main(String[] args) {
        // Creating the binary tree shown in the image
    	TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(11);
        root.right.right = new TreeNode(19);
        root.left.left.left = new TreeNode(7);
        root.left.right.left = new TreeNode(25);
        root.left.right.right = new TreeNode(-3);
        root.right.right.right = new TreeNode(45);

        // Perform level-order traversal
        levelOrder(root);
    }
}
