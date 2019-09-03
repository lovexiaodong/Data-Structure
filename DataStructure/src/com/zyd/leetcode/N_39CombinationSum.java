package com.zyd.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_39CombinationSum {


    public static void main(String[] args) {
//        int[] candidates = {10,1,2,7,6,1,5};
        int[] candidates = {2,5,2,1,2};
        N_39CombinationSum sum = new N_39CombinationSum();
        System.out.println(sum.combinationSum(candidates, 5));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(candidates);
        search(candidates, target,0, result, temp);

        return result;
    }

    private void search(int[] candidates, int target, int start,
                        List<List<Integer>> result, List<Integer> temp ){
        for (int i = start; i <candidates.length;i++){
            int value = candidates[i];
            if(value < target){
                temp.add(value);
                search(candidates, target-value, i+1,result, temp);
            }else if(value == target){
                temp.add(value);
                List<Integer> list = new ArrayList<>(temp);
                if(!result.contains(list)){
                    result.add(list);
                }

                temp.remove(temp.size()-1);
            }

        }

        if(!temp.isEmpty()){
            temp.remove(temp.size()-1);
        }
    }
}
