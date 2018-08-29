package com.zyd.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3_15 {
	
	public static void main(String[] args) {
		
		int[] nums = {0, 0, 0, 0};
		
		List<List<Integer>> list = threeSum(nums);
		for (List<Integer> list2 : list) {
			
			System.out.println(list2.toString());
		}
	}
	
	 public static List<List<Integer>> threeSum(int[] nums) {
	        
		   if(nums == null || nums.length < 3) {
			   return null;
		   }
		 
		   List<List<Integer>> list = new ArrayList<>();
		  
		   Arrays.sort(nums);
		   
		   for(int i = 0; i < nums.length-2; i++) {
			   int index = nums[i];
			   
			   if(i != 0 && index == nums[i + 1]) {
				   continue;
			   }
			   for(int j = i + 1, k = nums.length - 1; j < nums.length && j < k ;) {
				  
				   if(index + nums[j] + nums[k] == 0) {
					   List<Integer> items = new ArrayList<>();
					   items.add(index);
					   items.add(nums[j]);
					   items.add(nums[k]);
					   
					   list.add(items);
					   
					   while(j < k && nums[j] == nums[++j]) {
					   }
					   while(j < k && nums[k] == nums[--k]) {
					   }
				   }else if( index + (nums[j] + nums[k]) < 0) {
					   k--;
				   }else {
					   j++;
				   }
			   }
		   }
		   
		   return list;
	    }

}
