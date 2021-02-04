package com.zyd.leetcode;

public class MaxSequence_300 {


    public static void main(String[] args) {


        MaxSequence_300 maxSequence300 = new MaxSequence_300();

        int[] num = new int[]{10,9,2,5,3,7,101,18};
//        int[] num = new int[]{0,1,0,3,2,3};
//        int[] num = new int[]{7,7,7,7,7,7,7};
        System.out.println(maxSequence300.lengthOfLIS(num));
    }

    public int lengthOfLIS(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }
        int[] index = new int[nums.length];


        for (int i = 0; i < nums.length; i++){
            index[i] = 1;
            for (int j = 0; j <= i; j++){

                if(nums[i] > nums[j] ){
                    index[i] = Math.max(index[i], index[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i< index.length; i++){
            max = Math.max(max, index[i]);
//            System.out.println( index[i]);
        }

        return max;
    }
}
