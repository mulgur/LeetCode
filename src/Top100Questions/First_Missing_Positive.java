package Top100Questions;

public class First_Missing_Positive {
	/*
	 * Given an unsorted integer array, find the smallest missing positive integer.
	 * 
	 * Example 1:
	 * 
	 * Input: [1,2,0] Output: 3 Example 2:
	 * 
	 * Input: [3,4,-1,1] Output: 2 Example 3:
	 * 
	 * Input: [7,8,9,11,12] Output: 1 Note:
	 * 
	 * Your algorithm should run in O(n) time and uses constant extra space.
	 */

	public static int firstMissingPositive(int[] nums) {
		int i = 0;
		/*
		 * [2,5,6,4,2,3,8]
		 */
		while (i < nums.length) {
			if (nums[i] == i + 1 || nums[i] <= 0 || nums[i] > nums.length) {
				i++;
			} else if (nums[nums[i] - 1] != nums[i]) {
				int temp = nums[i];
				nums[i] = nums[temp - 1];
				nums[temp - 1] = temp;
			} else 
				i++;
		}
		i = 0;
		while(i<nums.length && nums[i]==i+1) {
			i++;
		}return i+1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 0 };
		int[] nums2 = { 3, 4, -1, 1 };
		int[] nums3 = { 7, 8, 9, 11, 12 };
		System.out.println(firstMissingPositive(nums2));
	}

}
