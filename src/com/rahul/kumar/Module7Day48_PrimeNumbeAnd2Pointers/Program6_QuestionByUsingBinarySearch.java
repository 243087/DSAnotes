package com.rahul.kumar.Module7Day48_PrimeNumbeAnd2Pointers;

//< Question > : Find count of all the pairs in a sorted array whose sum is K. ( i != j )
public class Program6_QuestionByUsingBinarySearch {

	static int countPairs(int[] arr, int find) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			int need = find - a;

			total += binarySearch(arr, need, i + 1, arr.length - 1);

		}
		return total;                                                //            TC = O[NlogN]
	}

	static int binarySearch(int[] arr, int need, int l, int r) {
		int count = 0;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == need) {
				count++;
				int left = mid - 1;
				int right = mid + 1;

				// Check for duplicates on the left side
				while (left >= l && arr[left] == need) {
					count++;
					left--;
				}
				// Check for duplicates on the right side
				while (right <= r && arr[right] == need) {
					count++;
					right++;
				}
				return count;
			}
			if (arr[mid] < need)
				l = mid + 1;
			else
				r = mid - 1;

		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 4, 5, 6, 6, 6, 7, 10 };
		int find = 10;
		System.out.println(countPairs(arr, find));
	}
}
