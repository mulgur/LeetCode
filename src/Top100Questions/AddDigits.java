package Top100Questions;

public class AddDigits {
	//DIGITAL ROOT
	/*
	 * Given a non-negative integer num, repeatedly add all its digits until the
	 * result has only one digit.
	 * 
	 * Example:
	 * 
	 * Input: 38 Output: 2 Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
	 * Since 2 has only one digit, return it. Follow up: Could you do it without any
	 * loop/recursion in O(1) runtime?
	 */

//	int sayi ;
//	String s1;
//	String s2;
//	AddDigits asd;
//	AddDigits(int x){
//		this.sayi=x;
//	}
//	
//	
//	
//
//	public AddDigits() {
//		super();
//	}




	public static void main(String[] args) {
		//int sayi=7;
//		AddDigits add = new AddDigits();
//		System.out.println(add.s1.hash);
		
		
		
	//	System.out.println(addDigits(38));

	}

	private static int addDigits(int num) {
		return num==0?0:(num%9==0?9:(num%9));
	}

}
