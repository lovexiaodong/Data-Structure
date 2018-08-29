package com.zyd.leetcode;

public class ReverseNodesinkGroup_25 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head = reverseKGroup(head,2);
		
		while(head!= null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	 public static ListNode reverseKGroup(ListNode head, int k) {
	     ListNode curr = head;
	     int count = 0;
	     while(curr != null && count < k) {
	    	 curr = curr.next;
	    	 count++;
	     }
	     
	     if(count == k) {
	    	 curr = reverseKGroup(curr, k);
	    	 
	    	 while(count>0) {
	    		 ListNode tmp = head.next;
	    		 head.next = curr;
	    		 curr = head;
	    		 head = tmp;
	    		 count--;
	    	 }
	    	 head = curr;
	    	 
	     }
	     return head;
		 
	    }

}

 


