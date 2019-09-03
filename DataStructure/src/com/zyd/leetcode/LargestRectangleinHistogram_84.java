package com.zyd.leetcode;

public class LargestRectangleinHistogram_84 {

    public static void main(String[] args) {
        int[] temp = {0, 9};
        System.out.println(largestRectangleArea(temp));
    }
    public static int largestRectangleArea(int[] heights) {

        if(heights == null || heights.length <= 0){
            return 0;
        }

        int max = 0;
        for (int i = 0; i < heights.length; i++ ){

            max = Math.max(max,heights[i]);

            int min = heights[i];
            for (int j = i-1; j >=0; j--){
                min = Math.min(heights[j], min);
                max = Math.max(min * (i - j + 1), max);
            }
        }

        return max;
    }
}
