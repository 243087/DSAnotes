package com.rahul.kumar.Module6Day46_Tree3;

public class Program6_GivenSortedArrayConstructBSTOptimised {

	static TreeNode constructBST(int[] A) {
		TreeNode node = buildBST(A, 0, A.length - 1);
		return node;
	}
	
	public static TreeNode buildBST(int[] A, int l, int r) {
		if (l > r)
			return null;
		int mid = l + (r - l) / 2;
		TreeNode root = new TreeNode(A[mid]);
		root.left = buildBST(A, l, mid - 1);
		root.right = buildBST(A, mid + 1, r);
		return root;                                      //               TC = O[N]           SC = O[logN]
	}

	public static void main(String[] args) {
		int[] arr = { -1, 3, 4, 6, 7, 8, 10, 13, 14 };
		TreeNode result = constructBST(arr);
		printTree(result);
	}

	static void printTree(TreeNode node) {
		if (node == null)
			return;

		printTree(node.left);
		System.out.println(node.val);
		printTree(node.right);
	}
}
