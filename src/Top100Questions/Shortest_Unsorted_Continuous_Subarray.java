package Top100Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Shortest_Unsorted_Continuous_Subarray {
	/*
	 * Given an integer array, you need to find one continuous subarray that if you
	 * only sort this subarray in ascending order, then the whole array will be
	 * sorted in ascending order, too.
	 * 
	 * You need to find the shortest such subarray and output its length.
	 * 
	 * Example 1: 
	 * Input: [2, 6, 4, 8, 10, 9, 15] 
	 * Output: 5 
	 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in
	 * ascending order. 
	 * 
	 * Note: Then length of the input array is in range [1,10,000]. 
	 * The input array may contain duplicates, so ascending order here
	 * means <=.
	 */
	static int counter = 0;

	public static int findUnsortedSubarray(int[] nums) {
		int start = -1;
		int finish = -2;
		int max = nums[0];
		int min = nums[nums.length-1];
		for (int i = 1; i < nums.length; i++) {
			min = Math.min(min, nums[nums.length-1-i]);
			max = Math.max(max, nums[i]);
			if(nums[i]<max) {
				finish = i;
			}
			if(nums[nums.length-1-i]>min) {
				start = nums.length-1-i;
			}
		}
		return finish-start+1;
		

	}
	
	public static int findUnsortedSubarray2(int[] nums) {
		int start = -2;
		int finish = -2;
		
		int[] sorted = nums.clone();
		Arrays.sort(sorted);
	
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=sorted[i]) {
				start =i;
				break;
			}
			}
		for (int i = nums.length-1; i >=0; i--) {
			if(nums[i]!=sorted[i]) {
				finish = i;
				break;
			}			
			
		}
		return finish-start+1;
		

	}

	public static void main(String[] args) {
		int[] arr = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(findUnsortedSubarray2(arr));

	}

}
