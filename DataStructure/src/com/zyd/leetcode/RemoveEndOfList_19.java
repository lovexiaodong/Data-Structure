package com.zyd.leetcode;

public class RemoveEndOfList_19 {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		head.next = second;
		second.next = new ListNode(3);
		second = second.next;
		second.next = new ListNode(4);
		second.next.next = new ListNode(5);
		
		ListNode list = removeNthFromEnd(head, 2);
		System.out.println(list.val);
		while(list.next != null) {
			list = list.next;
			System.out.println(list.val);
		}
		
	}
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head == null) {
    		return head;
    	}
    	ListNode firstNode = head;
    	ListNode lastNode = head;
    	for(int i = 0; i < n -1; i++) {
    		if(lastNode.next != null) {
    			lastNode = lastNode.next;
    		}else {
    			return head;
    		}
    	}
    	
    	if(lastNode.next == null) {
    		return head.next;
    	}else {
    		lastNode = lastNode.next;
    	}
    	
    	while(lastNode.next != null) {
    		lastNode = lastNode.next;
    		firstNode = firstNode.next;
    	}
    	
    	
    	
    	firstNode.next = firstNode.next.next;
		
        return head;
    }
}


