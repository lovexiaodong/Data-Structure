package com.zyd.sort;

public class QuickSort {

	public static void main(String[] args) {
		int sort1[]  = {4, 9, 8, 6, 2, 9, 1, 0};
		QuickSort1(sort1);
		
		for (int i : sort1) {
			System.out.println(i);
		}
	}
	
	
	
	public static void  QuickSort1(int[] temp) {
	
		sort(temp, 0, temp.length);
	}
	
	public static void sort(int[] temp, int lo, int hi) {
		int mid = partion(temp, lo, hi);
		sort(temp, lo, mid-1);
		sort(temp, mid+1, hi);
	}
	public static int partion(int[] temp, int lo, int hi) {
		int key = temp[lo];
		int i = lo, j = hi;
		while(i < j) {
			while(temp[++i] < key && i < j) {
			}
			while(temp[--j] > key && i < j) {}
			if(i >= j) {
				break;
			}
			exchage(temp, i, j);
		}
		
		exchage(temp, lo, i);
		return i;
	}
	
	public static void exchage(int[] temp, int lo, int hi) {
		int t = temp[lo];
		temp[lo] = temp[hi];
		temp[hi] = t;
	}
}
