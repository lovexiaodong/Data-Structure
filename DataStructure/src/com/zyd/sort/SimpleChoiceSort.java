package com.zyd.sort;

public class SimpleChoiceSort {

	
	public static void main(String[] args) {
		int sort[] = {4, 9, 8, 6, 2, 9, 1, 0};
		simpleChoiceSort(sort);
		for (int i : sort) {
			
			System.out.println(i);
		}
	}
	
	
	public static void simpleChoiceSort(int[] sort) {
		
		
		if(sort == null || sort.length <= 0) {
			return;
		}
		
		
		for(int i = 0; i < sort.length; i++) {
			int min = i;;
			for(int j = i+1; j < sort.length; j++) {
				if(sort[min] > sort[j]) {
					min = j;
				}
			}
			
			if(min != i) {
				int temp = sort[i];
				sort[i] = sort[min];
				sort[min] = temp;
			}
		}
	}
}
