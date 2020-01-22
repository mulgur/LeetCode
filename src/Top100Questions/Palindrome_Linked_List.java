package Top100Questions;

import java.util.Stack;

public class Palindrome_Linked_List {
	/*
	 * Given a singly linked list, determine if it is a palindrome.
	 * 
	 * Example 1:
	 * 
	 * Input: 1->2 
	 * Output: false 
	 * 
	 * Example 2:
	 * 
	 * Input: 1->2->2->1 
	 * Output: true 
	 * 
	 * Follow up: Could you do it in O(n) time and
	 * O(1) space?
	 */

	/**
	 * Definition for singly-linked list.
	 * 
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	    public boolean isPalindrome(ListNode head) {
	        if(head==null || head.next==null) {
	        	return true;
	        }
	        ListNode slow = head;
	        ListNode fast = head;
	        Stack<Integer> s = new Stack<>();
	        while(fast!=null && fast.next!=null) {
	        	s.push(slow.val);
	        	slow = slow.next;
	        	fast = fast.next.next;
	        }
	        if(fast!=null) {
	        	slow = slow.next;
	        }
	        while(slow != null) {
	        	if(s.pop()!=slow.val) {
	        		return false;
	        	}
	        	slow = slow.next;
	        }
	        
	        return true;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
