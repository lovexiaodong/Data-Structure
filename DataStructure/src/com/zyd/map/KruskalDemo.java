package com.zyd.map;

public class KruskalDemo {

	public static int MAXVUE = 65535;
	
	public static void main(String[] args) {
		 int[][] src = {
				 {0, 10, 65535, 65535, 65535, 11, 65535, 65535, 65535},
				 {10, 0, 18, 65535, 65535, 65535, 16, 65535, 12},
				 {65535, 65535, 0, 22, 65535, 65535, 65535, 65535, 8},
				 {65535, 65535, 22, 0, 20, 65535, 65535, 16, 21},
				 {65535, 65535, 65535, 20, 0, 26, 65535, 7, 65535 },
				 {11, 65535, 65535, 65535, 26, 0, 17, 65535, 65535},
				 {65535, 16, 65535, 65535, 65535, 17, 0, 19, 65535},
				 {65535, 65535, 65535, 16, 17, 65535, 19, 0, 65535},
				 {65535, 12, 8, 21, 65535, 65535, 65535, 65535, 0}};
	}
	
	
	private class Node{
		public int start;
		public int end;
		public int weight;
		
		public Node() {}
		public Node(int start, int end , int weight) {
			this.start = start;
			this.end = end;
			this.weight = weight;
		}
	}
	
	public  void minPanTree_Kruskal(int[][] src) {
		//1. 转化节点
		Node[] node = null;
		for(int i= 0; i < src.length; i++) {
			for(int j = 0; j < src[i].length; j++) {
				if(src[i][j] != 0 && src[i][j] != MAXVUE) {
					if(node != null) {
						for(int k =0; k < node.length; k++) {
							
						}
					}else {
						node[i] = new Node(i, j, src[i][j]);
					}
				}
				
			}
		}
	}
}
