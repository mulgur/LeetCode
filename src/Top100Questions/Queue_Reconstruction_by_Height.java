package Top100Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Queue_Reconstruction_by_Height {
	/*
	 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), 
	 * where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. 
	 * Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

 
Example

Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
	 */
	 public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] == a[0] ? a[1] - b[1] : b[0] - a[0];
			}
		});
		List<int[]> res = new ArrayList<>();
		for (int[] person : people) {
			res.add(person[1], person);
		}
		return res.toArray(new int[0][0]);
	        	
	    }

	public static void main(String[] args) {
	

	}

}
