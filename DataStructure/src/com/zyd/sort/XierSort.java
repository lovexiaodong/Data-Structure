package com.zyd.sort;

public class XierSort {

	public static void main(String[] args) {
		int src[] = {4, 9, 8, 6, 2, 9, 1, 0, 9, 3, 4, 21, 34, 44, 55, 66, 32, 2, 1, 4, 6 ,100, 33, 1000};
//		sort(src);
		insertSort(src);
		for (int i : src) {
			System.out.println(i);
		}
	}
	
	public static void insertSort(int[] src) {
		if(src == null || src.length <= 1) {
			return;
		}
		
		for(int i = 1; i < src.length;i++) {
			for(int j = i; j > 0; j--) {
				if(src[j] <src[j-1] ) {
					int temp = src[j];
					src[j] = src[j-1];
					src[j-1] = temp;
				}
			}
		}
	}
	
	
	public static void sort(int[] src) {
		if(src == null || src.length <= 1) {
			return;
		}
		
		int h = src.length /2;
		
		while(h >= 1) {
			for(int i = h; i < src.length; i++) {
				
				for(int j = i; j >= h && src[j-h] > src[j]; j-=h) {
						int temp = src[j-h];
						src[j-h] = src[j];
						src[j] = temp;
				}
			}
			h = h /2;
		}
	}
}
