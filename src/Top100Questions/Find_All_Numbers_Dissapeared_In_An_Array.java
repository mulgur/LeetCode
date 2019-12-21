package Top100Questions;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Dissapeared_In_An_Array {
	/*
	 * 448. Find All Numbers Disappeared in an Array Given an array of integers
	 * where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others
	 * appear once.
	 * 
	 * Find all the elements of [1, n] inclusive that do not appear in this array.
	 * 
	 * Could you do it without extra space and in O(n) runtime? You may assume the
	 * returned list does not count as extra space.
	 * 
	 * Example:
	 * 
	 * Input: [4,3,2,7,8,2,3,1]
	 * Output: [5,6]
	 */
//	public static List<Integer> findDisappearedNumbers(int[] nums) {
//		List<Integer> dissapearedNum = new ArrayList<>();
//		for (int i = 1; i <= nums.length; i++) {
//			dissapearedNum.add(i);
//		}
//		for (int i = 0; i < nums.length; i++) {
//			if (dissapearedNum.contains(nums[i]))
//				dissapearedNum.remove(dissapearedNum.indexOf(nums[i]));
//		}
//		return dissapearedNum;
//	}
	/*
	 * The idea is simple, if nums[i] != i + 1 and nums[i] != nums[nums[i] - 1], then we swap nums[i] with nums[nums[i] - 1], for example, nums[0] = 4 and nums[3] = 7, then we swap nums[0] with nums[3]. So In the end the array will be sorted and if nums[i] != i + 1, then i + 1 is missing.
The example run as follows

[4,3,2,7,8,2,3,1]
[7,3,2,4,8,2,3,1]
[3,3,2,4,8,2,7,1]
[2,3,3,4,8,2,7,1]
[3,2,3,4,8,2,7,1]
[3,2,3,4,1,2,7,8]
[1,2,3,4,3,2,7,8]
	 */
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			while(nums[i] != i+1 && nums[i] != nums[nums[i]-1]) {
				int temp = nums[i];
				nums[i] = nums[temp-1];
				nums[temp-1] = temp;
			}
		}
		List<Integer> missing = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != i+1) {
				missing.add(i+1);
		}}
		return missing;
	}

	public static void main(String[] args) {
		
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));


	}

}
