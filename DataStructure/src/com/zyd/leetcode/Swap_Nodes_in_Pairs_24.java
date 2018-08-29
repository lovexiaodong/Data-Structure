package com.zyd.leetcode;

public class Swap_Nodes_in_Pairs_24 {

	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		 head.next = new ListNode(2);
		 head.next.next = new ListNode(3);
		 head.next.next.next= new ListNode(4);
		 ListNode rsult = swapPairs(head);
		 while(rsult != null) {
			 System.out.println(rsult.val);
			 rsult= rsult.next;
		 }
	}
	
	 public static ListNode swapPairs(ListNode head) {
	        ListNode first = new ListNode(0);
	        first.next = head;
	        if(head != null && head.next != null) {
	        	first.next = head.next;
	        	head.next = head.next.next;
	        	first.next.next = head;
//	        	head = head.next;
	        	
	        }else {
	        	return head;
	        }
	        
	        while(head != null && head.next != null && head.next.next != null) {
	        	ListNode node = head;
	        	head = head.next;
	        	node.next = head.next;
	        	head.next = head.next.next;
	        	node.next.next = head;
	        	
	        }
	        return first.next;
	    }
	 
	 
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
}

