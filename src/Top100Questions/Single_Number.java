package Top100Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Single_Number {
	/*
	 * Given a non-empty array of integers, every element appears twice except for
	 * one. Find that single one.
	 * 
	 * Note:
	 * 
	 * Your algorithm should have a linear runtime complexity. Could you implement
	 * it without using extra memory?
	 * 
	 * Example 1:
	 * 
	 * Input: [2,2,1] 
	 * Output: 1 
	 * 
	 * Example 2:
	 * 
	 * Input: [4,1,2,1,2] 
	 * Output: 4
	 */

	public static int singleNumber(int[] nums) {
		int result = 0;
		
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	

	}

	public static void main(String[] args) {
		int[] nums = {2,6,4,1,4,6,2};
		
		System.out.println(singleNumber(nums));

	}

}
