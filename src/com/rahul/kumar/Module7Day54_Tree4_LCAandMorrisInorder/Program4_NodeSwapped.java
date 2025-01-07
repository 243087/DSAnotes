package com.rahul.kumar.Module7Day54_Tree4_LCAandMorrisInorder;

import java.util.ArrayList;
import java.util.Collections;

public class Program4_NodeSwapped {
    static ArrayList<Integer> recoverTree(TreeNode1 root) {
        ArrayList<Integer> inorderValues = new ArrayList<>();
        inOrder(root, inorderValues);
        ArrayList<Integer> sortedList = new ArrayList<>(inorderValues);
        Collections.sort(sortedList);
        int x = -Integer.MAX_VALUE;
        int y = -Integer.MAX_VALUE;
        boolean firstMismatchFound = false;
        
        for (int i = 0; i < inorderValues.size(); i++) {
            if (!inorderValues.get(i).equals(sortedList.get(i))) {
                if (!firstMismatchFound) {
                    x = inorderValues.get(i);
                    firstMismatchFound = true;
                } else {
                    y = inorderValues.get(i);
                    break;
                }
            }
        }                                     //       TC = Inorder Traversal = O[N] + Sorting the List = O[NlogN] +
                                              //       Finding the Swapped Nodes = O[N] + Recovering Nodes = O[N]
        recoverNodes(root, x, y);             //       Final will be ---> O[N]
        inorderValues.clear();    
        inOrder(root, inorderValues);         //       SC = Inorder Traversal List = O[N] + Sorted List = O[N] +Recursive Stack = O[logN] 
        return inorderValues;                 //       Final will be O[N]
    }

    static void inOrder(TreeNode1 root, ArrayList<Integer> al) {
        if (root == null) return;
        inOrder(root.left, al);
        al.add(root.val);
        inOrder(root.right, al);
    }

    static void recoverNodes(TreeNode1 root, int x, int y) {
        if (root == null) return;
        if (root.val == x) root.val = y;
        else if (root.val == y) root.val = x;
        recoverNodes(root.left, x, y);
        recoverNodes(root.right, x, y);
    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(8);
        root.left = new TreeNode1(3);
        root.right = new TreeNode1(10);
        root.left.left = new TreeNode1(1);
        root.left.right = new TreeNode1(14);
        root.left.right.left = new TreeNode1(4);
        root.left.right.right = new TreeNode1(7);
        root.right.right = new TreeNode1(6);
        root.right.right.left = new TreeNode1(13);
        
        ArrayList<Integer> afterRecovery = recoverTree(root);
        System.out.println(afterRecovery);
    }
}

