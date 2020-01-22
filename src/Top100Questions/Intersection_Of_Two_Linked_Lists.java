package Top100Questions;


public class Intersection_Of_Two_Linked_Lists {
	/*
	 * Write a program to find the node at which the intersection of two singly
	 * linked lists begins.
	 * 
	 * For example, the following two linked lists:
	 * 
	 * 
	 * begin to intersect at node c1.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA =
	 * 2, skipB = 3 Output: Reference of the node with value = 8
	 * 
	 * Input Explanation: The intersected node's value is 8 (note that this must not
	 * be 0 if the two lists intersect). From the head of A, it reads as
	 * [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes
	 * before the intersected node in A; There are 3 nodes before the intersected
	 * node in B.
	 * 
	 * Notes:
	 * 
	 * If the two linked lists have no intersection at all, return null. The linked
	 * lists must retain their original structure after the function returns. You
	 * may assume there are no cycles anywhere in the entire linked structure. Your
	 * code should preferably run in O(n) time and use only O(1) memory.
	 * 
	 */

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		 if(headA==null || headB==null) {
			 return null;
		 }
		 
		 ListNode a = headA;
		 ListNode b = headB;
		 
		 while(a!=b) {
			 
			 a = a == null ? headB : a.next;
			 b = b ==null ? headA : b.next;
		 }
		 
		 return a;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
