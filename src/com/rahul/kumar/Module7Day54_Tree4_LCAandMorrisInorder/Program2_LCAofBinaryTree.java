package com.rahul.kumar.Module7Day54_Tree4_LCAandMorrisInorder;

import java.util.ArrayList;

public class Program2_LCAofBinaryTree {

    static TreeNode1 LCA(TreeNode1 root, TreeNode1 B, TreeNode1 C) {
        ArrayList<TreeNode1> pathB = new ArrayList<>();
        ArrayList<TreeNode1> pathC = new ArrayList<>();

        // Find paths to both nodes B and C
        if (!findPath(root, B, pathB) || !findPath(root, C, pathC)) {
            // If one of the nodes is not present in the tree, return null
            return null;
        }

        TreeNode1 temp = null;

        // Compare paths from the start (root)
        int i = 0, j = 0;
        while (i < pathB.size() && j < pathC.size()) {
            if (pathB.get(i) == pathC.get(j))
                temp = pathB.get(i);  // Keep updating the LCA as long as they are equal
            else
                break;
                
            i++;
            j++;
        }

        return temp;
    }

    static boolean findPath(TreeNode1 root, TreeNode1 target, ArrayList<TreeNode1> path) {
        if (root == null) 
            return false;

        path.add(root);

        // If the target node is found, return true
        if (root == target) {
            return true;
        }

        // Check in the left subtree or right subtree
        if (findPath(root.left, target, path) || findPath(root.right, target, path)) {
            return true;
        }

        // If the target is not in either subtree, remove the current node from the path
        path.remove(path.size() - 1);
        return false;
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

        TreeNode1 B = root.right.left.left.left; // Node 21
        TreeNode1 C = root.right.left.right.right; // Node 6

        TreeNode1 result = LCA(root, B, C);
        if (result != null) {
            System.out.println("LCA of " + B.val + " and " + C.val + " is " + result.val);
        } else {
            System.out.println("No LCA found");
        }

    }
}