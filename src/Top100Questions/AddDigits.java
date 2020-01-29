package Top100Questions;

public class AddDigits {
	//DIGITAL ROOT
	/*
	 * Given a non-negative integer num, repeatedly add all its digits until the
	 * result has only one digit.
	 * 
	 * Example:
	 * 
	 * Input: 38 
	 * Output: 2 
	 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
	 * Since 2 has only one digit, return it. Follow up: Could you do it without any
	 * loop/recursion in O(1) runtime?
	 */






	public static void main(String[] args) {

	}

	private static int addDigits(int num) {
		return num==0?0:(num%9==0?9:(num%9));
	}

}
