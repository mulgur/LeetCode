package Top100Questions;

import java.util.Arrays;

public class Move_Zeros {
	/*
	 * Given an array nums, write a function to move all 0's to the end of it while
	 * maintaining the relative order of the non-zero elements.
	 * 
	 * Example:
	 * 
	 * Input: [0,1,0,3,12] [1,0,0,3,12] [1,3,0,0,12] [1,3,12,0,0] 
	 * Output: [1,3,12,0,0] 
	 * 
	 * Note:
	 * 
	 * You must do this in-place without making a copy of the array. 
	 * Minimize the total number of operations.
	 */
	
	 public static void moveZeroes(int[] nums) {
		 int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				nums[index++]=nums[i];
			}
		}
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
		

		System.out.print(Arrays.toString(nums));

	    }

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);

	}

}