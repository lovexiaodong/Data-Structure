package com.zyd.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		int sort[] = {4, 9, 8, 6, 2, 9, 1, 0};
		bubbleSort2(sort);
		for (int i : sort) {
			
			System.out.println(i);
		}
	}
	
	
	
	public static void bubbleSort(int[] sort) {
		if(sort == null || sort.length <=0) {
			return;
		}
		for(int i = 0; i < sort.length; i++) {
			
			for(int j = sort.length-2; j >= i; j--) {
				if(sort[j+1] < sort[j]) {
					int temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
				}
			}
		}
	}
	

	/**
	 *设置一个变量，如果已经是有序的的了，就不用交换了
	 * @param sort
	 */
	public static void bubbleSort2(int[] sort) {
		if(sort == null || sort.length <=0) {
			return;
		}
		boolean isSwap = true;
		for(int i = 0; i < sort.length && isSwap; i++) {
			
			isSwap = false;
			for(int j = sort.length-2; j >= i; j--) {
				if(sort[j+1] < sort[j]) {
					isSwap = true;
					int temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
				}
			}
		}
	}
}
