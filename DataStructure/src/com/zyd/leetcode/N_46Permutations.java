package com.zyd.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_46Permutations {

    public static void main(String[] args) {
        int[] temp = {3,3,0,3};
        N_46Permutations permutations = new N_46Permutations();
        System.out.println(permutations.permute(temp));
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        if(nums == null || nums.length <= 0){
            return result;
        }
        Arrays.sort(nums);
        compat(nums, result, temp, index);
        return result;
    }


    public void compat(int[] nums,List<List<Integer>> result, List<Integer> temp, List<Integer> index){
        for (int i = 0; i < nums.length; i++){
          if(index.contains(i) || (i != 0 && nums[i-1] == nums[i]&& !index.contains(i-1))){
              continue;
          }else {
              temp.add(nums[i]);
              index.add(i);
              if(temp.size() == nums.length){
                  result.add(new ArrayList<>(temp));
                  temp.remove(temp.size()-1);
                  index.remove(index.size()-1);
              }else{
                  compat(nums, result, temp,index);
              }
          }
        }

        if(!temp.isEmpty()){
            temp.remove(temp.size()-1);
            index.remove(index.size()-1);
        }
    }
}
