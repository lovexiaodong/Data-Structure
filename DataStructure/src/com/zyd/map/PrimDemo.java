package com.zyd.map;

/**
 * prim算法，由图生成最小生成树
 * @author 张玉栋
 *
 */
public class PrimDemo {

	private static int MAXVEX = 9;
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
		 
		 MiniPanTree_Prim(src);
	}
	 
	 public static void MiniPanTree_Prim(int[][] src) {
		
		 int min, i, j, k;
		 int adjvex[] = new int[MAXVEX];
		 int lowcast[] = new int[MAXVEX];
		 lowcast[0] = 0;
		 adjvex[0] = 0;
		 for(i = 1; i < src.length; i ++) {
			 lowcast[i] = src[0][i];
			 adjvex[i] = 0;
		 }
		 
		 
		 for(i = 1; i < src.length; i++) {
			 min = 65535;
			 j = 1; k =0;
			 while(j < src.length) {
				 if(lowcast[j] != 0 && lowcast[j] < min) {
					 min = lowcast[j];
					 k = j;
				 }
				 j++;
			 }
			 System.out.println("(" + adjvex[k] + "," + k + ")");
			 lowcast[k] = 0;
			 
			 for(j = 1; j < src.length; j++) {
				 if(lowcast[j] != 0 && src[k][j] < lowcast[j]) {
					 lowcast[j] = src[k][j];
					 adjvex[j] = k;
				 }
			 }
		 }
	 }
	 
	 
	 public static void MinTree_Src(int[][] src) {
		 int[] adjvex = new int[src.length];
		 int[] lowcost = new int[src.length];
		 int max = 65535;
		 adjvex[0] = 0;
		 lowcost[0] = 0;
		 int j = 0, k = 0, i = 0;
		 for(i = 1; i < src.length; i++) {
			 lowcost[i] = src[0][i];
			 adjvex[i] = 0;
		 }
		 
		 for(i = 1; i < src.length; i++) {
			 
			 max = 65535;
			 j = 1;
			 while(j < src.length) {
				 if(lowcost[j] != 0 && lowcost[j] < max) {
					 max = lowcost[j];
					 k = j;
				 }
				 j++;
			 }
			 
			 System.out.println("(" + adjvex[k] + ", " + k + ")");
			 
			 lowcost[k] = 0;
			 
			 for(j = 1; j < src.length; j++) {
				 
				 if(lowcost[j] != 0 && src[k][j] < lowcost[j]) {
					 lowcost[j] = src[k][j];
					 adjvex[j] = k; 
				 }
			 }
		 }
	 }
}
