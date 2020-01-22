package Top100Questions;

/**
 * Definition for singly-linked list.
 */
 class ListNode {
	int val;
	ListNode next;


	ListNode(int x) {
		val = x;
	}
}

public class Reverse_Linked_List {
	/*
	 * Reverse a singly linked list.
	 * 
	 * Example:
	 * 
	 * Input: 1->2->3->4->5->NULL 
	 * Output:5->4->3->2->1->NULL 
	 * 
	 * Follow up:
	 * 
	 * A linked list can be reversed either iteratively or recursively. Could you
	 * implement both?
	 */
	
	//iteratively
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;
		
		while(current!=null) {
			next = current.next;
			current.next=prev;
			prev=current;
			current = next;
		}
		return prev;
		  }
	
	//recursively
	public static ListNode reverseList2(ListNode head) {
		//base case
		if(head == null || head.next==null) {
			return head;
		}
		ListNode newHead = reverseList2(head.next);
		head.next.next=head;
		head.next=null;
		
		return newHead;
		
		  }

	public static void main(String[] args) {
		ListNode head = new ListNode(32);
		head.next = new ListNode(53);
		head.next = new ListNode(87);
		head.next = new ListNode(65);
		
		  
	
		
		}
	

	
	
	

}
