package com.rahul.kumar.Module6Day38_Searching_BinarySearch2;

class Node {
    int value;
    Node next;

    // Constructor
    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Demo {

	/*
	 * I[] // inorder P[] // postorder
	 * 
	 * Treenode buildTree(iL,iR,pR) { if(iL>iR) return null int val = P[pR];
	 * Treenode root = new Treenode(val); idx = Search(I,val); // use HashMap here
	 * so that TC will be O[1] int count = iR-idx; root.left =
	 * buildTree(iL,idx-1,pR-count-1); root.right = buildTree(idx+1,iR,pR-1); return
	 * root
	 * 
	 * 
	 * 
	 * 
	 * main( I P E this I I this P P 11 Build HM with key val for inoeder de return
	 * buildtree O N I N t 3
	 */
}
