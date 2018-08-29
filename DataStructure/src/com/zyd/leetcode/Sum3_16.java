package com.zyd.leetcode;

import java.util.Arrays;

public class Sum3_16 {
	public static void main(String[] args) {
		 
		int[] nums = new int[] {1,2,4,8,16,32,64,128};
		System.out.println(threeSumClosest(nums, 82));
		
	}
	
	 public static int threeSumClosest(int[] nums, int target) {
		 
		 if(nums == null || nums.length < 3) {
			 return 0;
		 }
		 
		 Arrays.sort(nums);
		 int min = 0, diff = Integer.MAX_VALUE;
		 int length = nums.length;
		 for(int i = 0; i < length - 2; i++ ) {
			 int left = i + 1, right = length-1;
			 while(left < right) {
				 int sum = nums[i] + nums[left] + nums[right];
				 int tem_diff = Math.abs(target - sum);
				 if(tem_diff < diff) {
					 diff = tem_diff;
					 min = sum;
				 }
				 
				 if(sum < target) {
					 left++;
				 }else if (sum > target) {
					 right--;
				 }else {
					 return sum;
				 }
			 }
		 }
		 
		 return min;
	        
	  }

}
