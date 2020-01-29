package Top100Questions;

import java.util.Stack;

public class Valid_Parentheses {
	/*
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order. Note that an empty string is also considered
	 * valid.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: "()" Output: true
	 * 
	 * Example 2:
	 * 
	 * Input: "()[]{}" Output: true
	 * 
	 * Example 3:
	 * 
	 * Input: "(]" Output: false
	 * 
	 * Example 4:
	 * 
	 * Input: "([)]" Output: false
	 * 
	 * Example 5:
	 * 
	 * Input: "{[]}" Output: true
	 */
	static int counter = 0;

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				stack.push(')');
			} else if (ch == '{') {
				stack.push('}');
			} else if (ch == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != ch) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println();
		
		
		
		String str = "()";
		System.out.println(isValid(str));
		String str2 = "()[]{}";
		System.out.println(isValid(str2));
		String str3 = "(]";
		System.out.println(isValid(str3));
		String str4 = "([)]";
		System.out.println(isValid(str4));
		String str5 = "{[]}";
		System.out.println(isValid(str5));

		

	}

}
