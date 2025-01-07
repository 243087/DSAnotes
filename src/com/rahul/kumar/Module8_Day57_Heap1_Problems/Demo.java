package com.rahul.kumar.Module8_Day57_Heap1_Problems;

public class Demo {
	 void swap( int[] A, int i1, int i2 ) {
	        int temp = A[i1];
	        A[i1] = A[i2];
	        A[i2] = temp;
	    }
	   
	    public void heapify( int[] A, int index ) {
	        int n = A.length;
	        int min_element;
	        while( (2*index+1) < n ) {  // left child exits and also present in the range
	            min_element = A[index];
	            min_element = Math.min( min_element, A[2*index+1] );
	            if( (2*index+2) < n) {
	                min_element = Math.min( min_element, A[2*index+2] );
	            }
	            if( min_element == A[index] ) { // parent itself is minimum..so no need to heapify()
	                break;
	            }
	            else if( min_element == A[2*index+1] ) {    // left child is minimum...so swap it with parent
	                swap( A, index, 2*index+1 );
	                index = 2*index+1;
	            }
	            else if( (2*index+2 < n) && (min_element == A[2*index+2] )) {  
	                // right child is minimum...so swap it with parent
	                swap( A, index, 2*index+2 );
	                index = 2*index+2;
	            }
	        }
	    }

	    public int[] buildHeap( int[] A ) {
	        // code here
	        int n = A.length;
	        // we have to start heapify() from last non-leaf node...So
	        // Last node of the tree's index = n-1
	        // last non-leaf node is the parent of the last node of tree.
	        // last non-leaf node's index(pi) = n-1-1/2  
	        for( int i= n-2/2; i>=0; i-- ) {
	            heapify( A, i );
	        }
	        return A;
	    }
}
