package com.zyd.leetcode;

public class Merge_k_Sorted_Lists_23 {

	
	public static void main(String[] args) {
//		ListNode l1 =  new ListNode(1);
//		ListNode[] lists = new ListNode[3];
//		lists[0] = l1;
//		l1.next = new ListNode(4);
//		l1.next.next = new ListNode(5);
//		
//		ListNode l2 = new ListNode(1);
//		l2.next = new ListNode(3);
//		l2.next.next = new ListNode(4);
//		lists[1] = l2;
//		
//		ListNode l3 = new ListNode(2);
//		l3.next = new ListNode(6);
//		lists[2] = l3;
//		
//		Merge_k_Sorted_Lists_23 ob = new Merge_k_Sorted_Lists_23();
//		ListNode res = ob.mergeKLists(lists);
//		
//		while(res != null) {
//			System.out.println(res.val);
//			res = res.next;
//		}
		
		
	}
	
	
	 public ListNode mergeKLists(ListNode[] lists) {
		 
		 	if(lists == null || lists.length == 0) {
		 		return null;
		 	}
		 	
		 	if(lists.length == 1) {
		 		return lists[0];
		 	}
	        return sort(lists, 0, lists.length -1);
	    }
	
	 public ListNode sort(ListNode[] lists, int left, int right) {
		 if(left < right) {
			 int mid = (left + right)/2;
			 ListNode l = sort(lists, left, mid);
			 ListNode r = sort(lists, mid+1, right);
			 return merge(l, r);
		 }
		 return lists[left];
	 }
	 
	 public ListNode merge(ListNode left, ListNode right) {
		 ListNode result = new ListNode(0);
		 ListNode header = result;
		 while(left != null && right != null) {
			 if(left.val < right.val) {
				 result.next = left;
				 left = left.next;
			 }else {
				 result.next = right;
				 right = right.next;
			 }
			 result = result.next;
		 }
		 
		 if(left == null) {
			 result.next = right;
		 }
		 if(right == null) {
			 result.next = left;
		 }
		 return header.next;
	 }
	public class ListNode {
		    int val;
		    ListNode next;
		    ListNode(int x) { val = x; }
		}
	 
	
}
////Definition for singly-linked list.
//	public class ListNode {
//		    int val;
//		    ListNode next;
//		    ListNode(int x) { val = x; }
//		}
