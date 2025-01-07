package com.rahul.kumar.Module7Day55_Tree5_Problems;

public class Demo {

	public static void connect(TreeNode2 root) {
        if (root == null) return;
        
        Queue<TreeNode2> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode2 prev = null;
            
            for (int i = 0; i < size; i++) {
                TreeNode2 node = queue.poll();
                
                if (prev != null) {
                    prev.next = node;
                }
                prev = node;
                
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    public static void printNextPointers(TreeNode2 root) {
        Queue<TreeNode2> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode2 node = queue.poll();
                System.out.print(node.val + " -> ");
                if (node.next != null) {
                    System.out.print(node.next.val + " ");
                } else {
                    System.out.print("NULL ");
                }
                
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            System.out.println();
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
        printNextPointers(root);
    }
}
