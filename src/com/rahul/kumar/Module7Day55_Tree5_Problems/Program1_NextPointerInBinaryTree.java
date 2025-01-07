package com.rahul.kumar.Module7Day55_Tree5_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Program1_NextPointerInBinaryTree {
    public static void connect(TreeNode2 root) {
    	 HashMap<Integer, ArrayList<TreeNode2>> levels = new HashMap<>();
    	 Queue<Pair2> queue = new LinkedList<>();
    	 queue.add(new Pair2(root, 0));
    	 
    	 while (!queue.isEmpty()) {
             Pair2 p = queue.remove();
             TreeNode2 node = p.node;
             int depth = p.depth;
             
             if (!levels.containsKey(depth)) {
                 levels.put(depth, new ArrayList<>()); 
             }
             levels.get(depth).add(node);

             // Enqueue left child
             if (node.left != null) {
                 queue.add(new Pair2(node.left, depth + 1));
             }
             if (node.right != null) {
                 queue.add(new Pair2(node.right, depth + 1));
             }
         }
    	 for (int i = 0; i < levels.size(); i++) {
             ArrayList<TreeNode2> level = levels.get(i);
             for (int j = 0; j < level.size() - 1; j++) {
                 level.get(j).next = level.get(j + 1);
             }

         }
    }
    public static  void printLevels(TreeNode2 root) {
        if (root == null) return;

        Queue<TreeNode2> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode2 node = queue.poll();
                if (node.next != null) {
                    System.out.print(node.val + " -> ");
                } else {
                    System.out.print(node.val + " -> null ");
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            System.out.println(); // New line for the next level
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
        printLevels(root);
        
        // You can add code to print and verify the next pointers here
    }
}


