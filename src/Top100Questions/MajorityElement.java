package Top100Questions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	/*
	 * Given an array of size n, find the majority element. The majority element is
	 * the element that appears more than ⌊ n/2 ⌋ times.
	 * 
	 * You may assume that the array is non-empty and the majority element always
	 * exist in the array.
	 * 
	 * Example 1:
	 * 
	 * Input: [3,2,3] 
	 * Output: 3 
	 * 
	 * Example 2:
	 * 
	 * Input: [2,2,1,1,1,2,2] 
	 * Output: 2
	 */

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,2};
//		int[] nums2 = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
//		System.out.println(majorityElement(nums2));
}

//	public static int majorityElement(int[] nums) {
//		if (nums.length == 1) {
//			return nums[0];
//		}
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i : nums) {
//			if (map.containsKey(i) && map.get(i) + 1 > nums.length) {
//				return i;
//			} else {
//				map.put(i, map.getOrDefault(i, 0) + 1);
//			}
//		}
//		return -1;
//	}
	
	public static int majorityElement(int[] nums) {
		int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
	}

}
//public static int majorityElement(int[] nums) {
//	int majority = 0;
//	Map<Integer, Integer> map = new HashMap<>();
//
//	for (int i = 0; i < nums.length; i++) {
//		if (!map.containsKey(nums[i])) {
//			map.put(nums[i], 1);
//		} else {
//			map.put(nums[i], map.get(nums[i]) + 1);
//		}
//	}
//
//	for (Entry<Integer, Integer> each : map.entrySet()) {
//		if (each.getValue() > (nums.length) / 2) {
//			majority = each.getKey().intValue();
//			break;
//		}
//	}
//	return majority;
//}
