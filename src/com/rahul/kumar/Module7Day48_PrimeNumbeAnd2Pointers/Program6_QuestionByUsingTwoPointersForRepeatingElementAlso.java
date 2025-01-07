package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

//< Question > : Find count of all the pairs in a sorted array whose sum is K. ( i != j )
public class Program6_QuestionByUsingTwoPointersForRepeatingElementAlso {

	static int countPairs(int []arr, int find) {
		int l = 0;
		int r = arr.length-1;
		long count = 0;
		long mod = 1000000007;
		while(l<r) {
			int total = arr[l]+arr[r];
			if(total>find)
				r--;
			else if(total<find)
				l++;
			else {

				if(arr[l] == arr[r]) {
					long dupCount = r-l + 1;
					count += (dupCount*(dupCount-1))/2;
				    break;
				}
				
				else {
					int leftCount =0;
					int rightCount =0;
					
					int x = arr[l];
					int y = arr[r];
					
					while(arr[l]==x) {
						leftCount++;
						l++;
					}
					while(arr[r]==y) {
						rightCount++;
						r--;
					}
					count +=  (long)(leftCount*rightCount);
				}
			}			
		}
		    count %= mod;                                           //          TC = O[N]       SC = O[1]
		    return (int)count;
	}
	public static void main(String[] args) {
		int[] arr = {3,3,3,5,7,7,7,7};
		int find = 10;
		System.out.println(countPairs(arr, find));
	}
}


//This is the case when we find a sum that's equal to B.
//What we have is a sorted array and the elements in the array does not necessarily be distinct.
//For eg: A = {1,1,2,2,4,4,4,6,6,7,7}  and B = 8.
//This is a sorted array and elements are not distinct. 
//When p1 is at 0th index and p2 is at 10th index. We have got a pair of (1, 7)  whose sum is 8.
//After finding a pair, our task is to move the pointers. How and where do we move?
//If we move p1 to the right, we have got another pair (1, 7).
//If we do not move p1 and move p2 to left, we have got the same pair again.
//if we move both, we have got the same pair again. 
//What we have seen is a same pair occurring 4 times. Why has this happened? Because we have
//non-distinct elements and so we may see multiple pairs of the same elements. 
//The best that we can do here is.. 
//Whenever we find a pair of left side element and right side element, keep a track of no. of times both left side element and right side element repeats in the array.
//Multiply and that would be the no. of pairs that can be formed with those two elements. Add that to the count.
//This is one case where the element at p1 and p2 are unequal.
//Another case is when the elements at p1 and p2 are equal.
//In our eg, if A[p1] and A[p2]  are 4 and (4,4) gives a sum 8. 
//We need to find out total no. of pairs with just 4. 
//If no. of 4's in the array is equal to N and we have to select a pair i.e., two 4's, then the no. of such combinations we can have is NC2 i.e., N*(N - 1)/2.
//Here we have three 4's. Total no. of pairs with just 4's are 3*2/2 = 3.
//If this case exists, after getting the no. of combinations and adding it to count, we need not have to move p1 and p2. 
//Our condition is to run the loop until p1 < p2. p2 has to move left to an element that's different than the element 4 or p1 has to move right to an element that's different than 4. In either case we violate the loop condition. So we can simply break out.