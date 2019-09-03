package com.zyd.leetcode;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class n_9CombinationSum {
    private static int sum=0;
    public static void main(String[] args) {
//        n_9CombinationSum sum = new n_9CombinationSum();
//        int[] candidates = {1,3, 2, 4, 5};
//        System.out.println(sum.combinationSum(candidates, 6));
        eightQueen();
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        if(candidates == null || candidates.length <= 0){
            return result;
        }

        Arrays.sort(candidates);
        recursion(result, temp, candidates, 0, target);
        return result;

    }

    public boolean recursion(List<List<Integer>> result, List<Integer> temp,
                             int[] candidates, int start, int target){

        if(target < 0){
            return false;
        }else if(target == 0){
            result.add(new ArrayList<>(temp));
        }else{
            for (int k = start; k < candidates.length; k++ ){
                temp.add(candidates[k]);
                boolean res = recursion(result, temp, candidates, k+1, target -candidates[k]);
                temp.remove(temp.size()-1);
                if(!res){
                    break;
                }
            }
        }

        return true;
    }

    public static void eightQueen(){
        List<List<Point>> result = new ArrayList<>();
        recursionQueen(0, 8,result, new ArrayList<>());
        System.out.println(result.size());
    }

    /**
     *
     * @param row 代表的是行，从第一行还开始，第二个皇后在第二行，依次类推
     * @param n
     * @param result
     * @param list
     */
    public static void recursionQueen(int row, int n,List<List<Point>> result,List<Point> list){

        for(int j = 0 ;j < n ;j++){
            Point point = new Point(row, j);
            //检查是不是符合条件，如果符合添加，则添加到列表中
            boolean flag = checkPosition(point,list);
            if(flag){
                list.add(point);
                //如果不是8个则继续下一行的皇后的摆放
                if(list.size() != n){
                    recursionQueen(row + 1, n,result, list);
                }else{
                    //如果已经8个了则移除当前的皇后，继续检查当前行还有没有符合条件的
                    result.add(new ArrayList<>(list));
                   list.remove(list.size()-1);

                }
            }

        }

       //for循环结束，这一行已经遍历完了，则要回退到上一行接着遍历，
        // 移除上一行插入的最后一个元素，接着遍历下一个元素
        if(!list.isEmpty()){
            list.remove(list.size()-1);
        }
    }

    public static boolean checkPosition(Point point,List<Point> list){
        for (Point onePoint: list) {
            if(point.getX() == onePoint.getX() || point.getY() == onePoint.getY()){
                return false;
            }
            //检查是不是在对角线上，对角线的x和y的差的绝对值相等
            if(Math.abs(point.getX()-onePoint.getX()) == Math.abs(point.getY()-onePoint.getY())){
                return false;
            }
        }
        return true;
    }

}
