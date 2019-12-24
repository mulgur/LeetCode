package Top100Questions;

public class Climbing_Stairs {
	/*
	 * You are climbing a stair case. It takes n steps to reach to the top.

	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

	Note: Given n will be a positive integer.

	Example 1:
	Input: 2
	Output: 2
	Explanation: There are two ways to climb to the top.
	1. 1 step + 1 step
	2. 2 steps
	
	
	Example 2:
	Input: 3
	Output: 3
	Explanation: There are three ways to climb to the top.
	1. 1 step + 1 step + 1 step
	2. 1 step + 2 steps
	3. 2 steps + 1 step
	
	4 ->5
	1+1+1+1
	1+2+1
	1+1+2
	2+2
	2+1+1
	
	5 ->8
	1+1+1+1+1
	1+2+1+1
	1+2+2
	1+1+2+1
	1+1+1+2
	2+1+1+1
	2+2+1
	2+1+2
	 */

	public static void main(String[] args) {
		
		System.out.println(climbStairs(6));

	}
//method 1st
//	public static int  climbStairs(int n) {
//		if(n==1)
//			return 1;
//		if(n==2)
//			return 2;
//		else
//			return climbStairs(n-1)+climbStairs(n-2);
//}
	
	//method 2nd
	public static int  climbStairs(int n) {
		if(n<=0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		int oneStepBefore = 2;
		int twoStepBefore = 1;
		int currentStep =0;
		
		for (int i = 2; i < n; i++) {
			currentStep=oneStepBefore+twoStepBefore;
			twoStepBefore=oneStepBefore;
			oneStepBefore=currentStep;
		}
		return currentStep;
	}

}