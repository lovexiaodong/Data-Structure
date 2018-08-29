package com.zyd.leetcode;

public class MergeTwoSortedLists_21 {

	
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
	ListNode head = new ListNode(0);
	ListNode next = head;
	while(l1 != null && l2 != null) {
		if(l1.val <= l2.val) {
			next.next = l1;
			l1 = l1.next;
		}else {
			next.next = l2;
			l2 = l2.next;
		}
		next = next.next;
	}
	
	if(l1 != null && l2 == null) {
		while(l1 != null) {
			next.next = l1;
			l1 = l1.next;
			next = next.next;
		}
	}
	if(l2 != null && l1 == null) {
		while(l2 != null) {
			next.next = l2;
			l2 = l2.next;
			next = next.next;
		}
	}
	
	return head.next;
    }
	
	  //Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
}
