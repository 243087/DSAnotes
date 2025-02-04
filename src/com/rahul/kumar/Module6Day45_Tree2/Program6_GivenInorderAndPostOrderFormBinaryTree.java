package com.rahul.kumar.Module6Day45_Tree2;

import java.util.HashMap;

public class Program6_GivenInorderAndPostOrderFormBinaryTree {
	

    public static TreeNode buildTree(int[] A, int[] B) {
    	int n = A.length;
        int m = B.length;
        return buildingTheTree(A,0,n-1,B,0,m-1);
    }
    public static TreeNode buildingTheTree(int[] A, int inStart, int inEnd, int[] B, int poStart, int poEnd) {
        if (inStart > inEnd)
            return null;

        int value = B[poEnd];
        TreeNode root = new TreeNode(value);
        int index = search(A, value);

        int count = inEnd - index;

        root.left = buildingTheTree(A, inStart, index - 1, B, poStart, poEnd - count - 1);
        root.right = buildingTheTree(A, index + 1, inEnd, B, poStart + count, poEnd - 1);
        return root;
    }
    public static int search(int[] A, int ele) {
        int ind = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == ele) {
                ind = i;
                break;
            }
        }
        return ind;
    }
    
    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = buildTree(inorder, postorder);

        printInorder(root);
    }
    public static void printInorder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.val + " ");
        printInorder(node.left);
        printInorder(node.right);
    }
}
